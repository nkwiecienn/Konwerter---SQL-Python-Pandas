grammar SQLToPandas;

//tokeny

fragment S : [sS];
fragment E : [eE];
fragment L : [lL];
fragment C : [cC];
fragment T : [tT];
fragment F : [fF];
fragment R : [rR];
fragment O : [oO];
fragment M : [mM];
fragment W : [wW];
fragment H : [hH];
fragment I : [iI];
fragment N : [nN];
fragment B : [bB];
fragment U : [uU];
fragment K : [kK];
fragment A : [aA];
fragment X : [xX];
fragment J : [jJ];
fragment D : [dD];
fragment P : [pP];
fragment G : [gG];
fragment V : [vV];
fragment Q : [qQ];
fragment Y : [yY];

SELECT: S E L E C T;
FROM: F R O M;
WHERE: W H E R E;
IN: I N;
BETWEEN: B E T W E E N;
LIKE: L I K E;
IS_NULL: I S WS? N U L L;
AS: A S;
JOIN: J O I N;
USING: U S I N G;
AND: A N D;
OR: O R;
ORDER_BY: O R D E R WS? B Y;
GROUP_BY: G R O U P WS? B Y;
INNER: I N N E R;
LEFT: L E F T;
RIGHT: R I G H T;
ASC: A S C;
DESC: D E S C;
COUNT: C O U N T;
SUM: S U M;
AVG: A V G;
MAX: M A X;
MIN: M I N;
COMMA: ',';
LPAREN: '(';
RPAREN: ')';
DOT: '.';
NUMERICAL_VALUE: [0-9]+;
STRING_VALUE: '\'' (~['])* '\'';
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
WS: [ \t\r\n]+ -> skip;

//gramatyka

query
    : selectStatement (orderByStatement? groupByStatement?)?;


selectStatement
    : SELECT selectList FROM tableName whereClause? joinClause?;

/*
    tableReference (.joinClause)? ([ whereClause (COMMA selectList)? ] | selectList)
*/

selectList
    : '*'
    | selectItem (COMMA selectItem)*;

/*
    dla selectItem (COMMA selectItem)*:
    [ 'selectItem' (COMMA 'selectItem')* ]

    dla *:
    nic
*/

selectItem
    : columnReference
    | aggregateFunction;

/*
    dla columnReference: columnReference
    dla aggregateFunction: na końcu .aggregateFunction
*/

whereClause
    : WHERE condition;

/*
    po prostu: condition
*/

condition
    : expression
    | expression AND condition
    | expression OR condition
    | LPAREN condition RPAREN;

/*
    expressiom
    expression & expression
    expression | expression
*/

expression
    : columnReference operator value
    | columnReference operator columnReference
    | columnReference IN LPAREN valueList RPAREN
    | columnReference BETWEEN value AND value
    | columnReference LIKE value
    | columnReference IS_NULL;

/*
    tablename [ columnReference ] operator value
    tablename [ columnReference ] operator tablename [ columnReference ]
    tablename [ columnReference ].isin( valueList )
    tablename [ columnReference ].between(value, value)
    tablename [ columnReference ] == value
    tablename [ columnReference ].isnull()
*/

valueList
    : value (COMMA value)*;

joinClause
    : joinType JOIN tableName USING selectList
    | joinClause AND joinType JOIN tableName USING selectList;

/*
    join( tableName, on='selectList', how='joinType' )
*/

joinType
    : INNER
    | LEFT
    | RIGHT;

orderByStatement
    : ORDER_BY columnName (ASC | DESC)?;

/*
    sort_values(by=orderByList, axis=1, ascending=(True | False))
*/

groupByStatement
    : GROUP_BY columnReference (COMMA columnReference)*;

/*
    groupby(by=columnReference, axis=1, ascending=(True | False))
*/

aggregateFunction
    : (COUNT | SUM | AVG | MAX | MIN) LPAREN columnReference RPAREN;

/*
    agg({columnReference : ('count' | 'sum' | 'avg' | 'max' | 'min') })
*/

columnReference
    : (tableName DOT columnName)
    | columnName;

/*
    'columnName'
*/

tableName
    : IDENTIFIER;

value
    : NUMERICAL_VALUE
    | STRING_VALUE;

columnName
    : IDENTIFIER;

operator
    : '=' | '!=' | '<' | '>' | '<=' | '>=';

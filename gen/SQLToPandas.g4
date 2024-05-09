grammar SQLToPandas;

//tokeny

SELECT: 'SELECT';
FROM: 'FROM';
WHERE: 'WHERE';
IN: 'IN';
BETWEEN: 'BETWEEN';
LIKE: 'LIKE';
IS_NULL: 'IS NULL';
AS: 'AS';
JOIN: 'JOIN';
USING: 'USING';
AND: 'AND';
OR: 'OR';
ORDER_BY: 'ORDER BY';
GROUP_BY: 'GROUP BY';
INNER: 'INNER';
LEFT: 'LEFT';
RIGHT: 'RIGHT';
ASC: 'ASC';
DESC: 'DESC';
COUNT: 'COUNT';
SUM: 'SUM';
AVG: 'AVG';
MAX: 'MAX';
MIN: 'MIN';
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
    : ORDER_BY tableName (ASC | DESC)?;

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

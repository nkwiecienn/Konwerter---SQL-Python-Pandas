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
ON: 'ON';
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
    : (selectStatement (orderByStatement? groupByStatement?)?)*;


selectStatement
    : SELECT selectList FROM tableReference whereClause? joinClause?;

selectList
    : '*'
    | selectItem (COMMA selectItem)*;

selectItem
    : columnReference
    | aggregateFunction (AS alias)?;

tableReference
    : tableName
    | tableName AS alias;

whereClause
    : WHERE condition;

condition
    : expression
    | expression AND condition
    | expression OR condition
    | LPAREN condition RPAREN;

expression
    : columnReference operator value
    | columnReference operator columnReference
    | columnReference IN LPAREN valueList RPAREN
    | columnReference BETWEEN value AND value
    | columnReference LIKE value
    | columnReference IS_NULL;

valueList
    : value (COMMA value)*;

joinClause
    : joinType JOIN tableName ON condition
    | joinClause AND joinType JOIN tableName ON condition;

joinType
    : INNER
    | LEFT
    | RIGHT;

orderByStatement
    : ORDER_BY orderByList;

orderByList
    : columnReference (ASC | DESC)? (COMMA columnReference (ASC | DESC)?)*;

groupByStatement
    : GROUP_BY columnReference (COMMA columnReference)*;

aggregateFunction
    : (COUNT | SUM | AVG | MAX | MIN) LPAREN columnReference RPAREN;

columnReference
    : (tableName DOT columnName)
    | columnName;

tableName
    : (schemaName DOT)? IDENTIFIER;

value
    : NUMERICAL_VALUE
    | STRING_VALUE;

columnName
    : IDENTIFIER;

schemaName
    : IDENTIFIER;

alias
    : IDENTIFIER;

operator
    : '=' | '!=' | '<' | '>' | '<=' | '>=';

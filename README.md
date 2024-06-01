# Konwerter---SQL-Python-Pandas

***

## Autorzy: Natalia kwiecień, Oliwier Maj

<details>
    <summary>Dane kontaktowe:</summary>

* nkwiecien@student.agh.edu.pl
* majoliwier@student.agh.edu.pl

</details>

***

## 1. Opis projektu

- Celem tego projektu jest stworzenie translatora z SQL do biblioteki Pandas w Pythonie.
- Projekt implementowany jest w języku ```Java```.
- Gramatyka oraz generator parserów stworzone przy pomocy ```Antlr 4```.
- Projekt może być szczególnie przydatny dla inżynierów danych, którzy wolą pracować z SQL niż z komendami w Python
  Pandas.
- Wynikowy kod Python jest wyświetlany w formacie łatwym do skopiowania i użycia w analizach danych.

## 2. Struktura programu

- Gramatyka SQL została zdefiniowana w pliku `SQLToPandas.g4`. Na podstawie tej gramatyki ANTLR generuje skaner (
  lexer) `SQLToPandasLexer`, który rozbija zapytanie SQL na podstawowe jednostki (tokeny), takie jak słowa kluczowe,
  identyfikatory, operatory itp.
- Tokeny wygenerowane przez skaner są przekazywane do parsera `SQLToPandasParser`, który analizuje sekwencję tokenów i
  buduje strukturę (drzewo parsowania), przyporządkowując tokeny do odpowiednich konstrukcji gramatycznych.
- Parser, przy wsparciu klasy `SQLToPandasVisitor`, przetwarza drzewo parsowania i generuje równoważny kod w języku
  Python Pandas.
- Klasa `AntlrParser` w pakiecie converter wykorzystuje wygenerowane klasy lexer i parser oraz
  klasy `SQLToPandasListener` i `SQLToPandasVisitor`, aby przetworzyć zapytanie SQL i wygenerować odpowiedni kod Python
  Pandas.


## 3. Interface

![Basic GUI](src/main/resources/img.png)

## 4. Tokeny oraz gramatyka

<details>
    <summary>Lista tokenów:</summary>
<ul>
<div>

```
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
SEMICOLON: ';';
```

</div>
</ul>
</details>


<details>
    <summary>Gramatyka:</summary>
<ul>
<div>

```
query
    : selectStatement (orderByStatement? groupByStatement?)? SEMICOLON?;


selectStatement
    : SELECT selectList FROM tableName whereClause? joinClause?;

selectList
    : '*'
    | selectItem (COMMA selectItem)*;

selectItem
    : columnReference
    | aggregateFunction;

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
    : joinType JOIN tableName USING selectList
    | joinClause AND joinType JOIN tableName USING selectList;

joinType
    : INNER
    | LEFT
    | RIGHT;

orderByStatement
    : ORDER_BY columnName (ASC | DESC)?;

groupByStatement
    : GROUP_BY columnReference (COMMA columnReference)*;

aggregateFunction
    : (COUNT | SUM | AVG | MAX | MIN) LPAREN columnReference RPAREN;

columnReference
    : (tableName DOT columnName)
    | columnName;

tableName
    : IDENTIFIER;

value
    : NUMERICAL_VALUE
    | STRING_VALUE;

columnName
    : IDENTIFIER;

operator
    : '=' | '!=' | '<' | '>' | '<=' | '>=';
```

</div>
</ul>
</details>

## 5. Przykłady działania

Przed:

```
SELECT name, age
FROM employees
WHERE age > 30 AND department = 'Sales'
  OR age <= 25 AND department = 'HR'
ORDER BY age ASC
```

Po:

```
employees[(employees['age'] > 30) & (employees['department'] == 'Sales') | (employees['age'] <= 25) & (employees['department'] == 'HR')][['name', 'age']].sort_values(by='age', ascending=True)
```

## 6. Obsługa błędów

W przypadku wystąpienia błędów składniowych podczas parsowania zapytań SQL, konwerter wykorzystuje
klasę `CustomErrorListener`, która dziedziczy po `BaseErrorListener` z biblioteki ANTLR.

`CustomErrorListener` przechwytuje błędy składniowe i przechowuje je w liście. Każdy błąd zawiera informacje o linii,
pozycji znaku w linii oraz komunikat o błędzie. Dzięki temu możliwe jest łatwe monitorowanie i raportowanie problemów w
zapytaniach SQL.

## 7. Instrukcja obsługi

1. Po uruchomieniu ```GUI.java``` wyświetli się okno aplikacji.
2. Wprowadź zapytanie SQL w polu tekstowym po lewej stronie.
2. Kliknij przycisk "Convert".
3. Po prawej zostanie wygenerowany ten sam kod, ale w jezyku Python Pandas.
4. W przypadku napotkania błędu, zamiast wygenerowanego kodu, zostanie wyświetlona informacja o błędzie.

## 8. Przydatne informacje

- Konwerter nie jest czuły na wielkość znaków, tak jak w dialektach SQL.
- Konwerter obsługuje zapytanie takie jak:
    - **where** - filtruje wiersze na podstawie określonego warunku.
    - **join** - łączy różne tabele na podstawie określonych kolumn.
    - **order by** - sortuje wyniki według określonej kolumny.
    - **group by** - grupuje wyniki na podstawie określonych kolumn
    - **funkcje agregujące** - funkcje pozwaljące obliczyć np. max, min, średnią.



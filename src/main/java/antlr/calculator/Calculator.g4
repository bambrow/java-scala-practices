grammar Calculator;

line : expr EOF ;
expr : '(' expr ')' # parenExpr
     | expr '^' expr # power
     | expr ('*'|'/') expr # multOrDiv
     | expr ('+'|'-') expr # addOrSub
     | DOUBLE # double
     ;

WS : [ \t\n\r]+ -> skip ;
DOUBLE: DIGIT+ '.' DIGIT* EXPONENT?
     | '.' DIGIT+ EXPONENT?
     | DIGIT+ EXPONENT? ;

fragment DIGIT : '0'..'9' ;
fragment EXPONENT : ('e'|'E') ('+'|'-')? DIGIT+ ;

grammar g1;

options {
  language = Java;
}
@header {
  package compiler;
}


@lexer::header {
  package compiler;
}

 declstmt :  declaration+;
 declaration :  DATATYPE VARIABLE '=' CONSTANT ';' ; 
 DATATYPE : ('int'|'float');
 CONSTANT: ('0'..'9');
 VARIABLE: ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')*;
 
 WS: ' '+ {$channel=HIDDEN;};
 
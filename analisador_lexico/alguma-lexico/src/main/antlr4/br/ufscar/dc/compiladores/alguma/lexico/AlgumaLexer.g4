lexer grammar AlgumaLexer;


PALAVRA_CHAVE: 'algoritmo'| 'declare' | 'literal' | 'inteiro'| 'leia' |'escreva'|
                'real'|'logico'| 'se' |'entao' | 'senao'|'fim_se'| 'e' | 'ou'|
                 '..'| 'caso' | 'seja' | 'fim_caso'| 'para' | 'ate' | 'faca' |
                 'fim_para'| 'enquanto' | 'fim_enquanto'| '&'| '^'| 'registro'|
                 'fim_registro'| 'tipo'| 'procedimento' | 'fim_procedimento'|
                 'var' | 'funcao' | 'fim_funcao'| 'retorne'| 'constante' |
                 'falso' | 'nao' | 'verdadeiro'|
                 'fim_algoritmo' ;

NUM_INT: ('0'..'9')+;

NUM_REAL: ('0'..'9')+ '.' ('0'..'9')+;

IDENT: ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' |'0'..'9'| '_')*;

ATRIB: '<-';

OP_REL: '>' | '>=' | '<' | '<=' | '<>' | '=';

OP_ARIT: '+' | '-' | '*' | '/' | '%';

DELIM: ':';

ABRECHA: '[';

FECHACHA: ']';



ABREPAR: '(';

FECHAPAR: ')';

VIRG: ',';

PONT: '.';

CADEIA: '"' (ESC_SEQ | ~('"' | '\\' |'\n') )* '"';

CADEIA_NFECHADA: '"' (ESC_SEQ | ~('"' | '\\') )* '\n';

fragment
ESC_SEQ: '\\"';
 


COMENTARIO: '{'  ~('\n')*? '}' -> skip;

COMENT_ERRADO: '{'  ~('}')* '\n';

WS: (' ' | '\t' | '\r' ) -> skip;

PULAL: ('\n') -> skip;





ERRO: .;


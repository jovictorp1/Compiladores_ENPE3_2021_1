/*
 * Autores: João Victor Pacheco RA: 594970
 
 *
 *Para compilar: 
 * - Clique em File > Open Project 
 * - Selecione o diretório onde você salvou o projeto, clique no nome do
 * - projeto "alguma-lexico" e clique em Open Project
 * - Selecione o projeto 'alguma-sintatico' na aba Projects
 *   (caso você tenha outros projetos nessa aba), clique com o botão direito
 *   no nome do projeto e selecione "Build"  (ou "Clean and Build" caso seja a
 *   primeira vez que for executar).
 *
 */

/*grammar NSQL;*/
grammar Alguma;


@header{
import br.ufscar.dc.compiladores.alguma.sintatico.Arquivo;
}



/* Palavras reservadas do compilador */

DATE: 'DATA' | 'data' | 'Data';

PROCSQL: 'PROC SQL;' | 'proc sql;';

QUIT: 'QUIT;' | 'quit;';

CREATETABLE: 'CREATE TABLE' | 'create table';

SELECT: 'SELECT' | 'select';

fragment
ESC_SEQ:  '\\"';

PV: ';';

FORMAT: 'varchar' | 'date9.' | 'integer' | 'real';

OPERADOR: '='| '>'| '<' | '>='| '<='| '<>';

INT:  ('0'..'9')+;

REAL:  ('0'..'9')+ ('.' ('0'..'9')+)?;

VARCHAR: '"' (ESC_SEQ | ~('"' | '\n') )* '"'; 

ERROR_VARCHAR: '"' (ESC_SEQ | ~('"') )* '\n';

BOOLEAN: 'TRUE'| 'FALSE' | 'true' | 'false';

DATE9: '0'..'9' '0'..'9' MES '0'..'9' '0'..'9' '0'..'9' '0'..'9';

MES: 'JAN' | 'FEB' | 'MAR' | 'APR' | 'MAY'| 'JUN' | 'JUL'|
     'AUG' | 'SEP' | 'OCT' | 'NOV' | 'DEC';

AS: 'AS' | 'as';





FROM : 'FROM' | 'from';

WHERE: 'WHERE' | 'where';

AND: 'AND' | 'and';

INSERT: 'INSERT INTO' | 'insert into';

DROPTABLE: 'DROP TABLE' | 'drop table';



ABREPARCH:  '(' | '[';

FECHAPARCH:  ')' | ']';

DELETE: 'DELETE FROM' | 'delete from';

EXPORT: 'EXPORT' | 'export';

VALUES: 'VALUES' | 'values';

FILEPATH: 'FILEPATH=' | 'filepath=';

FILETYPE: 'FILETYPE=' | 'filetype=';
FILENAME: 'FILENAME=' | 'filename=';

type_file: 'XLSX' | 'CSV' | 'TXT' ;
IDENT:     ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'-')*;
COMENTARIO:    '{' ~('\n'|'\r'|'}'|'{')* '\r'? '}' { skip(); };

WS:   (' ' | '\t' | '\r' | '\n') { skip(); };



// script

program: 'PROC SQL;' query 'QUIT;'; 

query: cmd*;

cmd: cmd_create| cmd_select | cmd_insert | cmd_drop | cmd_delete |cmd_export;

cmd_create:  CREATETABLE IDENT AS def_column(';' def_column)* ';' 
             /* |CREATETABLE IDENT AS cmd_select ';'*/ ;

def_column: IDENT ':' FORMAT length?;

length: ABREPARCH INT FECHAPARCH;

cmd_select: SELECT IDENT(',' IDENT)* FROM IDENT cmd_where? ';';

cmd_where: WHERE IDENT OPERADOR val_input (AND IDENT OPERADOR val_input)*;

cmd_insert: INSERT IDENT ABREPARCH IDENT(',' IDENT)* FECHAPARCH VALUES
ABREPARCH val_input(',' val_input)* FECHAPARCH cmd_where? ';'; 

cmd_drop: DROPTABLE IDENT ';';

cmd_delete: DELETE IDENT cmd_where ';';

cmd_export: EXPORT IDENT ';' FILEPATH val_input ';' FILENAME val_input ';' FILETYPE type_file ';';


val_input: INT | REAL | VARCHAR | DATE9 | BOOLEAN;



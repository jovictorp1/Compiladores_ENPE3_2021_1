/* Trabalho 4 - Linguagem SASQL
 * Autores: João Victor Pacheco RA: 594970
 * SASQL - Small Adapted Structured Query Language
 *
 * Linguagem criada baseada em algumas funcionalidades do SQL
 * para o trabalho 4 da disciplina de Construção de Compiladores
 * Projeto ainda inacabado, feito utilizando como esqueleto os projetos
 * da disciplina
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

/*grammar SASQL;*/
grammar Alguma;


@header{
import br.ufscar.dc.compiladores.alguma.sintatico.Arquivo;
}



/* Palavras reservadas do compilador */

DATE: 'DATA' | 'data' | 'Data'; 

PROCSQL: 'PROC SQL;' | 'proc sql;';

QUIT: 'QUIT;' | 'quit;';

CREATETABLE: 'CREATE TABLE' | 'create table'; //comando para criacao de tabelas

SELECT: 'SELECT' | 'select'; //comando para fazer consulta em tabelas

fragment
ESC_SEQ:  '\\"';

PV: ';'; //ponto e virgula 

FORMAT: 'varchar' | 'date9.' | 'integer' | 'real'; // formatos aceitos 
// sendo eles varchar: string de texto, date9: data no formato 'ddmmmyyyy'
// integer: numeros inteiros e real: numeros reais


OPERADOR: '='| '>'| '<' | '>='| '<='| '<>'; //operadores aritmeticos

INT:  ('0'..'9')+;  // regra para numeros inteiros

REAL:  ('0'..'9')+ ('.' ('0'..'9')+)?;      // regra para numeros reais

VARCHAR: '"' (ESC_SEQ | ~('"' | '\n') )* '"';   // regra para varchar

ERROR_VARCHAR: '"' (ESC_SEQ | ~('"') )* '\n'; // regra para quando varchar nao tem aspas fechadas


BOOLEAN: 'TRUE'| 'FALSE' | 'true' | 'false';  //valores booleanos

DATE9: '0'..'9' '0'..'9' MES '0'..'9' '0'..'9' '0'..'9' '0'..'9'; //regra para data

MES: 'JAN' | 'FEB' | 'MAR' | 'APR' | 'MAY'| 'JUN' | 'JUL'|    
     'AUG' | 'SEP' | 'OCT' | 'NOV' | 'DEC';             //declaracao de erros

AS: 'AS' | 'as';


FROM : 'FROM' | 'from';

WHERE: 'WHERE' | 'where';

AND: 'AND' | 'and';

INSERT: 'INSERT INTO' | 'insert into';  //para insercao

DROPTABLE: 'DROP TABLE' | 'drop table';  //para excluir tabela



ABREPARCH:  '(' | '[';
                            //abre e fecha parenteses e chaves
FECHAPARCH:  ')' | ']';

DELETE: 'DELETE FROM' | 'delete from';     //para deletar valores da tabela

EXPORT: 'EXPORT' | 'export';

VALUES: 'VALUES' | 'values';

FILEPATH: 'FILEPATH=' | 'filepath=';    //para caminho de export

FILETYPE: 'FILETYPE=' | 'filetype=';    //para tipo do arquivo exportado
FILENAME: 'FILENAME=' | 'filename=';    //para nome do arquivo exportado

type_file: 'XLSX' | 'CSV' | 'TXT' ;     // tipos aceitos para export

IDENT:     ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'-')*;

COMENTARIO:    '{' ~('\n'|'\r'|'}'|'{')* '\r'? '}' { skip(); };

WS:   (' ' | '\t' | '\r' | '\n') { skip(); };



// script

program: 'PROC SQL;' query 'QUIT;';   //formato que um programa deve atender

query: cmd*;    //query chama os comandos

cmd: cmd_create| cmd_select | cmd_insert | cmd_drop | cmd_delete |cmd_export; // definicao dos comandos

cmd_create:  CREATETABLE IDENT AS def_column(';' def_column)* ';' 
             /* |CREATETABLE IDENT AS cmd_select ';'*/ ;    //comando para criacao da tabela

def_column: IDENT ':' FORMAT length?;   //definindo os formatos das colunas da tabela criada

length: ABREPARCH INT FECHAPARCH;       //definindo o tamanho da coluna

cmd_select: SELECT IDENT(',' IDENT)* FROM IDENT cmd_where? ';';   //comando select (faz busca)

cmd_where: WHERE IDENT OPERADOR val_input (AND IDENT OPERADOR val_input)*; //comando condicional

cmd_insert: INSERT IDENT ABREPARCH IDENT(',' IDENT)* FECHAPARCH VALUES   //comando para inserir valores em tabelas
ABREPARCH val_input(',' val_input)* FECHAPARCH cmd_where? ';'; 

cmd_drop: DROPTABLE IDENT ';';  //comando para excluir uma tabela

cmd_delete: DELETE IDENT cmd_where ';';  //comando para deletar valor dentro de tabela

cmd_export: EXPORT IDENT ';' FILEPATH val_input ';' FILENAME val_input ';' FILETYPE type_file ';';
// comando para exportar a tabela em arquivo

val_input: INT | REAL | VARCHAR | DATE9 | BOOLEAN; //tipos aceitos



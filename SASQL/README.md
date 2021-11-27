# SASQL Compiler
#### Linguagem SASQL e Compilador criados para a disciplina de Contrução de Compiladores DC-UFSCar


## Sobre a Linguagem SASQL

A linguagem SASQL foi criada com o intuito de ser uma linguagem mais fácil e mais rápida para a 
extração e consulta de informações em bancos de dados e datamarts utilizando como base as linguagens
SQL hoje conhecidas. Ela por ser mais simplificada pode ser aprendida com maior facilidade, fazendo 
com que pessoas com pouco conhecimento em SQL aprendam ela de forma simples e rápida.

###### Para mais informações, assista ao vídeo de apresentação:

[![IMAGE ALT TEXT HERE](https://i9.ytimg.com/vi/xM_lOlCNAoM/mq1.jpg?sqp=CNz1hY0G&rs=AOn4CLCyUe2nTwUfgTjrVpNjtLwRC7l7Wg&retry=5)](https://youtu.be/xM_lOlCNAoM)

#### Utilização:

Alguns exemplos de códigos bem sucedidos:

Criação de Tabela:
```
PROC SQL;
CREATE TABLE clientes AS 

		cnpj:integer;
		razao_social: varchar(50);
    CNAE: integer;
    cidade: varchar(40);
QUIT;  
```
Inserção de dados na tabela:
```
PROC SQL;
INSERT INTO clientes(cnpj, razao_social, cnae, cidade) VALUES( 0, "BANCO DO BRASIL SA", 64212, "BRASILIA");
QUIT;
```
Exportando uma tabela para arquivo XLSX:
```
PROC SQL;
  EXPORT tabela2;
	FILEPATH= "/home/jovictorp1/";
	FILENAME= "tabela2";
	FILETYPE= XLSX;
QUIT;
```


 Para compilar: 
  - Clique em File > Open Project 
  - Selecione o diretório onde você salvou o projeto, clique no nome do
  - projeto "alguma-lexico" e clique em Open Project
  - Selecione o projeto 'alguma-sintatico' na aba Projects
    (caso você tenha outros projetos nessa aba), clique com o botão direito no nome do projeto e selecione "Build" 
    (ou "Clean and Build" caso seja a primeira vez que for executar).
 

Programas necessários: (baseados nos utilizados para o desenvolvimento)
        -Apache Netbeans IDE 11.2 
        -Máquina Virtual Java (mais recente)




(Utilizarei os termos em inglês, porém caso sua versão do Netbeans esteja em português, basta traduzir as opções selecionadas para o português).






Para compilar:
        -Abra o NetBeans IDE
        -Clique em File > Open Project 
                Selecione o diretório onde você salvou o projeto, clique no nome do projeto "SASQL" e clique em Open Project
        -Selecione o projeto 'alguma-sintatico' na aba Projects (caso você tenha outros projetos nessa aba), clique com o botão direito no nome do projeto e selecione "Build"  (ou "Clean and Build" caso seja a primeira vez que for executar).


--------------------------------------------------------------------------------------------------------------------------------------
        
Caso queira acessar ou editar o código fonte desse analisador Sintático, você pode explorar as pastas presentes na aba Files 


Programa Principal: Files> SASQL > src > main > java > br > ufscar > dc > compiladores > alguma > sintatico > Principal.java


Regras Lexicas: Files> SASQL> src > main > antlr4 > br > ufscar > dc > compiladores > alguma > sintatico > AlgumaLexer.g4


Tokens Gerados: Files> SASQL> target > generated-sources > antlr4 > AlgumaLexer.tokens

Manipulador de Arquivos: Files> SASQL > src > main > java > br > ufscar > dc > compiladores > alguma > Sintático > Arquivo.java

Manipulador de Erros: Files> SASQL> src > main > java > br > ufscar > dc > compiladores > alguma > Sintático > MeuErrorListener.java


--------------------------------------------------------------------------------------------------------------------------------------


Para executar:

Para executar deve-se usar o terminal. Nele você colocará o comando "java -jar" e em seguida colocar os 3 seguintes argumentos:

ARG1: caminho completo do arquivo analisador_SASQL.jar 
ARG2: caminho completo de um arquivo de entrada que você deseja analisar que esteja na linguagem LA
ARG3: caminho completo para um arquivo .txt de saída, onde o analisador Sintático irá salvar o output.

Exemplo: java -jar /home/usuario/Documents/analisador_SASQL.jar /home/usuario/Documents/arquivo_entrada.txt /home/usuario/Documents/temp/saida.txt


Após você colocar esse comando no terminal, você deve apertar "Enter" e o analisador Sintático irá salvar a saída para você no arquivo escolhido.




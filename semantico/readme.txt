Documentação Externa - Analisador Semantico


Autores: João Victor Pacheco RA:594970





Descrição: Projeto de um Analisador Semantico para a disciplina de Construção de Compiladores I, ministrada pelo professor Daniel Lucrédio no ENPE3  2021/1 - Projeto feito baseado nos exemplos de aula do professor.
Projeto feito baseado nos exemplos de aula do professor, por isso alguns nomes de classes são iguais aos do professor, pois fomos seguindo o vídeo e fazendo, junto com algumas modificações nos códigos.




Programas necessários: (baseados nos utilizados para o desenvolvimento)
        -Apache Netbeans IDE 11.2 
        -Máquina Virtual Java (mais recente)




(Utilizarei os termos em inglês, porém caso sua versão do Netbeans esteja em português, basta traduzir as opções selecionadas para o português).






Para compilar:
        -Abra o NetBeans IDE
        -Clique em File > Open Project 
                Selecione o diretório onde você salvou o projeto, clique no nome do projeto "Semantico" e clique em Open Project
        -Selecione o projeto 'semantico' na aba Projects (caso você tenha outros projetos nessa aba), clique com o botão direito no nome do projeto e selecione "Build"  (ou "Clean and Build" caso seja a primeira vez que for executar).


--------------------------------------------------------------------------------------------------------------------------------------
        
Caso queira acessar ou editar o código fonte desse analisador semantico, você pode explorar as pastas presentes na aba Files 


Programa Principal: Files> semantico > src > main > java > br > ufscar > dc > compiladores > semantico > Principal.java


Regras Lexicas: Files> Semantico > src > main > antlr4 > br > ufscar > dc > compiladores > semantico > Lexer.g4


Tokens Gerados: Files>Semantico > target > generated-sources > antlr4 > AlgumaLexer.tokens

Manipulador de Arquivos: Files> Semantico > src > main > java > br > ufscar > dc > compiladores >  Semantico > Arquivo.java

Manipulador de Erros: Files> Semantico > src > main > java > br > ufscar > dc > compiladores >  Semantico > MeuErrorListener.java


--------------------------------------------------------------------------------------------------------------------------------------


Para executar:
        Para executar deve-se usar o terminal. Nele você colocará o comando "java -jar" e em seguida colocar os 3 seguintes argumentos:
        
        ARG1: caminho completo do arquivo analisador_semantico.jar 
        ARG2: caminho completo de um arquivo de entrada que você deseja analisar que esteja na linguagem LA
        ARG3: caminho completo para um arquivo .txt de saída, onde o analisador Semantico irá salvar o output.
        
        Exemplo: java -jar /home/usuario/Documents/analisador_semantico.jar /home/usuario/Documents/arquivo_entrada.txt /home/usuario/Documents/temp/saida.txt
        
        
        Após você colocar esse comando no terminal, você deve apertar "Enter" e o analisador Semantico irá salvar a saída para você no arquivo escolhido.

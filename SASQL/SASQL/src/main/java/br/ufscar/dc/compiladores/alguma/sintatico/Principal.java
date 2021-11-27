/*
 * Trabalho 4 - Linguagem SASQL
 * Autores: João Victor Pacheco RA: 594970
 * SASQL - Small Adapted Structured Query Language
 *
 * Linguagem criada baseada em algumas funcionalidades do SQL
 * para o trabalho 4 da disciplina de Construção de Compiladores
 * Projeto ainda inacabado, feito utilizando como esqueleto os projetos
 * da disciplina. Funcionando parte do analisador lexico e sintatico
 * Não consegui terminar a tempo o restante do projeto. Mas comecei o desenvolvimento
 * da parte semantica dele, porém deixei o código comentado.
 *
 *Para compilar: 
 * - Clique em File > Open Project 
 * - Selecione o diretório onde você salvou o projeto, clique no nome do
 * - projeto "alguma-lexico" e clique em Open Project
 * - Selecione o projeto 'alguma-sintatico' na aba Projects
 *   (caso você tenha outros projetos nessa aba), clique com o botão direito
 *   no nome do projeto e selecione "Build"  (ou "Clean and Build" caso seja a
 *   primeira vez que for executar).
 */

package br.ufscar.dc.compiladores.alguma.sintatico;


import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;

import java.io.File;
import java.io.FileWriter;

/**
 * Classe principal responsável em iniciar a aplicação
 * @author JoaoPacheco
 */
public class Principal {
    
    /**
    * Função principal que inicializa o programa
    * @param args[0] Arquivo fonte do programa escrito na linguagem LA
    * @param args[1] Arquivo de saída com as informações geradas pelo analisador
    */
    public static void main(String args[]) throws IOException{
   
        // Cria o arquivo de saída
        Arquivo.createFile(args[1]); 
        // Abre o arquivo fonte que será analisado
        CharStream cs= CharStreams.fromFileName(args[0]);
        // Inicia o Objeto AlgumaLexer passando o arquivo fonte como parâmetro (Extends Lexer)
        AlgumaLexer lexer = new AlgumaLexer(cs);
        // Inicia a variável Token como null
        Token t = null;

        // Essa classe fornece acesso aos tokens
        CommonTokenStream tokens = new CommonTokenStream (lexer);
        
        AlgumaParser parser = new AlgumaParser(tokens);
        
        // Instancia a classe responsável em gerar o arquivo de saída
        MeuErrorListener errList = new MeuErrorListener();
        parser.removeErrorListeners();
        parser.addErrorListener(errList);
        parser.program(); //chama o programa do parser
    }
}
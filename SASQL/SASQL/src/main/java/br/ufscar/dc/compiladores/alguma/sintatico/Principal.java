/*
 * Analisador Sintatico (Principal)
 * Autores: João Victor Pacheco RA: 594970
 *
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
        parser.program();
    }
}
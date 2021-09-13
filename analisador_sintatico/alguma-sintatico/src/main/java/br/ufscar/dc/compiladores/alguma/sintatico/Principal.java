/*
 * Analisador Sintatico (Principal)
 * Autores: João Victor Pacheco RA: 594970
 *          Luan Batista da Silva RA: 725812
 *          Lucas Mathaeus Pereira RA: 726561
 * Descrição: Projeto de um Analisador Sintatico para a disciplina de Construção 
 * de Compiladores I, ministrada pelo professor Daniel Lucrédio no Semetre 
 * ENPE3 2021/1 - Projeto feito baseado nos exemplos de aula do professor, por
 * isso alguns nomes de classes são iguais aos do professor, pois fomos
 * seguindo o vídeo e fazendo, junto com algumas modificações nos códigos.
 *
 *Para compilar: 
 * - Clique em File > Open Project 
 * - Selecione o diretório onde você salvou o projeto, clique no nome do
 * - projeto "alguma-sintatico" e clique em Open Project
 * - Selecione o projeto 'alguma-sintatico' na aba Projects
 *   (caso você tenha outros projetos nessa aba), clique com o botão direito
 *   no nome do projeto e selecione "Build"  (ou "Clean and Build" caso seja a
 *   primeira vez que for executar).
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
        parser.programa();
    }
}
/*
 * Analisador Léxico 
 * Autores: João Victor Pacheco RA: 594970
 *          Luan Batista da Silva RA: 725812
 *          Lucas Mathaeus Pereira RA: 726561
 * Descrição: Projeto de um Analisador Léxico para a disciplina de Construção 
 * de Compiladores I, ministrada pelo professor Daniel Lucrédio no Semetre 
 * ENPE3 2021/1 - Projeto feito baseado nos exemplos de aula do professor, por
 * isso alguns nomes de classes são iguais aos do professor, pois fomos
 * seguindo o vídeo e fazendo, junto com algumas modificações nos códigos.
 *
 *Para compilar: 
 * - Clique em File > Open Project 
 * - Selecione o diretório onde você salvou o projeto, clique no nome do
 * - projeto "alguma-lexico" e clique em Open Project
 * - Selecione o projeto 'alguma-lexico' na aba Projects
 *   (caso você tenha outros projetos nessa aba), clique com o botão direito
 *   no nome do projeto e selecione "Build"  (ou "Clean and Build" caso seja a
 *   primeira vez que for executar).
 *
 */
package br.ufscar.dc.compiladores.alguma.lexico;

import java.io.IOException;
import java.io.File;
import java.io.PrintStream;
import java.io.LineNumberReader;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;


/*  Classe Principal responsável pela execução do Analisador Lexico */
public class Principal {
    public static void main (String args[]) throws IOException{
        CharStream cs = CharStreams.fromFileName(args[0]); /*Recebe o primeiro argumento passado (arquivo de input)*/
        AlgumaLexer lex = new AlgumaLexer(cs); /* Abre o arquivo em lex*/
        String path = args[1]; /*Recebe o segundo argumento (arquivo de saída)*/
        File file = new File(path);/* Abre o arquivo de saída em file*/
        Token t= null; /* Define uma variável token como Null*/
        
        
        PrintStream stream = new PrintStream(file); 
        /* Seta a escrita no arquivo de saída ao invés do terminal*/
        System.setOut(stream);
        
        /* Enquanto não for Final do arquivo, lê os proximos caracteres e executa o analisador seguindo as regras definidas no arquivo AlgumaLexer.g4*/
        while ((t=lex.nextToken()).getType() != Token.EOF){
            String buff = AlgumaLexer.VOCABULARY.getDisplayName(t.getType());
            if ( buff == "PALAVRA_CHAVE" | buff == "OP_ARIT" | buff == "OP_REL"){ /* Caso seja uma palavra chave, operador aritmético ou operador relacional, deve imprimir o que foi lido e o tipo deverá ter o mesmo nome do que foi lido*/
                System.out.println("<'"+t.getText()+"','"+t.getText()+"'>");
            }else{
            if (buff == "ERRO"){ /* Caso detecte um erro de simbolo não identificado, mostra a mensagem com a linha de ocorrencia e para execução*/
                System.out.println("Linha "+t.getLine()+": "+t.getText()+" - simbolo nao identificado");
                break;}
            else{
            if (buff == "COMENT_ERRADO"){ /* Caso detecte um comentario não fechado, mostra a mensagem com a linha de ocorrencia e para a execução */
                System.out.println("Linha "+t.getLine()+": comentario nao fechado");
                break;
            }
                else{
                    if (buff== "CADEIA_NFECHADA"){ /* Casp detecte uma cadeia literal não fechada na mesma linha, mostra a mensagem com a linha de ocorrência e para a execução*/
                        System.out.println("Linha "+t.getLine()+": cadeia literal nao fechada");
                        break;}
                    else{ /*Trata as outras regras léxicas*/
                        System.out.println("<'"+t.getText()+"',"+AlgumaLexer.VOCABULARY.getDisplayName(t.getType())+">");
                    }}}}
        }
    
    }
}



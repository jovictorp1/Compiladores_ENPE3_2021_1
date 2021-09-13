/*
 * Analisador Sintatico (Classe de Erro)
 * Autores: João Victor Pacheco RA: 594970
 *          Luan Batista da Silva RA: 
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
 * - projeto "alguma-lexico" e clique em Open Project
 * - Selecione o projeto 'alguma-sintatico' na aba Projects
 *   (caso você tenha outros projetos nessa aba), clique com o botão direito
 *   no nome do projeto e selecione "Build"  (ou "Clean and Build" caso seja a
 *   primeira vez que for executar).
 *
 */


package br.ufscar.dc.compiladores.alguma.sintatico;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;


/**
 * Manipula o arquivo de saída com os erros gerados
 * @author JoaoPacheco
 */
public class MeuErrorListener extends BaseErrorListener{
    public void syntaxError(Recognizer <?, ?> recognizer, Object offendingSymbol,
            int line, int charPositionInLine, String msg, RecognitionException e){
    
        Token t= (Token) offendingSymbol;
        String erro = t.getText();

        if(erro.equals("<EOF>"))
            erro = "EOF";

        Arquivo.AddString("Linha "+ line + ": erro sintatico proximo a "+ erro+ "\nFim da compilacao");
        Arquivo.gravaArquivo();
    }
}
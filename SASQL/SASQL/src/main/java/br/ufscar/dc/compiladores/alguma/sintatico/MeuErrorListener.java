/*
 * Analisador Sintatico (Classe de Erro)
 * Autores: João Victor Pacheco RA: 594970
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
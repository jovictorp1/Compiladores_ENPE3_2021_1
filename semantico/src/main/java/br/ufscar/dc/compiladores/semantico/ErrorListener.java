/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.dc.compiladores.semantico;
import br.ufscar.dc.compiladores.semantico.AlgumaLexer;
import org.antlr.v4.runtime.Token; 
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import java.io.PrintWriter;
import java.util.BitSet;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;



/**
 *
 * @author jovictorp1
 */
public class ErrorListener  implements ANTLRErrorListener{
    PrintWriter pw;
    public ErrorListener(PrintWriter pw) {
        this.pw = pw;
    }
    
    @Override
    public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
      //adicionado para evitar erros na compilacao
    }
    @Override
    public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
        //adicionado para evitar erros na compilacao
    }
    @Override 
    public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
        //adicionado para evitar erros na compilacao
    }
   @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        Token t = (Token) offendingSymbol;
        if (t.getText().equals("<EOF>")) { /* se problema perto de EOF*/
            pw.println("Linha " + line + ": erro sintatico proximo a EOF");
        } else { /* se nao imprime erro na linha */
            pw.println("Linha " + line + ": erro sintatico proximo a " + t.getText());
        }
        throw new RuntimeException("Linha " + line + ": erro sintatico proximo a " + t.getText());
    }
}

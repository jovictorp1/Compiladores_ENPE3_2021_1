/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.dc.compiladores.semantico;

import java.io.File;
import java.io.FileWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;
import org.antlr.v4.runtime.RecognitionException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;



/**
 *
 * @author jovictorp1
 */
public class Principal {
    static CharStream cs;
    static CommonTokenStream tokens;
    static AlgumaLexer lex;
    static PrintWriter pw;
 //   static SemantVisitor sv;
    
    public static void main(String args[]) throws IOException {

        /*passa o arquivo de entrada como parametro*/
        pw = new PrintWriter(new File(args[1]));

        /* executa o analisador lexico e o analisador sintatico*/
        if (lexer(args[0]) && parser(args[0])) {
            semantico(args[0]); /* executa o analisador semantico*/
        }
    }
    
    
        static boolean semantico(String file) throws IOException {try {
            /*inicia charstream*/
            cs = CharStreams.fromFileName(file);
            
            lex = new AlgumaLexer(cs);
            
            tokens = new CommonTokenStream(lex);
            
            AlgumaParser parser = new AlgumaParser(tokens);
            
         //   ProgramaContext   = parser.programa();
             
     //       sv = new SemanticVisitor();
            
      //      sv.visitPrograma(tree); /* passa pela arvore*/
            
            SemanticoUtils.errosSemantico.forEach((s) -> pw.write(s + "\n"));
            
            pw.write("Fim da compilacao\n");
            
            pw.close();
            return true;
        } catch (IOException | RecognitionException e) {
            return false;
        }
    }

            static boolean parser(String file) throws IOException {try {
            cs = CharStreams.fromFileName(file);
            lex = new AlgumaLexer(cs);
            tokens = new CommonTokenStream(lex);
            AlgumaParser parser = new AlgumaParser(tokens);
            
            ErrorListener el = new ErrorListener(pw); /* instanciacao do ErrorListener*/

            parser.removeErrorListeners();  /* Tira os default*/

            parser.addErrorListener(el); /* passa o error listener como param para add*/
            
            parser.programa();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return false;

    }
        
        static boolean lexer(String file) throws IOException {
        cs = CharStreams.fromFileName(file);
        lex = new AlgumaLexer(cs);
        tokens = new CommonTokenStream(lex);

        Token token;
        boolean error = false;

        OUTER:
        while ((token = lex.nextToken()).getType() != Token.EOF) { /* enquanto nao eh fim do arquivo */
            System.out.println(token.getText());
            String symbolicName = AlgumaLexer.VOCABULARY.getSymbolicName(token.getType());
            if (symbolicName == null) {
                continue;
            }
            switch (symbolicName) {
                case "CADEIA_NFECHADA": /* caso a cadeia nao tenha sido fechada*/
                    pw.write(String.format("Linha %d: cadeia literal nao fechada\n", token.getLine()));
                    error = true;
                    break OUTER;
                
                case "COMENT_ERRADO": /* comentario errado*/
                    pw.write(String.format("Linha %d: comentario nao fechado\n", token.getLine()));
                    error = true;
                    break OUTER;
                case "ERRO": /* Erro final nenhum simbolo foi identificado*/ 
                    pw.write(String.format("Linha %d: %s - simbolo nao identificado\n", token.getLine(), token.getText()));
                    error = true;
                    break OUTER;
                default:
                    break;
            }
        }
        if (error) {
            return false;
        }
        return true;
    }
    
}

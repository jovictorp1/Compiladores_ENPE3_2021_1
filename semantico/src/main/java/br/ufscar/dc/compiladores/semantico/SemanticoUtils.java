/*
 */
package br.ufscar.dc.compiladores.semantico;

import br.ufscar.dc.compiladores.semantico.TabelaDeSimbolos.TipoVar;
import org.antlr.v4.runtime.Token;
import java.util.List;
import java.util.ArrayList;



/** 
 *
 * @author jovictorp1
 */
public class SemanticoUtils {

    public static List<String> errosSemantico = new ArrayList<>();

    public static void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        errosSemantico.add(String.format("Linha %d: %s", linha, mensagem));
    }

    public static TabelaDeSimbolos.TipoVar verificarTipo(String strTipoVar, boolean isPointer) {
        TabelaDeSimbolos.TipoVar tipoVar = TipoVar.INVALIDO;
        switch (strTipoVar) {
            case "inteiro":
                if (isPointer) {
                    tipoVar = TipoVar.PONTEIRO_INTEIRO;
                } else {
                    tipoVar = TipoVar.INTEIRO;
                }
                break;
            case "real":
                if (isPointer) {
                    tipoVar = TipoVar.PONTEIRO_REAL;
                } else {
                    tipoVar = TipoVar.REAL;
                }
                break;
            case "logico":
                if (isPointer) {
                    tipoVar = TipoVar.PONTEIRO_LOGICO;
                } else {
                    tipoVar = TipoVar.LOGICO;
                }
                break;
                           
            case "literal":
                if (isPointer) {
                    tipoVar = TipoVar.PONTEIRO_LITERAL;
                } else {
                    tipoVar = TipoVar.LITERAL;
                }
                break;
            
            default:
                break;
           
        }
        return tipoVar;
    }
}
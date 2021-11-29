/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.dc.compiladores.semantico;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author jovictorp1
 */


public class TabelaDeSimbolos {

    public enum TipoVar {
        INTEIRO,
        REAL,
        LOGICO, 
        LITERAL,
        INVALIDO,
        
        PONTEIRO_INTEIRO,
        PONTEIRO_REAL,
        PONTEIRO_LOGICO,
        PONTEIRO_LITERAL,
        TIPO,
        REGISTRO
        
    }

    class EntradaTabelaDeSimbolos {

        String name;
        TipoVar tipo;
        List<String> parametrosNome;
        List<TipoVar> parametrosTipo;

        public EntradaTabelaDeSimbolos(String name, TipoVar tipo) {
            this.name = name;
            this.tipo = tipo;
        }
        
        public EntradaTabelaDeSimbolos(String name, TipoVar tipo, List<String> parametrosNome, List<TipoVar> parametrosTipo) {
            this.name = name;
            this.tipo = tipo;
            this.parametrosNome = parametrosNome;
            this.parametrosTipo = parametrosTipo;
        }
    }

    private final Map<String, EntradaTabelaDeSimbolos> tabela;

    public TabelaDeSimbolos() { 
        this.tabela = new HashMap<>();}

    public void adicionar(String name, TipoVar tipo) {
        tabela.put(name, new EntradaTabelaDeSimbolos(name, tipo));
    }

    public void adicionar(String name, TipoVar tipo, List<String> parametrosNome, List<TipoVar> parametrosTipo) {
        tabela.put(name, new EntradaTabelaDeSimbolos(name, tipo, parametrosNome, parametrosTipo));
    }

    public boolean existe(String name) {
        return tabela.containsKey(name);
    }
    
    public boolean existe(String funcao, String parametro) {
        List<String> parametrosNome = tabela.get(funcao).parametrosNome;
        
        return parametrosNome.contains(parametro);
    }

    public TipoVar verificar(String name) {
        if(tabela.get(name) == null)
            return TipoVar.INVALIDO;
        
        return tabela.get(name).tipo;
    }
    
    public EntradaTabelaDeSimbolos recuperar(String name){
        return tabela.get(name);
    }
}

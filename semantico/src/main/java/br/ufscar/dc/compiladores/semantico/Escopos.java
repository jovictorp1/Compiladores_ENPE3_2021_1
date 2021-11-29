/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.dc.compiladores.semantico; 

import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author jovictorp1
 */
public class Escopos {
    private LinkedList<TabelaDeSimbolos> pilhaDeTabelas;

    public Escopos(){
        pilhaDeTabelas = new LinkedList<>();
        criarNovoEscopo();
    }

    public void criarNovoEscopo(){
        pilhaDeTabelas.push(new TabelaDeSimbolos());
    }

    public TabelaDeSimbolos obterEscopoAtual() {
        return pilhaDeTabelas.peek();
    }

    public List<TabelaDeSimbolos> percorrerEscoposAninhados (){
        return pilhaDeTabelas;
    }

    public void abandonarEscopo(){
        pilhaDeTabelas.pop();
    }
}

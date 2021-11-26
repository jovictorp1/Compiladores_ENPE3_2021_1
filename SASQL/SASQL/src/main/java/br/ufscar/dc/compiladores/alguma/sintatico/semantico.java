/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.dc.compiladores.alguma.sintatico;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author jovictorp1
 */
public class semantico {
    
    public class Table{
        
        String nome;
        
        ArrayList<Field> campos;
        
        public Tabela(String nome, ArrayList<Field> campos) {     
            this.nome = nome;
            this.campos = campos;
            
        }
        
    }
    
    public class Field{
        String nome;
        int tamanho;
        Type tipo;
        
        public Field(String nome, int tamanho, Type tipo){
        this.nome = nome;
        this.tamanho = tamanho;
        this.tipo = tipo;
        }
    }
    
    public enum Type {
        INT, REAL, VARCHAR, DATE9, BOOLEAN
    
    }
    
    ArrayList<Table> tabelas;
    
    public SQLSemantico(){
        tabelas = new ArrayList<>();
    }
    
    
    private Type charToType(String text){
        
        switch(text){
            case "INT": return Type.INT;
            case "REAL": return Type.REAL;
            case "VARCHAR" return Type.VARCHAR;
            case "DATE9" return Type.DATE9;
            case "BOOLEAN" return Type.BOOLEAN;
                  
        }
        return null;   
    }
    
    private get_tabelaNome (String name){
        for(var tabela: this.tabelas){
            if(tabela.name.equals(nome)){
                return tabela;
            }
        }
        return null
    }
    
    
    
    
    
    
}

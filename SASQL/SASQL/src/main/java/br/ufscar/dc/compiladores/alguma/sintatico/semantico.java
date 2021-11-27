/*
 * Trabalho 4 - Linguagem SASQL
 * Autores: João Victor Pacheco RA: 594970
 * SASQL - Small Adapted Structured Query Language
 * 
 * O Analisador Semantico não consegui completá-lo, porém deixei o código 
 * que eu estava desenvolvendo aqui comentado para no futuro poder trabalhar
 * no mesmo.
 * Espero um dia ter a possibilidade de terminá-lo pois eu tinha boas ideias
 * mas que por conta de estar só, não consegui desenvolver todas
 * 
 *
 */
package br.ufscar.dc.compiladores.alguma.sintatico;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author jovictorp1
 */

/*
public class semantico {
    
    public class Table{
        
        String nome;
        
        ArrayList<Field> campos;
        // Definicao da tabela
        public Tabela(String nome, ArrayList<Field> campos) {     
            this.nome = nome;
            this.campos = campos;
            
        }
        
    }
    // Definicao do Campo
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
    // Enumerado do Tipo de variavel
    public enum Type {
        INT, REAL, VARCHAR, DATE9, BOOLEAN
    
    }
    
    ArrayList<Table> tabelas;
    
    public SQLSemantico(){
        tabelas = new ArrayList<>();
    }
    
    // Aqui eu pego o texto em char e seto a ele um tipo do enumerado
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
    //Aqui eu pego a tabela pelo nome
    private get_tabelaNome (String name){
        for(var tabela: this.tabelas){
            if(tabela.name.equals(nome)){
                return tabela;
            }
        }
        return null
    }
    
    
    
    
    
    
}
*/
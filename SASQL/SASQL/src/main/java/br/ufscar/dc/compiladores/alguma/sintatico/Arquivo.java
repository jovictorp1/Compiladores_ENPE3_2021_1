/*
 * Trabalho 4 - Linguagem SASQL
 * Autores: João Victor Pacheco RA: 594970
 * SASQL - Small Adapted Structured Query Language
 *
 * Linguagem criada baseada em algumas funcionalidades do SQL
 * para o trabalho 4 da disciplina de Construção de Compiladores
 * Projeto ainda inacabado, feito utilizando como esqueleto os projetos
 * da disciplina. Funcionando parte do analisador lexico e sintatico
 * Não consegui terminar a tempo o restante do projeto. Mas comecei o desenvolvimento
 * da parte semantica dele, porém deixei o código comentado.
 *
 *Para compilar: 
 * - Clique em File > Open Project 
 * - Selecione o diretório onde você salvou o projeto, clique no nome do
 * - projeto "alguma-lexico" e clique em Open Project
 * - Selecione o projeto 'alguma-sintatico' na aba Projects
 *   (caso você tenha outros projetos nessa aba), clique com o botão direito
 *   no nome do projeto e selecione "Build"  (ou "Clean and Build" caso seja a
 *   primeira vez que for executar).
 */
package br.ufscar.dc.compiladores.alguma.sintatico;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Classe responsável em criar e manipular arquivos
 * @author JoaoPacheco
 */
public class Arquivo{

    // Buffer do arquivo informado pelo usuário
    public static StringBuffer arquivo = new StringBuffer(); 
    // Caminho do arquivo informado pelo usuário
    public static String filePath;                           
    
    
    public static void AddString(String texto){
        arquivo.append(texto).append("\n");
    }
    
    
    public static String getTexto(){
        return arquivo.toString();
    }
    
    public static void createFile(String caminho){
        filePath = caminho;
    }
    
 
    public static void gravaArquivo(){
        
        try {
            Files.writeString(Paths.get(filePath), getTexto());
        } 
        catch (IOException e) {
        }
        
        System.exit(0);

    }    
    
}

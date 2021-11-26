/*
 * Analisador Sintatico (Manipulador de Arquivo)
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

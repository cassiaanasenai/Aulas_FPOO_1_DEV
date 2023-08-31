/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjetos;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;


public class RedeSocial implements ClassificacaoPost{
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true,"UTF-8"));
        
        PostsRedeSocial post1 = new PostsRedeSocial("Vendo fogão 4 bocas, seminovo. Preço na bio!!", 3, NORMAL);
        PostsRedeSocial post2 = new PostsRedeSocial("Venha conhecer nosso espaço Acãochego, onde seu pet, é a prioridade!", 200, LEGAL);
        PostsRedeSocial post3 = new PostsRedeSocial("Receita de Bolo de Cenoura delicioso feito pela aluna Ana Cássia, com apenas 6 ingredientes. Confira a receita logo abaixo!", 1000, SUPER_LEGAL);
        
        System.out.println("Post 1 - Descrição: " + post1.descricao + " Estrelas: " + post1.estrelas + " (Normal) Número de comentários: " +post1.numeroComentarios);
        System.out.println(".........................................................................................................................................................................................................");
        System.out.println("Post 2 - Descrição: " + post2.descricao + " Estrelas: " + post2.estrelas + " (Legal) Número de comentários: " + post2.numeroComentarios);
        System.out.println(".........................................................................................................................................................................................................");
        System.out.println("Post 3 - Descrição: " + post3.descricao + " Estrelas: " + post3.estrelas + " (Super Legal) Número de comentários: " + post3.numeroComentarios);
        System.out.println(".........................................................................................................................................................................................................");
        
       


        
    }
    
}

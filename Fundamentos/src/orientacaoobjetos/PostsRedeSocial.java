/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjetos;


public class PostsRedeSocial {
    String descricao;
    int numeroComentarios;
    int estrelas;
    
    public PostsRedeSocial(String descricao,int numeroComentarios, int estrelas){
        this.descricao = descricao;
        this.numeroComentarios = numeroComentarios; 
        this.estrelas = estrelas;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getNumeroComentarios() {
        return numeroComentarios;
    }

    public int getEstrelas() {
        return estrelas;
        
      } 

    @Override
    public String toString() {
        return "PostsRedeSocial{" + "descricao=" + descricao + ", numeroComentarios=" + numeroComentarios + ", estrelas=" + estrelas + '}';
    }

    }


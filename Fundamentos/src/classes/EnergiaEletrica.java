package classes;

import com.sun.source.tree.IfTree;
import java.util.Scanner;

public class EnergiaEletrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantidade de kw/h consumido: ");
        double qtdeKwh = scanner.nextDouble();
        
        System.out.println("Tipo de instalacao eletrica: (R para residencial, I para industria, C para comercio):");
        char tipoInstalacao = scanner.next().charAt(0);
        
        double precoTotal = 0;
        if (tipoInstalacao == 'R') {
          if (qtdeKwh <= 500) {
              precoTotal = qtdeKwh * 0.40; 
        }else{
              precoTotal = qtdeKwh * 0.65;
          }else if (tipoInstalacao == 'C') {
               if (qtdeKwh <= 1000) {
                  precoTotal = qtdeKwh * 0.55;   
             }else{
                  precoTotal = qtdeKwh *0.60;
                  }
            }else{
            System.out.println("Tipo de instalacao invalida");
            return;         
    } 
          System.out.println("O valor a pagar e = R$" + precoTotal);
          
     }else if (tipoInstalacao == 'I'){
               if (qtdeKwh <= 5000) {
                  precoTotal = qtdeKwh * 0.55;   
             }else{
                  precoTotal = qtdeKwh *0.60;
    }
    
        }
   
            }

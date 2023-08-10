package aulaestruturadecisao;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Largura do terreno (em metros):");
        double largura = scanner.nextDouble();
        
        System.out.println("Comprimento do terreno (em metros):");
        double comprimento = scanner.nextDouble();
        
        double areaTotal = largura * comprimento;
        double valorM2;
        
        if (areaTotal <= 250) {
            valorM2 = 8.50;
        } else if (areaTotal <= 350) {
            valorM2 = 9.50;
        } else {
            valorM2 = 11.50;
        }
      
        double valorTotal = areaTotal * valorM2;
        
        System.out.println("O valor total para construir e: R$" + valorTotal);
       }
    }


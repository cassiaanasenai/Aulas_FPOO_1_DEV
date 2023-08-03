package classes;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantidade de valores: ");
        int qtdeValores = scanner.nextInt();
        
        double soma = 0;
        
        for (int i = 0; i < qtdeValores; i++){
            System.out.println("Coloque o valor: " + (i + 1)+ ":");
            double valor = scanner.nextDouble();
            soma += valor;
        }
        double media = soma / qtdeValores;
        System.out.println("A media aritmetica e = " + media);
    }
    }

   

package aulaestruturadecisao;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha o prato: (1- para Arroz, feijao e bife acebolado)( 2- para Arroz, feijao e file de frango)(3- para Arroz, feijao e brajola):");
        int prato = scanner.nextInt();
        
        double preço;
        
        switch (prato) {
            case 1:
                preço = 19.99;
                break;
            case 2:
                preço = 18.99;
                break;
            case 3:
                preço = 23.99;
                break;
            default:
                System.out.println("Invalido");
                return;
        }
        System.out.println("Quantidade de pratos:");
        int qtde = scanner.nextInt();
        
        double valorTotal = preço * qtde;
        System.out.println("Preco total: R$" + valorTotal);
     }

 }

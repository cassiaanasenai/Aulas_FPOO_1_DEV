package aulaestruturadecisao;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o veiculo: (Fiat Argo, Fiat Mobi, Hyundai Hb20):");
        String veiculo = scanner.nextLine();
        
        double diaria = 0;
        double valorKmRodado = 0;
        
        switch (veiculo.toLowerCase()) {
            case "fiat argo":
                diaria = 98.00;
                valorKmRodado = 2.39;
                break;
            case "fiat mobi":
                diaria = 79.00;
                valorKmRodado = 1.99;
                break;
            case "hyundai hb20":
                diaria = 102.00;
                valorKmRodado = 2.99;
                break;
            default:
                System.out.println("Invalido.");
                return;
        }
        
        System.out.println("Quantidade de dias para alugar:");
        int quantidadeDias = scanner.nextInt();
        
        System.out.println("Quantidade de quilometros rodados:");
        double quilometrosRodados = scanner.nextDouble();
        
        double diarias = diaria * quantidadeDias;
        double precoKmRodado = valorKmRodado * quilometrosRodados;
        
        double valorTotal = diarias + precoKmRodado;
        
        System.out.println("Valor total do aluguel do veiculo: R$" + valorTotal);
    }

}

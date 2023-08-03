package classes;

import java.util.Scanner;

public class Produto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nome do produto: ");
        String nomeProduto = scanner.nextLine();
        
        System.out.println("Valor unitario do produto: ");
        double valorUnitario = scanner.nextDouble();
        
        System.out.println("Qtde de produtos: ");
        int qtde = scanner.nextInt();
        
        double valorTotal = valorUnitario + qtde;
        
        System.out.println("Forma de pagamento (D para debito, C para credito):");
        String formaPagamento = scanner.next();
        
        if (formaPagamento.equalsIgnoreCase("D")) {
            double desconto = 0;
            if (valorTotal <= 100) {
                desconto = valorTotal * 0.05;
           } else {
                desconto = valorTotal * 0.03;
           }
            valorTotal -= desconto;
            System.out.println("Valor total com desconto : R$ " + valorTotal);
        }else if (formaPagamento.equalsIgnoreCase("C")) {
            System.out.println("Qual o numero de parcelas: ");
            int numParcelas = scanner.nextInt();
            double valorParcela = valorTotal /numParcelas;
            System.out.println("Valor da parcela: R$ " + valorParcela);
        }else{
                System.out.println("Forma de pagamento invalida.");
        }
        System.out.println("Informações da compra: ");
        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Valor unitario: R$ " + valorUnitario);
        System.out.println("Quantidade: " + qtde);
        System.out.println("Valor total R$: " + valorTotal);
    }

}

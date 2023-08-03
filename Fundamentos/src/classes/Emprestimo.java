package classes;

import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Valor da casa: ");
        double valorCasa = scanner.nextDouble();
        
        System.out.println("Salario da pessoa: ");
        double salario = scanner.nextDouble();
        
        System.out.println("Anos a pagar: ");
        int anosPagar = scanner.nextInt();
        
        double prestacaoMensal = valorCasa / (anosPagar * 12);
        double limitePrestacao = salario * 0.30;
        
        if (prestacaoMensal <= limitePrestacao) {
            System.out.println("emprestimo aprovado: prestacao mensal de: R$: " + prestacaoMensal);
        }else{
            System.out.println("Emprestimo reprovado: prestacao mensal excede 30% do salario  ");
        }
    }
}

package classes;

import java.util.Scanner;

public class SalFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Salario do funcionario: R$ ");
        double salario = scanner.nextDouble();
        
        double aumentoPercentual;
        if (salario > 1350.00) {
            aumentoPercentual = 0.10;
        } else {
            aumentoPercentual = 0.15;
        }
        double aumento = salario * aumentoPercentual;
        double salarioNovo = salario * aumento;
        
        System.out.println("Valor do aumento: R$ " + aumento);
        System.out.println("Salario novo: R$ " + salarioNovo);
    }

}

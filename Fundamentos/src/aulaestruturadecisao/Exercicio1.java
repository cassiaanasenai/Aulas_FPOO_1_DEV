package aulaestruturadecisao;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
System.out.println("Cargo do funcionario: (Gerente, Supervisor, Tecnico, Auxiliar):");
        String cargo = scanner.nextLine();
        
        double salario = 0;
        double inss = 0;
        double convenio = 0;
        
        switch (cargo.toLowerCase()) {
            case "gerente":
                salario = 5590.00;
                inss = 8.0;
                convenio = 289.00;
                break;
            case "supervisor":
                salario = 4128.00;
                inss = 7.0;
                convenio = 239.00;
                break;
            case "tecnico":
                salario = 3789.00;
                inss = 4.0;
                convenio = 189.00;
                break;
            case "auxiliar":
                salario = 2345.00;
                inss = 2.0;
                convenio = 156.00;
                break;
            default:
                System.out.println("Invalido");
                return;
        }
        
        double descontoINSS = salario * (inss / 100);
        double salarioFinal = salario - descontoINSS - convenio;
        
        System.out.println("Salario final do funcionario: R$" + salarioFinal);
    }
}

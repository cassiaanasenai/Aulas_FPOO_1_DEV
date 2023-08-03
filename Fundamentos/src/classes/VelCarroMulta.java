package classes;

import java.util.Scanner;

public class VelCarroMulta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Velocidade do carro (em km/h): ");
        int velocidade = scanner.nextInt();
        
        if (velocidade > 80) {
            int kmAcima = velocidade - 80;
            double valorMulta = kmAcima * 5.0;
            
            System.out.println("Motorista multado ");
            System.out.println("Velocidade excedida " + kmAcima + "km/h");
            System.out.println("Valor da multa " + valorMulta);
        }else{
            System.out.println("Valocidade dentro do limite. Prossiga, Boa Viagem!");
        }
    }

}

package classes;

import java.util.Scanner;

public class Passageiro {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        
        System.out.println("Distancia em km: ");
        double distancia = scanner.nextDouble();
        
        double precoPorKm;
        
        if (distancia <= 200) {
            precoPorKm = 0.50;
        }else{
            precoPorKm = 0.45;
            
        }
        double precoPassagem = distancia * precoPorKm;
        System.out.println("A passagem e R$: " + precoPassagem);
    }

}

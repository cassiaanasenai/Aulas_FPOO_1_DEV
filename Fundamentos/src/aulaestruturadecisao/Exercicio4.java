package aulaestruturadecisao;

  import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        double valorNotebook = 3299.00;
        double percentualNotebook = 5.0;
        
        double valorCelular = 1789.00;
        double percentualCelular = 10.0;
        
        double valorCarro = 68000.00;
        double percentualCarro = 2.0;
        
        double valorApartamento = 180000.00;
        double percentualApartamento = 1.0;
        
        double economiaNotebook = valorNotebook * (percentualNotebook / 100);
        double economiaCelular = valorCelular * (percentualCelular / 100);
        double economiaCarro = valorCarro * (percentualCarro / 100);
        double economiaApartamento = valorApartamento * (percentualApartamento / 100);
        
        System.out.println("Valor a economizar para o Notebook: R$" + economiaNotebook);
        System.out.println("Valor a economizar para o Celular: R$" + economiaCelular);
        System.out.println("Valor a economizar para o Carro: R$" + economiaCarro);
        System.out.println("Valor a economizar para o Apartamento: R$" + economiaApartamento);
    }

}

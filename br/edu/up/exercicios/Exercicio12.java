package br.edu.up.exercicios;
import br.edu.up.modelos.Carango;
import java.util.Scanner;


public class Exercicio12 {
    public static void executar(){
        Scanner scanner = new Scanner(System.in);
        int anoVeiculo;
        double valorVeiculo;
        String continuar = "";

    do{
        System.out.println("Ano do veículo: ");
        anoVeiculo = scanner.nextInt();

        System.out.println("Valor do carro: ");
        valorVeiculo = scanner.nextDouble();

        Carango carango = new Carango (anoVeiculo, valorVeiculo,anoVeiculo, valorVeiculo);

        System.out.println(carango);

        System.out.println("Continuar? Digite S ou N (SIM/NÃO) ");
        continuar = scanner.next() . toUpperCase();
        scanner.nextLine();
   }
   while(continuar.equals("S"));
   
   scanner.close();
    }
}

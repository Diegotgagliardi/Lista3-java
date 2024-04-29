package br.edu.up.exercicios;
import br.edu.up.modelos.Ponderada;
import java.util.Scanner;

public class Exercicio24 {
    public static void executar(){
        Scanner scanner = new Scanner(System.in);

        int nota1;
        int nota2;
        int nota3;

        System.out.println("Nota1: ");
        nota1 = scanner.nextInt();

        System.out.println("Nota2: ");
        nota2 = scanner.nextInt();

        System.out.println("Nota3: ");
        nota3 = scanner.nextInt();

        double media = Ponderada.calcPonderada(nota1, nota2, nota3);
        
        System.out.println("A média ponderada é: " + media);

        scanner.close();
    }
}

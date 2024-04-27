package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Notas;

public class Exercicio08 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nomeAluno = scanner.nextLine();

        System.out.print("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota 3: ");
        double nota3 = scanner.nextDouble();

        Notas notas = new Notas(nomeAluno, nota1, nota2, nota3);
        notas.finalAritmetica();

        scanner.close();
    }
}

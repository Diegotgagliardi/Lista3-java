package br.edu.up.exercicios;

import br.edu.up.modelos.Seguradora;
import java.util.Scanner;

public class Exercicio26 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Idade:");
        int idade = scanner.nextInt();

        System.out.println("Risco (baixo/médio/alto):");
        String risco = scanner.next().toLowerCase();

        Seguradora seguradora = new Seguradora(idade, risco);
        seguradora.validarCategoria();

        scanner.close();
    }
}

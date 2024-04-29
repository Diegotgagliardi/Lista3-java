package br.edu.up.exercicios;
import br.edu.up.modelos.Classificacao;
import java.util.Scanner;

public class Exercicio25 {
    public static void executar(){
        Scanner scanner = new Scanner(System.in);

        int nota1;
        int nota2;
        int nota3;
        String nome;
        int matricula;

        System.out.println("Nome: ");
        nome = scanner.nextLine();
        
        System.out.println("Matricula: ");
        matricula = scanner.nextInt();

        System.out.println("Nota1: ");
        nota1 = scanner.nextInt();

        System.out.println("Nota2: ");
        nota2 = scanner.nextInt();

        System.out.println("Nota3: ");
        nota3 = scanner.nextInt();
        
        double mediaPonderada = Classificacao.calcPonderada(nota1, nota2, nota3);

        String classificacao = Classificacao.classi(mediaPonderada);

        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Nota Final: " + mediaPonderada);
        System.out.println("Classificação: " + classificacao);



        scanner.close();
    }
}

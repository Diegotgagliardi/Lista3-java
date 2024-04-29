package br.edu.up.exercicios;
import br.edu.up.modelos.Imc;
import java.util.Scanner;

public class Exercicio23 {
    public static void executar(){
        Scanner scanner = new Scanner(System.in);
        
        String nome;
        String sexo;
        double altura;
        int idade;

        System.out.println("Nome: ");
        nome = scanner.nextLine();
        
        System.out.println("Sexo (m/f): ");
        sexo = scanner.nextLine();

        System.out.println("Idade: ");
        idade = scanner.nextInt();

        System.out.println("Altura (em metros): ");
        altura = scanner.nextDouble();

        double pesoIdeal = Imc.imc(sexo, altura, idade);
        
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Altura: " + altura);
        System.out.println("Idade: " + idade);
        System.out.println("Peso Ideal: " + pesoIdeal);

        scanner.close();
    }
}

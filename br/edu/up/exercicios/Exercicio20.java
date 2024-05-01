package br.edu.up.exercicios;
import br.edu.up.modelos.Aprender;
import java.util.Scanner;

public class Exercicio20 {
  public static void executar() {
    Scanner leitor = new Scanner(System.in);
    Aprender aprender = new Aprender();

    System.out.println("Informe o número de horas/aula trabalhadas: ");
    aprender.horas = leitor.nextDouble();

    System.out.println("Informe o nível do professor (1, 2 ou 3): ");
    aprender.nivel = leitor.nextInt();

    aprender.horasAula();

    leitor.close();
  }
}

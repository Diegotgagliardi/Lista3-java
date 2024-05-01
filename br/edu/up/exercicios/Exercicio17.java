package br.edu.up.exercicios;
import br.edu.up.modelos.AumentoFolha;
import java.util.Scanner;

public class Exercicio17 {
  public static void executar() {
    Scanner leitor = new Scanner(System.in);
    AumentoFolha aumento = new AumentoFolha();

    System.out.println("Insira o nome do funcionario: ");
    aumento.nome = leitor.nextLine();

    System.out.println("Insira o salario atual: ");
    aumento.salario = leitor.nextDouble();

    System.out.println("Insira o valor do salario minimo: ");
    aumento.salarioMin = leitor.nextDouble();

    aumento.reajusteSal();

    leitor.close();
  }
}

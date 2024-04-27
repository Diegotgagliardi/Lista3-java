package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Prestacao;

public class Exercicio05 {
  public static void executar() {
    Scanner leitor = new Scanner(System.in);
    Prestacao prestacao = new Prestacao();

    System.out.println("Insira o nome do produto: ");
    String nome = leitor.nextLine();
    prestacao.setNome(nome);

    System.out.println("Insira o valor do produto: ");
    double valor = leitor.nextDouble();
    prestacao.setValor(valor);

    System.out.println("\nNome do produto: " + prestacao.getNome() + "\nValor total: " + prestacao.getValor()
        + "\nValor em 5 parcelas: " + prestacao.parcelas());

    leitor.close();
  }
}

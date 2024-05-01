package br.edu.up.exercicios;
import br.edu.up.modelos.Produto;
import java.util.Scanner;

public class Exercicio14 {
  public static void executar() {
    Scanner leitor = new Scanner(System.in);

    Produto produto = new Produto();

    String nome[] = new String[2];
    double valor[] = new double[2];
    double venda[] = new double[2];

    for (int cont = 0; cont < 2; cont++) {
      System.out.println("\nInsira o nome do produto: ");
      produto.nomeProd[cont] = leitor.nextLine();

      System.out.println("Insira qual o valor de compra do produto: ");
      produto.valor[cont] = leitor.nextDouble();

      System.out.println("Insira o valor que o produto foi vendido: ");
      produto.venda[cont] = leitor.nextDouble();

      leitor.nextLine();
    }
    produto.relacaoProd();
  }
}

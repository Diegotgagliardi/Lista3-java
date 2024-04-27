package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Cotacao;

public class Exercicio04 {
  public static void executar() {
    Scanner leitor = new Scanner(System.in);
    Cotacao cotacao = new Cotacao();

    System.out.println("Insira o valor do dolar em Reais: ");
    double dolarReais = leitor.nextDouble();
    cotacao.setValordolar(dolarReais);

    System.out.println("Insira o valor de dolares disponível: ");
    double saldoDolar = leitor.nextDouble();
    cotacao.setValordisp(saldoDolar);

    System.out.println("\nSeu saldo disponível em reais é R$ " + cotacao.convDolar());

    leitor.close();
  }
}
package br.edu.up.exercicios;
import br.edu.up.modelos.Pessoas;
import java.util.Scanner;

public class Exercicio13 {
  public static void executar() {
    Scanner leitor = new Scanner(System.in);
    Pessoas pessoas = new Pessoas();

    System.out.println("Insira a idade do candidato: ");
    int idade = leitor.nextInt();
    pessoas.setIdade(idade);

    leitor.nextLine();

    System.out.println("Insira o sexo M ou F: ");
    String sexo = leitor.nextLine();
    pessoas.setSexo(sexo);

    System.out.println("Insira a saúde Boa ou Ruim: ");
    String saude = leitor.nextLine();
    pessoas.setSaude(saude);

    System.out.println("Insira o nome do candidato: ");
    String nome = leitor.nextLine();
    pessoas.setNome(nome);

    pessoas.classificacao();

    leitor.close();
  }
}

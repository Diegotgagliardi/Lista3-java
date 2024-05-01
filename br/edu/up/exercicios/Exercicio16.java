package br.edu.up.exercicios;
import br.edu.up.modelos.Reajuste;
import java.util.Scanner;

public class Exercicio16 {
  public static void executar() {
    Scanner leitor = new Scanner(System.in);
    Reajuste reajuste = new Reajuste();

    for (int cont = 0; cont < reajuste.funcionarios.length; cont++) {

      System.out.println("Informe quantos salarios minimos o funcionario recebe:");
      reajuste.salarioMinimos[cont] = leitor.nextInt();

      System.out.println("Informe o salario do funcionario:");
      reajuste.salarios[cont] = leitor.nextDouble();

      leitor.nextLine();
    }
    reajuste.salarioRea();

    leitor.close();
  }
}

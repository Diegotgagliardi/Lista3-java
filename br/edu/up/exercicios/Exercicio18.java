package br.edu.up.exercicios;
import br.edu.up.modelos.Abono;
import java.util.Scanner;

public class Exercicio18 {
  public static void executar() {
    Scanner leitor = new Scanner(System.in);
    Abono abono = new Abono();

    System.out.println("Informe o nome do funcionário: ");
    abono.nomeFun = leitor.nextLine();

    System.out.println("Informe a idade do funcionário: ");
    abono.idade = leitor.nextInt();

    leitor.nextLine();

    System.out.println("Informe o sexo M ou F do funcionário: ");
    abono.sexo = leitor.nextLine();

    System.out.println("Informe o salário do funcionário: ");
    abono.salarioFixo = leitor.nextDouble();

    abono.ajusteAbono();
  }
}

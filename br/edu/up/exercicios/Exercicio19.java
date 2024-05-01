package br.edu.up.exercicios;
import br.edu.up.modelos.Triangulo;
import java.util.Scanner;

public class Exercicio19 {
  public static void executar() {
    Scanner leitor = new Scanner(System.in);
    Triangulo triangulo = new Triangulo();

    System.out.println("Digite o comprimento do primeiro lado: ");
    triangulo.a = leitor.nextInt();
    System.out.println("Digite o comprimento do segundo lado: ");
    triangulo.b = leitor.nextInt();
    System.out.println("Digite o comprimento do terceiro lado: ");
    triangulo.c = leitor.nextInt();

    triangulo.retornaTriangulo();

    leitor.close();
  }
}

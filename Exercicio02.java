import java.util.Scanner;

public class Exercicio02 {
  public static void executar() {
    Scanner leitor = new Scanner(System.in);

    Automovel automovel = new Automovel();

    System.out.println("Insira o total de km rodados: ");
    automovel.distancia = leitor.nextDouble();

    System.out.println("Insira o total de combustivel gasto: ");
    automovel.consumoTotal = leitor.nextDouble();

    System.out.println("Consumo médio: " + automovel.totalCombus());

    leitor.close();
  }
}

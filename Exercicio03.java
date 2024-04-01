import java.util.Scanner;

public class Exercicio03 {
  public static void executar() {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Insira o nome do vendedor: ");
    String nome = leitor.nextLine();

    Vendedor vendedor = new Vendedor();

    vendedor.setNome(nome);

    System.out.println("\nVendedor: " + vendedor.nome + "\nSalário fixo: " + vendedor.salFixo
        + "\nSalário total com vendas: " + vendedor.saldoMens());

    leitor.close();
  }
}

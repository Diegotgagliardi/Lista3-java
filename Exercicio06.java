import java.util.Scanner;

public class Exercicio06 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço de custo do produto: ");
        double precoCusto = scanner.nextDouble();

        System.out.print("Digite o percentual de acréscimo (em %): ");
        double percentualAcrescimo = scanner.nextDouble();

        double precoVenda = CalcPrecos.calcularPrecoVenda(precoCusto, percentualAcrescimo);

        System.out.println("O preço de venda do produto é: " + precoVenda);

        scanner.close();
    }
}

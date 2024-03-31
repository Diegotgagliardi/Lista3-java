import java.util.Scanner;

public class Exercicio09 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[80];
        for (int i = 0; i < 80; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        int quantidadeNoIntervalo = Intervalo.contarNumerosNoIntervalo(numeros);

        System.out.println("Quantidade de números no intervalo entre 10 e 150: " + quantidadeNoIntervalo);

        scanner.close();
    }
}

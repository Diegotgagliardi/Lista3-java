import java.util.Scanner;

public class Exercicio10 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantas pessoas você deseja verificar?");
        int quantidadePessoas = scanner.nextInt();
        
        // Criar um array para armazenar as pessoas
        Pessoa[] pessoas = new Pessoa[quantidadePessoas];
        
        // Preencher o array com as idades das pessoas
        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.println("Informe a idade da pessoa " + (i+1) + ":");
            int idade = scanner.nextInt();
            pessoas[i] = new Pessoa(idade);
        }
        
        // Mostrar o status de cada pessoa
        System.out.println("\nStatus de cada pessoa:");
        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.println("Pessoa " + (i+1) + " é " + pessoas[i].getStatusIdade());
        }
        
        scanner.close();
    }
}
import java.util.Scanner;

public class Exercicio11 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        int totalHomens = 0;
        int totalMulheres = 0;
        
        NomeSexo[] pessoas = new NomeSexo[56];
        
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Informe o nome da pessoa " + (i + 1) + ":");
            String nome = scanner.nextLine();
            
            System.out.println("Informe o sexo da pessoa (M para masculino, F para feminino):");
            char sexo = scanner.nextLine().toUpperCase().charAt(0);
            
            pessoas[i] = new NomeSexo(nome, sexo);
            
            if (sexo == 'M') {
                totalHomens++;
            } else if (sexo == 'F') {
                totalMulheres++;
            } else {
                System.out.println("Sexo inválido. Por favor, informe 'M' para masculino ou 'F' para feminino.");
                i--;
            }
        }
        
        System.out.println("\nInformações das pessoas:");
        for (NomeSexo pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + ", Sexo: " + (pessoa.getSexo() == 'M' ? "Masculino" : "Feminino"));
        }
        
        System.out.println("Total de Homens: " + totalHomens);
        System.out.println("Total de Mulheres: " + totalMulheres);
        
        scanner.close();
    }
}

package br.edu.up.exercicios;
import br.edu.up.modelos.Veiculo;
import java.util.Scanner;

public class Exercicio15 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        Veiculo veiculo = new Veiculo();

        System.out.println("Insira o nome do veículo:");
        veiculo.setNomeVeiculo(leitor.nextLine());

        System.out.println("Insira o combustível do veículo (álcool, gasolina ou diesel):");
        veiculo.setCombustivel(leitor.nextLine());

        System.out.println("Insira o valor do veículo:");
        veiculo.setValorVeiculo(leitor.nextDouble());

        veiculo.somaValor();

        leitor.close();
    }
}

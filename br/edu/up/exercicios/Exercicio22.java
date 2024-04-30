package br.edu.up.exercicios;
import br.edu.up.modelos.Luz;
import java.util.Scanner;

public class Exercicio22 {
    public static void executar(){
        Scanner scanner = new Scanner(System.in);
        
        String estabelecimento;
        double kw;

        System.out.println("Estabelecimento (residencia/comercio/industria): ");
        estabelecimento = scanner.nextLine();
        
        System.out.println("kW/h : ");
        kw = scanner.nextDouble();

        double valorConta = Luz.calcLuz(estabelecimento, kw);
        
        if(valorConta >= 0){
            System.out.println("Valor da conta de luz: R$" + valorConta);
        } else {
            System.out.println("Erro: Tipo de estabelecimento errado.");
        }

        scanner.close();
    }
}

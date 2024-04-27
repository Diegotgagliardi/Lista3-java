package br.edu.up.modelos;
public class CalcPrecos {
    public static double calcularPrecoVenda(double precoCusto, double percentualAcrescimo) {
        double precoVenda = precoCusto * (1 + percentualAcrescimo / 100);
        return precoVenda;
    }
}

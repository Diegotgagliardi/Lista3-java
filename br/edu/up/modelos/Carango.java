package br.edu.up.modelos;

public class Carango {
    private int ano;
    private double valor;
    private double desconto;
    private double valorFinal;


    public Carango(int ano, double valor, double desconto, double valorFinal){
        this.ano = ano;
        this.valor = valor;
        this.desconto = desconto;
        this.valorFinal = valorFinal;
    }

    public void calculandoDesconto(){
        if (ano <= 2000){
            desconto = valor * 0.50;
        }
        else{
            desconto = valor * 0.10;
        }
    }

    public void calcValorFinal(){
        valorFinal = valor - desconto;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorDesconto() {
        return desconto;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    @Override
    public String toString() {
        return "Carango{" +
                "ano=" + ano +
                ", valor=" + valor +
                ", valorDesconto=" + desconto +
                ", valorFinal=" + valorFinal +
                '}';
    }
}

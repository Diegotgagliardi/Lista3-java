package br.edu.up.modelos;
public class Vendedor {
  public String nome = "Alan";
  public double salFixo = 1890.00;
  public double vendas = 1200.00;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double saldoMens() {
    double total = (vendas * 115) / 100;
    total = total + salFixo;

    return total;
  }
}

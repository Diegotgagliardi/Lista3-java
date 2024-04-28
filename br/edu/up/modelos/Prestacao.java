package br.edu.up.modelos;
public class Prestacao {
  public String nomeProd;
  public double valor;
  public double parcelas = 5;

  public String getNome() {
    return nomeProd;
  }

  public void setNome(String nomeProd) {
    this.nomeProd = nomeProd;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public double parcelas() {
    double valorParcelas = valor / parcelas;

    return valorParcelas;
  }
}

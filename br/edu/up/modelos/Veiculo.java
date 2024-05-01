package br.edu.up.modelos;
public class Veiculo {
  String nomeVeiculo;
  String combustivel;
  double valorVeiculo;
  double descVeiculo;

  public String getNomeVeiculo() {
    return nomeVeiculo;
  }

  public void setNomeVeiculo(String nomeVeiculo) {
    this.nomeVeiculo = nomeVeiculo;
  }

  public String getCombustivel() {
    return combustivel;
  }

  public void setCombustivel(String combustivel) {
    this.combustivel = combustivel;
  }

  public double getValorVeiculo() {
    return valorVeiculo;
  }

  public void setValorVeiculo(double valorVeiculo) {
    this.valorVeiculo = valorVeiculo;
  }

  public double getDescVeiculo() {
    return descVeiculo;
  }

  public void setDescVeiculo(double descVeiculo) {
    this.descVeiculo = descVeiculo;
  }

  public void somaValor() {
    double total;

    switch (combustivel) {
      case "alcool":
        descVeiculo = valorVeiculo * 0.25;
        total = valorVeiculo - descVeiculo;
        System.out.println("\nValor de desconto: R$" + descVeiculo + "\nValor do veículo com desconto: R$" + total);
        break;
      case "gasolina":
        descVeiculo = valorVeiculo * 0.21;
        total = valorVeiculo - descVeiculo;
        System.out.println("\nValor de desconto: R$" + descVeiculo + "\nValor do veículo com desconto: R$" + total);
        break;
      case "diesel":
        descVeiculo = valorVeiculo * 0.14;
        total = valorVeiculo - descVeiculo;
        System.out.println("\nValor de desconto: R$" + descVeiculo + "\nValor do veículo com desconto: R$" + total);
        break;
      default:
        System.out.println("Tipo de combustível inválido.");
        break;
    }
  }
}

package br.edu.up.modelos;
public class Produto {
  public String nomeProd[] = new String[2];
  public double valor[] = new double[2];
  public double venda[] = new double[2];

  public String[] getNomeProd() {
    return nomeProd;
  }

  public void setNomeProd(String[] nomeProd) {
    this.nomeProd = nomeProd;
  }

  public double[] getValor() {
    return valor;
  }

  public void setValor(double[] valor) {
    this.valor = valor;
  }

  public double[] getVenda() {
    return venda;
  }

  public void setVenda(double[] venda) {
    this.venda = venda;
  }

  public void relacaoProd() {
    for (int cont = 0; cont < 2; cont++) {
      double resultado = valor[cont] - venda[cont];

      if (resultado < 0) {
        System.out.println("Produto: " + nomeProd[cont] + ", Prejuízo: " + resultado);
      } else if (resultado > 0) {
        System.out.println("Produto: " + nomeProd[cont] + ", Lucro: " + resultado);
      } else {
        System.out.println("Produto: " + nomeProd[cont] + ", Empate: " + resultado);
      }
    }
  }
}

public class Cotacao {
  public double valorDolar;
  public double real;
  public double valorDisp;

  public double getValordolar() {
    return valorDolar;
  }

  public void setValordolar(double valorDolar) {
    this.valorDolar = valorDolar;
  }

  public double getValordisp() {
    return valorDisp;
  }

  public void setValordisp(double valorDisp) {
    this.valorDisp = valorDisp;
  }

  public double convDolar() {
    double valorReais = valorDolar * valorDisp;

    return valorReais;
  }
}

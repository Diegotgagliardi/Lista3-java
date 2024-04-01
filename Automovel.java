public class Automovel {
  public double consumoTotal;
  public double distancia;

  public double getConsumo() {
    return consumoTotal;
  }

  public void setConsumo(double consumoTotal) {
    this.consumoTotal = consumoTotal;
  }

  public double getDistancia() {
    return distancia;
  }

  public void setDistancia(double distancia) {
    this.distancia = distancia;
  }

  public double totalCombus() {
    double consumo = distancia / consumoTotal;

    return consumo;
  }
}

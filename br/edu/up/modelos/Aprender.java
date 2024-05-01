package br.edu.up.modelos;
public class Aprender {
  public double horas;
  public int nivel;

  public double getHoras() {
    return horas;
  }

  public void setHoras(double horas) {
    this.horas = horas;
  }

  public int getNivel() {
    return nivel;
  }

  public void setNivel(int nivel) {
    this.nivel = nivel;
  }

  public void horasAula() {
    double valorHora = 0;

    switch (nivel) {
      case 1:
        valorHora = 12;
        break;
      case 2:
        valorHora = 17;
        break;
      case 3:
        valorHora = 25;
        break;
      default:
        System.out.println("Nível de professor inválido.");
        break;
    }

    double salario = horas * valorHora;

    System.out.println("O valor do salário por horas foi de: R$" + salario);
  }
}

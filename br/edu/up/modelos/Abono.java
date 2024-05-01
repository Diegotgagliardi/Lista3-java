package br.edu.up.modelos;
public class Abono {
  public String nomeFun;
  public String sexo;
  public int idade;
  public double salarioFixo;

  public String getNomeFun() {
    return nomeFun;
  }

  public void setNomeFun(String nomeFun) {
    this.nomeFun = nomeFun;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public double getSalarioFixo() {
    return salarioFixo;
  }

  public void setSalarioFixo(double salarioFixo) {
    this.salarioFixo = salarioFixo;
  }

  public void ajusteAbono() {
    double calcAbono;
    if (sexo.equalsIgnoreCase("M") && idade >= 30) {
      calcAbono = salarioFixo + 100;
      System.out.println("\nNome: " + nomeFun);
      System.out.println("Salario liquido: R$" + calcAbono);
    } else if (sexo.equalsIgnoreCase("M") && idade < 30) {
      calcAbono = salarioFixo + 50;
      System.out.println("\nNome: " + nomeFun);
      System.out.println("Salario liquido: R$" + calcAbono);
    } else if (sexo.equalsIgnoreCase("F") && idade >= 30) {
      calcAbono = salarioFixo + 200;
      System.out.println("\nNome: " + nomeFun);
      System.out.println("Salario liquido: R$" + calcAbono);
    } else if (sexo.equalsIgnoreCase("F") && idade < 30) {
      calcAbono = salarioFixo + 80;
      System.out.println("\nNome: " + nomeFun);
      System.out.println("Salario liquido: R$" + calcAbono);
    }
  }
}
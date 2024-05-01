package br.edu.up.modelos;
public class AumentoFolha {
  public String nome;
  public double salario;
  public double salarioMin;
  public double reajusteFolha;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public double getSalarioMin() {
    return salarioMin;
  }

  public void setSalarioMin(double salarioMin) {
    this.salarioMin = salarioMin;
  }

  public double getReajusteFolha() {
    return reajusteFolha;
  }

  public void setReajusteFolha(double reajusteFolha) {
    this.reajusteFolha = reajusteFolha;
  }

  public void reajusteSal() {
    double novoSalario;

    if (salario < 3 * salarioMin) {
      novoSalario = salario * 1.5;
    } else if (salario >= 3 * salarioMin && salario <= 10 * salario) {
      novoSalario = salario * 1.2;
    } else if (salario > 10 * salarioMin && salario <= 20 * salarioMin) {
      novoSalario = salario * 1.15;
    } else {
      novoSalario = salario * 1.1;
    }

    double aumentoFolha = novoSalario - salario;

    double porcentagemReajuste = ((novoSalario - salario) / salario) * 100;

    System.out.println("\nNome do funcionário: " + nome);
    System.out.println("Salário anterior: R$" + salario);
    System.out.println("Novo salário reajustado: R$" + novoSalario);
    System.out.println("Aumento na folha de pagamento: R$" + aumentoFolha);
    System.out.println("Porcentagem de reajuste: " + porcentagemReajuste + "%");
  }
}

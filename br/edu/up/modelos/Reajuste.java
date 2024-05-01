package br.edu.up.modelos;
public class Reajuste {
  public int[] funcionarios = new int[584];
  public int[] salarioMinimos = new int[584];
  public double[] salarios = new double[584];

  public int[] getFuncionarios() {
    return funcionarios;
  }

  public void setFuncionarios(int[] funcionarios) {
    this.funcionarios = funcionarios;
  }

  public int[] getSalarioMinimos() {
    return salarioMinimos;
  }

  public void setSalarioMinimos(int[] salarioMinimos) {
    this.salarioMinimos = salarioMinimos;
  }

  public double[] getSalarios() {
    return salarios;
  }

  public void setSalarios(double[] salarios) {
    this.salarios = salarios;
  }

  public void salarioRea() {
    double reajuste;

    for (int cont = 0; cont < funcionarios.length; cont++) {
      if (salarioMinimos[cont] < 584) {
        reajuste = (salarios[cont] * 150) / 100;
        System.out
            .println("\nO reajuste de salario do funcionario " + funcionarios[cont] + (cont + 1) + " = R$" + reajuste);
      } else if (salarioMinimos[cont] >= 3 && salarioMinimos[cont] <= 10) {
        reajuste = (salarios[cont] * 120) / 100;
        System.out
            .println("\nO reajuste de salario do funcionario " + funcionarios[cont] + (cont + 1) + " = R$" + reajuste);
      } else if (salarioMinimos[cont] > 10 && salarioMinimos[cont] <= 20) {
        reajuste = (salarios[cont] * 115) / 100;
        System.out
            .println("\nO reajuste de salario do funcionario " + funcionarios[cont] + (cont + 1) + " = R$" + reajuste);
      } else {
        reajuste = (salarios[cont] * 110) / 100;
        System.out
            .println("\nO reajuste de salario do funcionario " + funcionarios[cont] + (cont + 1) + " = R$" + reajuste);
      }
    }
  }
}
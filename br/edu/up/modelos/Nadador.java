package br.edu.up.modelos;
public class Nadador {
  public int idade;

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public void classi() {
    if (idade >= 5 && idade <= 7) {
      System.out.println("O nadador está na categoria Infantil A.");
    } else if (idade >= 8 && idade <= 10) {
      System.out.println("O nadador está na categoria Infantil B.");
    } else if (idade >= 11 && idade <= 13) {
      System.out.println("O nadador está na categoria Juvenil A.");
    } else if (idade >= 14 && idade <= 17) {
      System.out.println("O nadador está na categoria Juvenil B.");
    } else if (idade >= 18 && idade <= 25) {
      System.out.println("O nadador está na categoria Sênior.");
    } else {
      System.out.println("Idade fora da faixa etária.");
    }
  }
}

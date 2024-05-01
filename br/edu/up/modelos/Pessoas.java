package br.edu.up.modelos;
public class Pessoas {
  public String nome;
  public String sexo;
  public String saude;
  public int idade;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public String getSaude() {
    return saude;
  }

  public void setSaude(String saude) {
    this.saude = saude;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public void classificacao() {
    if (idade >= 18 && saude.equals("Boa")) {
      System.out.println("O candidato " + nome + ", do sexo: " + sexo + ", está apto.");
    } else if (idade < 18 && saude.equals("Ruim")) {
      System.out.println("O candidato: " + nome + ", não está apto(a)");
    }
  }
}

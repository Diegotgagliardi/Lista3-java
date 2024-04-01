public class Pessoa {
    private int idade;

    public Pessoa(int idade) {
        this.idade = idade;
    }

    public boolean ehMaiorDeIdade() {
        return idade >= 18;
    }

    public String getStatusIdade() {
        if (ehMaiorDeIdade()) {
            return "maior de idade";
        } else {
            return "menor de idade";
        }
    }
}

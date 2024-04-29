package br.edu.up.modelos;

public class Seguradora {
    private int idade;
    private String risco;
    
    public Seguradora(int idade, String risco) {
        this.idade = idade;
        this.risco = risco;
    }
    
    public void validarCategoria() {
        if (idade < 17 || idade > 70) {
            System.out.println("Não se enquadra nas ofertas.");
        } else {
            int categoria = determinarCategoria();
            if (categoria != -1) {
                System.out.println("Categoria: " + categoria);
            } else {
                System.out.println("Não se enquadra em nenhuma categoria oferecida.");
            }
        }
    }
    
    private int determinarCategoria() {
        int categoria = -1;
        if (idade >= 17 && idade <= 20) {
            if (risco.equals("baixo")) {
                categoria = 1;
            } else if (risco.equals("médio")) {
                categoria = 2;
            } else if (risco.equals("alto")) {
                categoria = 3;
            }
        } else if (idade >= 21 && idade <= 24) {
        }   
             
        return categoria;
    }
}

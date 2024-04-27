package br.edu.up.modelos;

public class Notas {
    public String nomeAluno;
    public double nota1;
    public double nota2;
    public double nota3;

    public Notas(String nomeAluno, double nota1, double nota2, double nota3){
        this.nomeAluno = nomeAluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double mediaAritmetica(){
        return (nota1 + nota2 + nota3)/3;
    }

    public void finalAritmetica(){
        double mediaA = mediaAritmetica();
        if (mediaA >= 7){
            System.out.println("Média Superor a 7, passou");
        }
        else if(mediaA >= 5.1 && mediaA <= 6.9){
            System.out.println("Média 5, você está de recuperação");
        }
        else{
            System.out.println("Média 5, você reprovou");
        }
    }
}

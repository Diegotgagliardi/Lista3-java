package br.edu.up.modelos;

public class Ponderada {
    public static double calcPonderada(double nota1, double nota2, double nota3){
        double pesoLaboratorio = 2;
        double pesoAvaliacaoSemestral = 3;
        double pesoExameFinal = 5;

        double mediaPonderada = (nota1 * pesoLaboratorio + nota2 * pesoAvaliacaoSemestral + nota3 * pesoExameFinal) / (pesoLaboratorio + pesoAvaliacaoSemestral + pesoExameFinal);
        
        return mediaPonderada;
    }
}

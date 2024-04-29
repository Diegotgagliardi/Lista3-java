package br.edu.up.modelos;

public class Classificacao {
    public static double calcPonderada(double nota1, double nota2, double nota3){
        double pesoLaboratorio = 2;
        double pesoAvaliacaoSemestral = 3;
        double pesoExameFinal = 5;

        double mediaPonderada = (nota1 * pesoLaboratorio + nota2 * pesoAvaliacaoSemestral + nota3 * pesoExameFinal) / (pesoLaboratorio + pesoAvaliacaoSemestral + pesoExameFinal);
        
        return mediaPonderada;
    }
    public static String classi(double mediaPoderada){
        if (mediaPoderada <= 10 && mediaPoderada >= 8){
            return "A";
        }
        else if(mediaPoderada <= 7.9 && mediaPoderada >= 7){
            return "B";
        }
        else if(mediaPoderada <= 6.9 && mediaPoderada >= 6){
            return "C";
        }
        else if(mediaPoderada <= 5.9 && mediaPoderada >= 5){
            return "D";
        }
        else if(mediaPoderada <= 4.9 && mediaPoderada >= 0){
            return "E";
        }
        else{
            return "Erro";
        }
        } 
    }


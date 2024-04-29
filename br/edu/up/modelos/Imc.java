package br.edu.up.modelos;

public class Imc {
    public static double imc(String sexo, double altura, int idade){
        double pesoIdeal = 0;

        if(sexo.equalsIgnoreCase("m")){
            if(altura > 1.70){
                if(idade <= 20){
                    pesoIdeal = (72.7 * altura) - 58;
                } else if(idade >= 21 && idade <= 39){
                    pesoIdeal = (72.7 * altura) - 53;
                } else if(idade >= 40){
                    pesoIdeal = (72.7 * altura) - 45;
                }
            } else {
                if(idade <= 40){
                    pesoIdeal = (72.7 * altura) - 50;
                } else {
                    pesoIdeal = (72.7 * altura) - 58;
                }
            }
        } else if(sexo.equalsIgnoreCase("f")){
            if(altura > 1.50){
                if(idade >= 35){
                    pesoIdeal = (62.1 * altura) - 45;
                } else {
                    pesoIdeal = (62.1 * altura) - 49;
                }
            } else {
                if(idade >= 35){
                    pesoIdeal = (62.1 * altura) - 45;
                } else {
                    pesoIdeal = (62.1 * altura) - 49;
                }
            }
        }

        return pesoIdeal;
    }
}

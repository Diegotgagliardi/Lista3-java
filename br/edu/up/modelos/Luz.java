package br.edu.up.modelos;

public class Luz {
    static double residencia = 0.60;
    static double comercio = 0.48;
    static double industria = 1.29;

    public static double calcLuz(String estabelecimento, double kw){
        double calcConta = 0;

        if(estabelecimento.equalsIgnoreCase("residencia")){
            calcConta = kw * residencia;
        } else if(estabelecimento.equalsIgnoreCase("comercio")){
            calcConta = kw * comercio;
        } else if(estabelecimento.equalsIgnoreCase("industria")){
            calcConta = kw * industria;
        } else {
            calcConta = 0;
        }
        return calcConta;
    }
}

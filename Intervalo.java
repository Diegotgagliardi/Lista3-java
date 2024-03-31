public class Intervalo {
    public static int contarNumerosNoIntervalo(int[] numeros) {
        int contadorIntervalo = 0;
        for (int numero : numeros) {
            if (numero >= 10 && numero <= 150) {
                contadorIntervalo++;
            }
        }
        return contadorIntervalo;
    }
}

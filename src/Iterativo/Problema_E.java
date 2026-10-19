package Iterativo;

public class Problema_E {
    // Lo rabajaremos con potencias:
    public static boolean busquedaNumero(long n, long localizar){
        long potenciaDiez = 10;
        for (long i = potenciaDiez; i >= 10; i/=10)
            potenciaDiez *= 10;

        while (n > 0){
            if (n % potenciaDiez == localizar) return true;
            if (n < 10) return false;
            n/=10;
        }
        return false;
    }
}

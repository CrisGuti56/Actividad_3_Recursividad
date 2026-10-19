package Recursivo;

public class Problema_G_R {
    public static long numeroConRepeticion(long n, int digito){
        if (n == 0) return 0;
        long r = numeroConRepeticion(n / 10, digito);
        return (n % 10 == digito) ? r * 10 + digito : r;
    }
}

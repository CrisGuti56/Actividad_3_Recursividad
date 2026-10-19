package Recursivo;

public class Problema_E_R {
    public static long potencia(long localizar){
        if (localizar < 10) return 10;
        return 10 * potencia(localizar / 10);
    }
    public static boolean busquedaNumero(long n, long localizar){
        if (n < localizar) return false;
        if (n % potencia(localizar) == localizar) return true;
        if (n < 10) return false;
        return busquedaNumero(n / 10, localizar);
    }
}

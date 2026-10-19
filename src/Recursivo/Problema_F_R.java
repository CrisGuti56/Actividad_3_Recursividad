package Recursivo;

public class Problema_F_R {
    public static long invertirPares(long n){
        if (n == 0) return 0;
        return 100 * invertirPares(n / 100) + (n % 10) * 10 + (n / 10) % 10;
    }
}

package Recursivo;

public class Problema_A_R {
    public static byte retornarMayor(long n){
        n = Math.abs(n);
        if (n<10)
            return (byte)n;
        else
            return (byte)Math.max(n%10, retornarMayor(n/10));
    }
}

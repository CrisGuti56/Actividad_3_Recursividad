package Recursivo;

public class Problema_D_R {
    public static int localizarNumero(long n, int digito){
        if (n % 10 == digito) return 0;
        if (n < 10) return -1;
        int r = localizarNumero(n / 10, digito);
        return (r == -1) ? -1 : 1 + r;
    }
}

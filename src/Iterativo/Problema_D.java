package Iterativo;

public class Problema_D {
    public static int localizarNumero(long n, int digito){
        int posicion = 0;
        do {
            if (n % 10 == digito)
                return posicion;
            else {
                n /= 10;
                posicion++;
            }
        } while (n > 0);
        return -1;
    }
}

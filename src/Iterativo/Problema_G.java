package Iterativo;

public class Problema_G {
    public static int numeroConRepeticion(long n, int digito){
        int r=0;
        while (n>0){
            if (n%10==digito){
                r = r *10 + digito;
            }
            n/=10;
        }
        return r;
    }
}

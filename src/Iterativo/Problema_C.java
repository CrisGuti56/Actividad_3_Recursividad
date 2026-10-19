package Iterativo;

public class Problema_C {
    public static long diferenciaConDigito(int numero, int digito){
        long multiplicando = 1, almacen = 0;
        if (numero==0) return digito;
        while(numero > 0){
            almacen += Math.abs(numero%10-digito) * multiplicando;
            multiplicando *= 10;
            numero /= 10;
        }
        return almacen;
    }
}

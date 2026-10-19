package Recursivo;

public class Problema_C_R {
    public static long diferenciaConDigito(int numero, int digito){
        if (numero < 10) return Math.abs((int) numero - digito);
        return 10 * diferenciaConDigito(numero / 10, digito) +
                Math.abs((int)(numero % 10) - digito);
    }
}

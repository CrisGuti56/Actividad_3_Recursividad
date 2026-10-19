package Iterativo;

public class Problema_B {
    public static int[] diferenciaContigua(int [] n){
        int [] resultado = new int [n.length-1];
        if (n.length < 2) return new int[0];
        else {
            for (int i = 0; i<n.length-1; i++){
                resultado[i] = Math.abs(n[i] - n[i+1]);
            }
        }
        return resultado;
    }
}

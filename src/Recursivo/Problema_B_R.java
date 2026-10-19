package Recursivo;

public class Problema_B_R {
    public static int[] diferenciaContigua(int [] n){
        if (n.length < 2) return new int[0];
        int[] r = new int[n.length - 1];
        diferenciaContigua(n, r, 0);
        return r;
    }
    private static void diferenciaContigua(int[] a, int[] r, int i) {
        if (i == r.length) return;               // caso base
        r[i] = Math.abs(a[i] - a[i + 1]);
        diferenciaContigua(a, r, i + 1);
    }
}

package Iterativo;

public class Problema_F {
    public static long invertirPares(long n){
        long par = 1, r = 0;
        while(n>0){
            long pareja = ((n%10)*10) + ((n/10)%10);
            r += pareja * par;
            par *= 100;
            n /= 100;
        }
        return r;
    }
}

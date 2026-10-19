package Iterativo;

public class Problema_A {
    public static byte retornarMayor(long n){
        byte mayor = 0;
        while(n > 0){
            byte digito =(byte)(n%10);
            n /=10;
            if(digito > mayor)
                mayor = digito;
        }
        return mayor;
    }
}

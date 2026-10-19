package Recursivo;
import static Recursivo.Problema_G_R.numeroConRepeticion;
import static Recursivo.Problema_A_R.retornarMayor;
import static Recursivo.Problema_C_R.diferenciaConDigito;
import static Recursivo.Problema_D_R.localizarNumero;
import static Recursivo.Problema_E_R.busquedaNumero;
import static Recursivo.Problema_F_R.invertirPares;
import static Recursivo.Problema_B_R.diferenciaContigua;

public class PruebaRecursivo {
    public static void main (String[] args){
        System.out.println(java.util.Arrays.toString(
                diferenciaContigua(new int[]{9,5,7,3,9,3,2,4,3})));
        //System.out.println(numeroConRepeticion(12983422121L, 2));
        //System.out.println(invertirPares(81293));
        //System.out.println(busquedaNumero(7193, 19));
        //System.out.println(localizarNumero(5271, 2));
        //System.out.println(diferenciaConDigito(328392, 7));
        //System.out.println(retornarMayor(1274652));
    }
}

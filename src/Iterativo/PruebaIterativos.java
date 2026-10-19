package Iterativo;

import static Iterativo.Problema_A.retornarMayor;
import static Iterativo.Problema_B.diferenciaContigua;
import static Iterativo.Problema_C.diferenciaConDigito;
import static Iterativo.Problema_D.localizarNumero;
import static Iterativo.Problema_E.busquedaNumero;
import static Iterativo.Problema_F.invertirPares;
import static Iterativo.Problema_G.numeroConRepeticion;

public class PruebaIterativos {
    public static void main (String [] args){
        System.out.println(numeroConRepeticion(12983422121L, 2));
        //System.out.println(invertirPares(81293));
        //System.out.println(busquedaNumero(7193, 19));
        //System.out.println(localizarNumero(5271, 2));
        //System.out.println(diferenciaConDigito(328392, 7));
        //System.out.println(java.util.Arrays.toString(
        //        diferenciaContigua(new int[]{9,5,7,3,9,3,2,4,3})));
        //System.out.println(retornarMayor(1274652));
    }
}

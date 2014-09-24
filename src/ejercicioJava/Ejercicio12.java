package ejercicioJava;

import java.util.Scanner;

/**
 * Created by facu on 29/07/2014.
 */
public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        salida("Ingrese numero decimal  :");
        int i=0;
        int x=0;
        i=in.nextInt();
        while ((i)!=0)
        {
            x=i%2;
            salida("\n"+x);
            i=i/2;
        }
    }
    public static void salida(String cadena){
        System.out.print(cadena);
    }
}


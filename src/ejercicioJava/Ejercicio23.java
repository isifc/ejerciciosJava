package ejercicioJava;

import java.util.Scanner;

/**
 * Created by facu on 29/07/2014.
 */
public class Ejercicio23 {

    public static void main(String[] args)

    {
        Scanner in = new Scanner(System.in);
        int n=0, i=0, aux=0;
        int[] v;
        salida("Cantidad de elementos: ");
        n = in.nextInt();
        v = new int[n];
        while(i<n)
        {
            salida("Ingrese los elementos del vector: ");
            v[i]=in.nextInt();
            i++;
        }
        i=0;
        while(i<n)
        {
            salida(v[i]+"-");
            i++;
        }

        aux = v[n-1];

        i=n-1;

        while(i>0)
        {
            v[i] = v[i-1];
            i-=1;
        }

        v[i] = aux;

        i=0;

        salida("\nEl nuevo vector es de la siguiente forma…");

        while(i<n)

        {

            salida(v[i]+"-");

            i++;

        }

    }
    public static void salida(String cadena){
        System.out.print(cadena);
    }
}

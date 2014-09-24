package ejercicioJava;

import java.util.Scanner;

/**
 * Created by facu on 29/07/2014.
 */
public class Ejercicio9 {

    public static void main(String[] args)

    {
        int n=0, razon=0, primer=1;
        Scanner in= new Scanner(System.in);
        while(primer>n || razon>=n)
        {
            salida("Numero:  ");
            n = in.nextInt();
            salida("Razón de Progresión: ");
            razon = in.nextInt();
            salida("Primer Numero: ");
            primer = in.nextInt();
            if(primer>=n || razon>=n)
            {
                salida("\n La Razón y el primer término no deben ser mayores al número límite");
            }
        }
    }
    public static void salida(String cadena){
        System.out.print(cadena);
    }
}

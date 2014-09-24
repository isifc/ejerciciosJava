package ejercicioJava;

import java.util.Scanner;

/**
 * Created by facu on 29/07/2014.
 */
public class Ejercicio20 {

    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        double n1=0, pi=Math.PI;
        salida("Ingrese Radio: ");
        n1 = in.nextDouble();
        salida("\n===  RESULTS  ===");
        System.out.println("\nDiametro: " + (n1 / pi));
        System.out.println("\nArea: " + (pi*(n1*n1)));
        salida("\nCircunferencia: " + ((2 * pi) * n1));
    }
    public static void salida(String cadena){
        System.out.print(cadena);
    }
}


package ejercicioJava;

import java.util.Scanner;

/**
 * Created by facu on 28/07/2014.
 */
public class Ejercicio10 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        int numero,fibo1,fibo2,i;
        System.out.println("Los " + 30 + " primeros términos de la serie de Fibonacci son:");

        fibo1=1;
        fibo2=1;

        salida(fibo1 + " ");
        for(i=2;i<=30;i++){
            System.out.print(fibo2 + " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        System.out.println();


    }

    public static void salida(String cadena){
        System.out.print(cadena);
    }

}

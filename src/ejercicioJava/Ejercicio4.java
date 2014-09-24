package ejercicioJava;

import java.util.Scanner;

/**
 * Created by facu on 28/07/2014.
 */
public class Ejercicio4 {

    public static void main(String arg[]){

        salida("ingrese un numero");
        Scanner in= new Scanner(System.in);
        int numero= in.nextInt();
        salida("Su factorial es: "+String.valueOf(factorial(numero)));


    }

    public static int factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void salida(String cadena){
        System.out.print(cadena);
    }

}


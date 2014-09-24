package ejercicioJava;

import java.util.Scanner;

/**
 * Created by facu on 29/07/2014.
 */
public class Ejercicio24 {

    public static void main(String arg[]){

        salida("ingrese un numero: ");
        Scanner in= new Scanner(System.in);
        int numero= in.nextInt();
        salida("ingrese otro numero: ");
        int numero2= in.nextInt();

        salida("Multiplicaicon: "+String.valueOf(multiplicacion(numero,numero2)));

    }

    public static void salida(String cadena){
        System.out.print(cadena);
    }

    public static int multiplicacion(int a, int b){
        int mult=0;
        while (b>0){
            mult+=a;
            b--;
        }
        return mult;
    }
}



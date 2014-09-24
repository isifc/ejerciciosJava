package ejercicioJava;

import java.util.Scanner;

/**
 * Created by facu on 28/07/2014.
 */
public class Ejercicio3 {



    public static void main(String arg[]){

        int array[];
        array= new int[10];
        salida("ingrese 10 numeros");
        Scanner in= new Scanner(System.in);
        int cont=0;
        int sum=0;

        for (int i = 0; i < 10; i++) {
            int numero = in.nextInt();
            array[i]=numero;
        }

        for (int i = 0; i < 10; i++) {
            if (array[i]%2==0){
                cont++;
                sum+=array[i];
            }
        }

        salida("Cantidad: "+String.valueOf(cont));
        salida("\n");
        salida("Suma: "+String.valueOf(sum));

    }

    public static void salida(String cadena){
        System.out.print(cadena);
    }

}


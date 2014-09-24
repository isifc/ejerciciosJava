package ejercicioJava;

import java.util.Scanner;

/**
 * Created by facu on 28/07/2014.
 */
public class Ejercicio15 {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int cont=0;
        int sum=0;

        salida("ingrese primer valor: ");
        int numero1= in.nextInt();
        salida("ingrese segundo valor: ");
        int numero2= in.nextInt();

        if (numero2>numero1){
            int aux= numero1;

            while (aux <= numero2){
                if (aux % 2 ==0){
                    cont++;
                }else{
                    sum+=aux;
                }
                salida(String.valueOf(aux)+" ");
                aux+=7;
            }

            salida("\ncantidad de pares: "+String.valueOf(cont)+"\n");
            salida("suma de los impares: "+String.valueOf(sum));
        }else{
            salida("Error, El primer valor debe ser mayor");
        }


    }

    public static void salida(String cadena){
        System.out.print(cadena);
    }

}

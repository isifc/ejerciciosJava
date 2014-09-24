package ejercicioJava;

import java.util.Scanner;

/**
 * Created by facu on 29/07/2014.
 */
public class Ejercicio21 {

    public static void main(String[] args){
        int n1,n2,n3,mayor,menor=0;
        Scanner in = new Scanner(System.in);
        salida("primer Valor: ");
        n1 = in.nextInt();
        salida("Segundo Valor: ");
        n2 = in.nextInt();

        if (n2 % n1==0){
             salida("TRUE");
        }else{
            salida("FALSE");
        }
    }

    public static void salida(String cadena){
        System.out.print(cadena);
    }
}


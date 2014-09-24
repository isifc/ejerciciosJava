package ejercicioJava;

import java.util.Scanner;

/**
 * Created by facu on 29/07/2014.
 */
public class Ejercicio8 {

    public static void main(String[] args)
    {

        Scanner in= new Scanner(System.in);
        int n=0, i=0;
        salida("Valor: ");
        n = in.nextInt();
        while(n>=10)
        {
            i++;
            n=n/10;
        }
       salida("Numero de digitos: "+(i+1));
    }
    public static void salida(String cadena){
        System.out.print(cadena);
    }
}


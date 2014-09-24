package ejercicioJava;

import java.util.Scanner;

/**
 * Created by facu on 29/07/2014.
 */
public class Ejercicio14 {

    public static void main(String[] args)

    {
        Scanner in= new Scanner(System.in);
        int n1,n2,c=0,p=0,im=0;
        salida("Introduce el numero 1:");
        n1=in.nextInt();
        salida("Introduce el numero 2:");
        n2=in.nextInt();
        for(int i=n1;i<=n2;i++)
        {
            salida("\nNumero: " + i);
            c++;
            if((i%2)==0)
            {
                p++;
            }
            else{
                im=im+i;

            }

        }
        salida("\nHay: "+c+" numeros");
        salida("\n"+p + " son pares");
        salida("\nLa suma de los impares son: " + im);
    }
    public static void salida(String cadena){
        System.out.print(cadena);
    }
}




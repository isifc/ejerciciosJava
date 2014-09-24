package ejercicioJava;

import java.util.Scanner;

/**
 * Created by facu on 29/07/2014.
 */
public class Ejercicio19 {

    public static void main(String[] args)
    {
        int n1,n2,n3,mayor,menor=0;
        Scanner in = new Scanner(System.in);
        salida("primer Valor: ");
        n1 = in.nextInt();
        salida("Segundo Valor: ");
        n2 = in.nextInt();
        salida("Tercer Valor: ");
        n3 = in.nextInt();
        salida("Suma: " + (n1+n2+n3));
        salida("Media Aritmética " + ((n1+n2+n3)/3));
        if(n1>n2)
        {
            mayor = n1;
            n1 = n2;
            n2 = mayor;
        }
        if(n1>n3)
        {
            mayor = n1;
            n1 = n3;
            n3 = mayor;
        }
        if(n2>n3)
        {
            mayor = n2;
            n2 = n3;
            n3 = mayor;
        }

        mayor = n3;
        menor = n1;
        salida("Mayor: " + mayor);
        salida("Menor: " + menor);

    }
    public static void salida(String cadena){
        System.out.print(cadena);
    }
}




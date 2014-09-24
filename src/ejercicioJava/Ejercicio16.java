package ejercicioJava;

import java.util.Scanner;

/**
 * Created by facu on 29/07/2014.
 */
public class Ejercicio16 {

    public static void main(String[] args)
    {
        int n1=1, n2=0, c=0, cp=0, sp=0;
        while(n1>n2)
        {
            Scanner in = new Scanner(System.in);
            salida("Ingrese un valor entero positivo: ");
            n1 = in.nextInt();
            salida("Ingrese el otro valor mayor al anterior: ");
            n2 = in.nextInt();
            if (n1>n2)
            {
                salida("Error debe ingresar el pimer valor menor al segundo");
            }
        }
        c=n1;
        while(c<=n2)
        {
            if(c%2==0)
            {
                salida("El valor leído es: "+c);
                cp++;
                sp=sp+c;
            }
            c++;
        }
        salida("Los números PARES encontrados son: " + cp);
        salida("La suma de los números PARES encontrados es: " + sp);
    }
    public static void salida(String cadena){
        System.out.print(cadena);
    }
}

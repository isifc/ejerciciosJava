package ejercicioJava;

import java.util.Scanner;

/**
 * Created by facu on 29/07/2014.
 */
public class Ejercicio7 {

    public static void main(String[] args)

    {
        Scanner in= new Scanner(System.in);
        double a, b, c, discr;
        salida("a:  ");
        a = in.nextDouble();
        if(a==0)
        {
            salida("\nEste programa sólo sirve para ecuaciones de 2ndo grado…");
            return;
        }
        salida("b: ");
        b = in.nextDouble();
        salida("c:  ");
        c = in.nextDouble();
        discr=b*b-4*a*c;
        salida("\nDiscriminante: " + discr);
        if(discr==0)
        {
            salida("Solución Doble");
        }
        if(discr<0)
        {
            salida("\nSolución Imaginaria");
        }
        if(discr>0)
        {
            salida("\nSolución Real y diferente");
        }
    }
    public static void salida(String cadena){
        System.out.print(cadena);
    }
}

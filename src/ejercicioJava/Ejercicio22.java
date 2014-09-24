package ejercicioJava;

/**
 * Created by facu on 29/07/2014.
 */
public class Ejercicio22 {


    public static void main(String[] args)
    {
        int c=0;
        salida(" Número");
        System.out.print("\t\tCuadrado");
        System.out.print("\t\tCubo");

        while(c<10)
        {
            c++;
            salida("\n");
            salida("    " + c);
            salida("\t\t" + (c*c));
            salida("\t\t\t\t" + c*c*c);

        }
        salida("\n============== FIN ==============");

    }
    public static void salida(String cadena){
        System.out.print(cadena);
    }
}

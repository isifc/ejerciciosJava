package ejercicioJava;

import java.util.Scanner;

/**
 * Created by facu on 29/07/2014.
 */
public class Ejercicio18 {

    public static void main(String[] args) {

        int n1=0,n2=0,suma=0,producto=0,diferencia=0;
        Scanner in = new Scanner(System.in);
        double cociente=0;

        salida("Numero 1: ");
        n1=in.nextInt();
        salida("Numero 2: ");
        n2=in.nextInt();
        suma=n1+n2;
        salida("\n=== RESULTS ===");
        salida("\n  Suma: "+suma);
        salida("\n=================");
        producto=n1*n2;
        salida("\n  Producto"+producto);
        salida("\n=================");
        diferencia= n1-n2;
        salida("\n  Diferencia: "+diferencia);
        salida("\n=================");
        cociente=(n1/n2);
        salida("\n  Cociente: " + cociente);
        salida("\n===== FIN =======");

    }

    public static void salida(String cadena){
        System.out.print(cadena);
    }
}

package ejercicioJava;

import java.util.Scanner;

/**
 * Created by facu on 28/07/2014.
 */
public class Ejercicio6 {

        public static void main(String[] args)
        {
            Scanner in= new Scanner(System.in);

            int numero1=0, numero2=1, cociente=0, i=0;
            while(numero2>numero1){
                salida("Ingrese un valor entero positivo: ");
                numero1 = in.nextInt();
                salida("Ingrese el otro valor menor al anterior: ");
                numero2 = in.nextInt();
                if (numero1>numero2){
                    salida("Error debe ingresar el pimer valor menor al segundo");
                }
            }
            cociente=numero1;
            while(cociente>=numero2)            {
                cociente-=numero2;
                i++;
            }
            salida("\nEl cociente por restas sucesivas es: " + i);
            salida("\nEl resto de la divisón por restas sucesivas es: " + cociente);


        }

    public static void salida(String cadena){
        System.out.print(cadena);
    }

}


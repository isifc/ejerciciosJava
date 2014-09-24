package ejercicioJava;



import java.util.Scanner;

/**
 * Created by facu on 29/07/2014.
 */
public class Ejercicio11 {

        public static void main(String[] args)
        {

            int c=0,aux=0, cp=0,n=0;
            Scanner in = new Scanner(System.in);
            salida("Ingrese un valor: ");

            n=in.nextInt();

            while(c<n){
                c++;
                while(aux<c){
                    aux++;
                    if (c%aux==0){
                        cp++;
                    }
                }
                if(cp==2)
                {
                    salida(" "+c);
                }
                cp=0;
                aux=0;
            }
            salida("\nEl menor nro primos es: 2");
        }

    public static void salida(String cadena){
        System.out.print(cadena);
    }
}


package ejercicioJava;

/**
 * Created by facu on 29/07/2014.
 */
public class Ejercicio17 {

    public static void main(String[] args){
        int suma=0;
        for (int i=1;i<1000;i++){
            if (i % 2 !=0){
                suma+=i;
            }
        }

        salida("la suma es: "+suma);
    }
    public static void salida(String cadena){
        System.out.print(cadena);
    }
}

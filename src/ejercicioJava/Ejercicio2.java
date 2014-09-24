package ejercicioJava;
/**
 * Created by facu on 28/07/2014.
 */
public class Ejercicio2 {

    public static void main(String arg[]){

        for (int i = 0; i < 10; i++) {
            salida(" \n") ;
            salida("==================");
            salida(" \n") ;
            for (int j=0;j<10;j++){
                salida((String.valueOf(j+1))+" ");

            }
        }

    }

    public static void salida(String cadena){
        System.out.print(cadena);
    }
}

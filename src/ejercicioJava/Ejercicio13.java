package ejercicioJava;

/**
 * Created by facu on 29/07/2014.
 */
public class Ejercicio13 {

    public void Vector20Elements(Object[] args){

        if(args.length==20){
            salida("tratar");
        }else{
            salida("no tratar");
        }

    }

    public static void salida(String cadena){
        System.out.print(cadena);
    }
}

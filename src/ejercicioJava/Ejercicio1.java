package ejercicioJava;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String arg[]){

        Scanner in= new Scanner(System.in);
        String str;
        salida("ingrese un numero: ");
        double numero = in.nextInt();

       if (numero< 500){
           salida("menor a 500");
           numero=numero*1.5;
           salida(String.valueOf(numero));
       }else if (numero< 1000){
           salida("entre 500 y 1000");
           numero*=1.07;
           salida(String.valueOf(numero));
       } else if(numero <=5000){
           salida("mayor a 1000 y menor a 5000");
           numero-=numero*0.05;
           salida(String.valueOf(numero));
       }else{
           salida("no hacer nada");
       }

    }

    public static void salida (String cadena) {

        System.out.println(cadena);
    }

}

package introjava;

import java.util.Scanner;


public class Nombre_Mayus_minus {

    public static void main(String[] args) {
Scanner leer = new Scanner(System.in).useDelimiter("\n");


    //Escribir
   System.out.println("Ingrese una frase: ");
   String nombre = leer.next();

    System.out.println("Su frase en mayusculas es: " +nombre.toUpperCase());
     System.out.println("Su frase en minusculas es: " +nombre.toLowerCase());
    }
}

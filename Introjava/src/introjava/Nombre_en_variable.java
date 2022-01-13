
package introjava;

import java.util.Scanner;


public class Nombre_en_variable {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

   String nombre = "";
    //Escribir
   System.out.println("Ingrese su nombre: ");
   nombre = leer.next();

    System.out.println ("Su nombre es: " +nombre);

    }
    
}

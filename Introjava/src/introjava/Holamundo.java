
package introjava;

import java.util.Scanner;


public class Holamundo {

    
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    String nombre;
    System.out.println("Ingresa tu nombre:");

    nombre = leer.next();
    System.out.println("Hola Mundo! Soy" + nombre +" y estoy programando en Java");
    
    }
    
}

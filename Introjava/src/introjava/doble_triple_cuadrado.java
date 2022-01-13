/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla 
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función 
Math.sqrt()
 */
package introjava;

import java.util.Scanner;


public class doble_triple_cuadrado {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        int db= num*2;
        int tp=num*3;
        double rc=Math.sqrt(num);
        System.out.println("El doble es: " +db);
        System.out.println("El triple es: " +tp);
        System.out.println("El rc es: " +rc);
    }
    
}

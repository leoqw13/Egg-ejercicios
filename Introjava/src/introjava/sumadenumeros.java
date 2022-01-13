/*
Sumar 2 numeros
 */
package introjava;

import java.util.Scanner;


public class sumadenumeros {

    public static void main(String[] args) {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    int num1 = 0;
    int num2 = 0;
    //Escribir
   System.out.println("Realizar la suma de los dos numeros a ingresar: ");
   System.out.println("Ingresar primer numero");
   num1 = leer.nextInt();

    System.out.println ("Ingresar segundo numero");
    num2 = leer.nextInt();
    System.out.println ("La suma de los numeros es de: ");
    System.out.println ("Suma: "+ (num1+num2));
    
    }
    
}

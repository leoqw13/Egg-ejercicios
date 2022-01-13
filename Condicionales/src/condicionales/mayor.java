/*
Implementar un programa que dado dos números enteros determine cuál es el 
mayor y lo muestre por pantalla.
 */
package condicionales;

import java.util.Scanner;

public class mayor {

    public static void main(String[] args) {
Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese 2 numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        if (num1>num2){
            System.out.println("El numero mayor es: " +num1);
        }else {
            System.out.println("El numero mayor es: " +num2);
        }
    }
}

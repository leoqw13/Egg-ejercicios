/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una 
vocal. Caso contrario mostrar un mensaje. 
 */
package condicionales;

import java.util.Scanner;

public class vocales {

   
    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una letra");
        String l = leer.next().toUpperCase();
        if (l.equals("A")||l.equals("E")||l.equals("I")|| l.equals("O") ||l.equals("U")){
            System.out.println("Es una vocal");
        }else{
            System.out.println("No es una vocal");
        }
    }
    
}

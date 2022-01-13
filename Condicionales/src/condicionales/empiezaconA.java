/*
11. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa 
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por 
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir 
“INCORRECTO”.
 */
package condicionales;

import java.util.Scanner;


public class empiezaconA {

 
    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase");
        String frase = leer.next();
//        if (frase.startsWith("A")){
//            System.out.println("Correcto");
//        }else {
//            System.out.println("Incorrecto");
//        }
//        String carac = "A";
        if (frase.substring(0,1).equals("A")){
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }
//        System.out.println(frase.substring(0,1));
    }
  
}

/*
10. Realizar un programa que solo permita introducir solo frases o palabras de 8 de 
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir 
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”.
 */
package condicionales;

import java.util.Scanner;

public class longu {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un frase de 8 caracteres");
        String frase = leer.next();
        int length = frase.length();
       if (length == 8){
            System.out.println("Correcto");
            
        }else{
            System.out.println("Incorrecto");
        }
    }
              
}
    

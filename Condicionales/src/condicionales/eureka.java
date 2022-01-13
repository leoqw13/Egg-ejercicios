/*
9. Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.

 */
package condicionales;

import java.util.Scanner;

public class eureka {

    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        String cadena = "eureka";
        if (frase.equals(cadena)){
            System.out.println("Correcto");
            
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}

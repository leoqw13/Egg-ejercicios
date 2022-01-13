//Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
//grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
package introjava;

import java.util.Scanner;


public class Temperatura {

    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
     System.out.println("Ingrese temperatura en C");
     int C = leer.nextInt();
     int F = 32 + (9*C / 5);
     System.out.println("La temperatura en F es:" +F);
          
    }
    
}

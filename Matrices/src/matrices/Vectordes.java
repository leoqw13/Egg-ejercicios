/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y 
los muestre por pantalla en orden descendente
 */
package matrices;

import java.util.Scanner;


public class Vectordes {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int[] arreglo = new int[101];

        for (int i = 0; i <= 100; i++) {
            arreglo[i] = i;
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
        for (int x = 100; x >= 0; x--) {
            System.out.print(arreglo[x] + " ");
        }
    }

}

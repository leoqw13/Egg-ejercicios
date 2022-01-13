/*
.
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le 
pida al usuario un numero a buscar en el vector. El programa mostrará donde se 
encuentra el numero y si se encuentra repetido

 */
package matrices;

import java.util.Scanner;


public class vectaleat_buscar {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese tamanio n");
        int n = leer.nextInt();
        int[] arreglo = new int[n];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 50 + 1);
//            System.out.println("Arreglo "+i+ "-->" +arreglo[i]);
            System.out.print(arreglo[i] + " ");

        }
        System.out.println("");
        System.out.println("Ingrese el valor a buscar");
        int nb = leer.nextInt();
        for (int i = 0; i < arreglo.length; i++) {
            if (nb == arreglo[i]){
                System.out.println("Se ha encontrado el numero buscado en la posicion: " + (i+1));
            }

        }
    }

}

/*
14. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
solicite números al usuario hasta que la suma de los números introducidos supere 
el límite inicial. 
 */
package condicionales;

import java.util.Scanner;


public class limite_positivo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese valor limite");
        int lim;
        int suma = 0;
        lim = leer.nextInt();
        while (suma <= lim){
            System.out.println("Ingrese numero a sumar");
            int num = leer.nextInt();
            if (suma<= lim){
            suma = suma + num;
        }
    }
        System.out.println("La suma total es: " + suma); 
        
    }
    
}

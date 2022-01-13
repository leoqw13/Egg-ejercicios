/*
16. Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa 
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el 
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
package condicionales;

import java.util.Scanner;

public class capturar0 {

   
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int suma = 0;
        System.out.println("Ingrese numeros a sumar");
        
    for(int i=1 ; i<=20 ; i++){
        int num = leer.nextInt();
        if (num<0)
            continue;
        if (num == 0){
            System.out.println("Se capturó el numero cero");
             break;
        }
        suma = suma + num;
        
    }
        System.out.println("La suma es:" + suma);
    }
    
    
}



package Ejercicio1E;

import java.util.ArrayList;
import java.util.Scanner;

/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
*/
public class Main {

    
    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
        ArrayList<Integer>listaNumeros=new ArrayList();
        int numero;
        System.out.println("Ingrese el numero a guardar en la lista");
       do{
           
           numero=leer.nextInt();
           listaNumeros.add(numero);
       }while(numero!=-99);
       listaNumeros.remove(listaNumeros.size()-1); //remuevo el valor que se encuentra en la ultima posicion osea -99
       double sumaNumeros=0;
        for (Integer listaNumero : listaNumeros) {
            System.out.print(listaNumero+"-");
            sumaNumeros+=listaNumero;
        }
        
        double promedio=sumaNumeros/listaNumeros.size();
        System.out.println("La suma de los elementos de la lista es de: "+sumaNumeros);
        System.out.println("El promedio de los elementos de la lista es de: "+promedio);
}
}
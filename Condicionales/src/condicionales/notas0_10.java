/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package condicionales;

import java.util.Scanner;

public class notas0_10 {


    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
          System.out.println("Escriba la nota entre 0 y 10");
//    int nota = leer.nextInt();
//    while (nota<0 || nota>10){
//        System.out.println("Nota fuera de rango");
//        System.out.println("Ingrese nuevamente");
//        nota = leer.nextInt();
//        if (nota>=0 && nota <=10){
//            break;
//        }
//    }
//        System.out.println("La  nota es correcta");    
        int nota;

     do{
         nota = leer.nextInt();
         if (nota<0 || nota>10){
             System.out.println("Nota fuera de rango");
             System.out.println("Ingrese nuevamente");
             nota = leer.nextInt();
         }
     } while (nota<0 || nota>10);
     System.out.println("La  nota es correcta");
   }
    
}

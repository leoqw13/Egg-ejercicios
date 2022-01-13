/*
5.Una obra social tiene tres clases de socios: 
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de 
descuento en todos los tipos de tratamientos. 
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de 
descuento para los mismos tratamientos que los socios del tipo A. 
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre 
dichos tratamientos. 
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real 
que represente el costo del tratamiento (previo al descuento) y determine el importe 
en efectivo a pagar por dicho socio.
 */
package condicionales;

import java.util.Scanner;

public class Socios {

    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in).useDelimiter("\n");
  System.out.println("Ingrese monto");
        double monto = leer.nextDouble();      
  System.out.println("Ingrese tipo de socio (a,b,c)");
        char soc = leer.next().charAt(0);
        char socm = Character.toUpperCase(soc);
        
        double total;
        switch (socm){
           
                    case 'A':
                        total = monto - (monto*0.5);
                      
                        System.out.println("El total es: " + total);
                        break;
                   case 'B':
                       total = monto - (monto*0.35);                      
                        System.out.println("El total es: " + total);
                   break;
                   case 'C':
                      total = monto;                      
                        System.out.println("El total es: " + total);
                   break;
                   default:
                        System.out.println("Caracter no valido");
                        break;
    }
    }
    }    


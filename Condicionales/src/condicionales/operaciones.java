/*
15. Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por 
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la 
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir 
del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el 
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú
 */
package condicionales;

import java.util.Scanner;


public class operaciones {


    public static void main(String[] args){
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese 2 numeros a operar");
        System.out.println("Ingrese el primero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo");
        int num2 = leer.nextInt();
        int op;
        while (num1 <1||num2<1){
            System.out.println("Los numeros deben ser positivos");
            System.out.println("Ingrese el primero");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo");
        num2 = leer.nextInt();
        }
        
        boolean salir = false;
        while (!salir){

            System.out.println("MENU\n" +
            "1. Sumar\n" +
            "2. Restar\n" +
            "3. Multiplicar\n" +
            "4. Dividir\n" +
            "5. Salir\n" +
            "Elija opción:");
            op = leer.nextInt();

                String enter;
                switch (op){
                   
                    case 1:
                        int suma = 0;
                        suma = num1 + num2;
                        System.out.println("La suma es: " + suma);
                        System.out.println("Presione enter para continuar");
                        enter = leer.next();
                        System.out.println("");
                        break;
                    case 2:
                        int resta = 0;
                        resta = num1 - num2;
                        System.out.println("La resta es: " + resta);
                        System.out.println("Presione enter para continuar");
                        enter = leer.next();
                        System.out.println("");
                        break;
                    case 3:
                        int mult = 0;
                        mult = num1 * num2;
                        System.out.println("La multiplicacion es: " + mult);
                        System.out.println("Presione enter para continuar");
                        enter = leer.next();
                        System.out.println("");
                        break;
                    case 4:
                        double div = 0.0;
                        div = num1 / num2;
                        System.out.println("La division es: " + div);
                        System.out.println("Presione enter para continuar");
                        enter = leer.next();
                        System.out.println("");
                        break;
                    case 5:
                        System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                        String confirm = leer.next();
                        if (confirm.equals("s")){
                            salir = true;
                        }
                        break;
                    default:
                        System.out.println("Numero no valido");
                        
                        
                }

    }    
    }
}

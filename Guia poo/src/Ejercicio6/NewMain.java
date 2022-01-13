/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos: 
18
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.

 */
package Ejercicio6;

import java.util.Scanner;


public class NewMain {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cafetera Cf = new Cafetera();
        boolean salir = false;
        int cantidadActual = 0;
        while (!salir) {
            int op;

            System.out.println("MENU\n"
                    + "1. Llenar Cafetera\n"
                    + "2. Vaciar Cafetera\n"
                    + "3. Agregar cafe\n"
                    + "4. Servir Taza\n"
                    + "5. Consultar Cantidad Actual\n"
                    + "6. Salir\n"
                    + "Elija opción:");
            op = leer.nextInt();

            String enter;
            switch (op) {

                case 1:
                    cantidadActual = Cf.llenarCafetera();
                    System.out.println("Presione enter para continuar");
                    enter = leer.next();
                    System.out.println("");
                    break;
                case 2:
                    cantidadActual = Cf.vaciarCafetera(cantidadActual);
                    System.out.println("Presione enter para continuar");
                    enter = leer.next();
                    System.out.println("");
                    break;
                case 3:
                    cantidadActual = Cf.agregarCafe(cantidadActual);
                    System.out.println("Presione enter para continuar");
                    enter = leer.next();
                    System.out.println("");
                    break;
                case 4:
                    cantidadActual = Cf.servirTaza(cantidadActual);
                    System.out.println("Presione enter para continuar");
                    enter = leer.next();
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Cantidad Actual: " +cantidadActual );
                    System.out.println("Presione enter para continuar");
                    enter = leer.next();
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");

                    String confirm = leer.next();

                    if (confirm.equals("s")) {
                        salir = true;
                    }
                    break;

                default:
                    System.out.println("Numero no valido");

            }

        }
    }

}

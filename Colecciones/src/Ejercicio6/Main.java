package Ejercicio6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su precio, eliminar un producto y mostrar los productos que tenemos con su precio
(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio. Realizar un menú para lograr todas las acciones previamente
mencionadas.
*/
public class Main {

    HashMap<String, Double> productos = new HashMap();
    Scanner leer2 = new Scanner(System.in).useDelimiter("\n"); //Para leer datos fuera del main

    public static void main(String[] args) {
        Main m = new Main(); //Creo un objeto debido a que java no me permite almacenar algunos datos en contextos estaticos
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); //Cada metodo estatico responde solo a su scanner dentro del metodo
        int op,opc;

        do {

            System.out.println("-------Menu---------\n"
                    + "1-Almacenar un producto\n"
                    + "2-modificar el precio de un producto\n"
                    + "3- Eliminar un producto\n"
                    + "4-Mostrar todos los productos\n"
                    + "5-Salir");

            System.out.println("Elija la accion que desea realizar");
            do{
            opc=leer.nextInt();
            
            op = m.opcion(opc);
            
            }while(op<1&&op>5);
            switch (op) {
                case 1:

                    m.agregarProducto();

                    break;
                case 2:
                    m.modificarPrecio();
                    break;
                case 3:
                    m.eliminarProducto();
                    break;
                case 4:
                    m.mostrarProductos();
                    break;
                default:
                    System.out.println("Hasta luego =)");
            }

        } while (op != 5);

    }

    public int opcion(int opcion) {
        
       int op=opcion;
        while (op < 1 && op > 5) {
            System.out.println("A ingresado la opcion incorrecta,ingresela nuevamente");
      
        }

        return op;
    }

    public void agregarProducto() {

        System.out.println("Ingrese el nombre del producto");
        String nombreProducto = leer2.nextLine();
        System.out.println("Ingrese el precio del producto");
        double precioProducto = leer2.nextDouble();
        leer2.nextLine();
        productos.put(nombreProducto, precioProducto);
        System.out.println("Producto agragado Exitosamente");
    }

    public void modificarPrecio() {
        System.out.println("Ingrese el nombre del producto a modificar");
        String clave = leer2.nextLine();
        System.out.println("Ingrese el nuevo valor del mismo");
        double nuevoPrecio = leer2.nextDouble();
        productos.put(clave, nuevoPrecio);
               System.out.println("Producto modificado Exitosamente");
    }

    public void eliminarProducto() {
        System.out.println("Ingrese el nombre del producto a eliminar");
        String buscarNombre = leer2.nextLine();
        productos.remove(buscarNombre);
               System.out.println("Producto eliminado Exitosamente");
    }

    public void mostrarProductos() {
       
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            System.out.println("Nombre del producto: " + entry.getKey() + " precio del producto: " + entry.getValue());

        }
       
    }
}

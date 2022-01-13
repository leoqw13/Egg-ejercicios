
package Ejercicio6;

import java.util.HashMap;
import java.util.Scanner;


public class Ejercicio6 {

    
    public static void main(String[] args) {
        HashMap<String, Double> productos = new HashMap<String,Double>();
        menu(productos);
        
    }
    
    public static void menu(HashMap<String, Double> productos){
        Scanner sc = new Scanner(System.in);
        while(true){
            int salir = 0;
            System.out.println("---------Menu-----------");
            System.out.println("1- Agregar Productos\n2-Modificar precio\n3-Eliminar producto\n4-Mostrar productos\n5-Salir");
            int opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    agregarProductos(productos);
                    break;
                case 2:
                    modificarPrecio(productos);
                    break;
                case 3:
                    eliminarProducto(productos);
                    break;
                case 4:
                    mostrarProductos(productos);
                    break;
                case 5:
                    salir = 1;
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
            }
            if(salir==1){
                break;
            }
        }
    }
    public static void agregarProductos(HashMap<String, Double> productos){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Ingrese el nombre del producto");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el precio del producto");
            double precio = sc.nextDouble();
            sc.nextLine();
            productos.put(nombre, precio);
            System.out.println("Presione cualquier tecla para cargar otro producto o S para salir");
            String salir = sc.nextLine();
            if(salir.toUpperCase().equals("S")){
                break;
            }
        }
    }
    public static void modificarPrecio(HashMap<String, Double> productos){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto a modificar");
        String productoCambiarPrecio = sc.nextLine();
        if(productos.containsKey(productoCambiarPrecio)){
            System.out.println("Ingrese el nuevo precio");
            double precioNuevo = sc.nextDouble();
            productos.put(productoCambiarPrecio, precioNuevo);
        }else{
            System.out.println("El producto no se encuentra en la lista");
        }
    }
    public static void eliminarProducto(HashMap<String, Double> productos){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto a eliminar");
        String productoEliminar = sc.nextLine();
        if(productos.containsKey(productoEliminar)){
            productos.remove(productoEliminar);
        }else{
            System.out.println("El producto no se encuentra en la lista");
        }
    }
    public static void mostrarProductos(HashMap<String, Double> productos){
        for(String aux: productos.keySet()){
            System.out.println("Producto: "+aux+" Precio: "+productos.get(aux));
        }
    }

}

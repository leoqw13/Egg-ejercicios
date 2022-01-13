package Ejercicio2E;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios. 
 */
public class Main {

    Scanner leer2 = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<CantanteFamoso> cantantes = new ArrayList();
        Main m = new Main();

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del cantante");
            String nombre = leer.nextLine();
            System.out.println("Ingrese el nombre del disco con mas ventas");
            String nombreDisco = leer.nextLine();
            cantantes.add(new CantanteFamoso(nombre, nombreDisco));
        }

        for (CantanteFamoso cantante : cantantes) {
            System.out.println(cantante); //implicitamente llama a toString de la otra clase

        }
        int op;
        do {
            m.menu();

            op = m.opcion();
            switch (op) {
                case 1:
                    m.agregarCantante(cantantes);
                    break;
                case 2:
                    m.mostrarCantantes(cantantes);
                    break;
                case 3:
                    m.eliminarCantante(cantantes);
                    break;
                case 4:
                    System.out.println("Hasta luego =)");
            }
        } while (op != 4);
        System.out.println("------Lista final de cantantes");
        m.mostrarCantantes(cantantes);
    }

    public void menu() {
        System.out.println("---------Menu-------\n"
                + "1-Agregar cantante\n"
                + "2-Mostrar lista de cantantes\n"
                + "3-Eliminar un cantante\n"
                + "4-Salir");

    }

    public int opcion() {
        int opcion;
        do {
            opcion = leer2.nextInt();
            if (opcion < 1 || opcion > 4) {
                System.out.println("A ingresado una opcion incorrecta,ingrese la opcion nuevamente");

            }
            leer2.nextLine();
        } while (opcion < 1 || opcion > 4);
        return opcion;
    }

    public void agregarCantante(ArrayList<CantanteFamoso> listaCantantes) {
        System.out.println("Ingrese nombre cantante");
        String nombre = leer2.nextLine();
        System.out.println("Ingrese nombre del disco mas vendido");
        String discoMasVendido = leer2.nextLine();
        listaCantantes.add(new CantanteFamoso(nombre, discoMasVendido));
    }

    public void mostrarCantantes(ArrayList<CantanteFamoso> listaCantantes) {
        for (CantanteFamoso cantante : listaCantantes) {
            System.out.println(cantante);
        }
    }

    public void eliminarCantante(ArrayList<CantanteFamoso> listaCantantes) {
        System.out.println("Ingrese el nombre del cantante a eliminar");
        String nombreCantante = leer2.nextLine();
        Iterator<CantanteFamoso> ite = listaCantantes.iterator();
        boolean SC = false;
        while (ite.hasNext()) {
            if (ite.next().getNombre().equalsIgnoreCase(nombreCantante)) {
                System.out.println("Esta seguro que quiere eliminarlo?S/N");
                String si = leer2.next();

                while (true) {
                    if (si.equalsIgnoreCase("S")) {
                        ite.remove();
                        System.out.println("Se ha eliminado: [" + nombreCantante + "]");
                        SC = true;
                        break;
                    } else {
                        if (si.equalsIgnoreCase("N")) {
                            System.out.println("No se ha eliminado nada");
                            break;
                        } else {
                            System.out.println("Confirme N o S");
                            si = leer2.next();
                        }
                    }
                }
            }
        }
        if (!SC) {
            System.out.println("No se encontro el cantante en la lista");
        }
    }
}

package EjerciciosExtras;

import java.util.ArrayList;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //creo un arraylist de personas
        ArrayList<Persona> personas = new ArrayList();
        MainService ms = new MainService();
        while (true) {
            ms.crearPersona(sc, personas);

            //pregunto si quiere cargar otra persona 
            System.out.println("Presione cualquier tecla para ingresar otra persona o S para salir");
            String salir = sc.nextLine();
            if (salir.toUpperCase().equals("S")) {
                break;
            }

        }
        //muestro los datos de cada persona guardada en el arrayList y sus perros
        ms.mostrarPersonas(personas);
    }

}

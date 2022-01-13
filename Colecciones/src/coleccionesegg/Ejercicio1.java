
package coleccionesegg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList.
*/
public class Ejercicio1 {

    
    public static void main(String[] args) {
        ArrayList<String> razas = new ArrayList();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Ingrese una raza de perro");
            String razaNueva = sc.nextLine();
            razas.add(razaNueva);
            System.out.println("Presione cualquier tecla para guardar otra raza o S para salir");
            String salir = sc.nextLine();
            if(salir.toUpperCase().equals("S")){
                break;
            }
        }
        int tamanioLista1 = razas.size();
        System.out.println("Razas guardadas");
        for(String aux: razas){
            System.out.println(aux);
        }
        
        /*Ejercicio 2
        Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
y se mostrará la lista ordenada.
        */
        System.out.println("Ingrese una raza para buscarla en la lista");
        String buscarRaza = sc.nextLine();
        Iterator iterator = razas.iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals(buscarRaza)){
                iterator.remove();
            }
        }
        int tamanioLista2 = razas.size();
        if(tamanioLista1 == tamanioLista2){
            System.out.println("No se encontró el perro en la lista");
        }
        Collections.sort(razas);
        System.out.println("Lista de razas ordenadas");
        for(String aux: razas){
            System.out.println(aux);
        }
        
    }

    
    

}

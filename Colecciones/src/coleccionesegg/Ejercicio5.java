
package coleccionesegg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará al usuario.
*/
public class Ejercicio5 {

    
    public static void main(String[] args) {
        HashSet<String> paises = new HashSet<String>();//no admite elementos repetidos
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println("Ingrese el nombre de un pais");
            String pais = sc.nextLine();
            paises.add(pais); //se guardan los paises en el hashSet paises
          System.out.println("Presione cualquier tecla para GUARDAR OTRO PAIS o (S) para SALIR");
            String salir = sc.nextLine();
            if(salir.toUpperCase().equals("S")){
                break;
            }
        }
        //se muestran todos los paises guardados
        System.out.println("Paises guardados\n"+paises);
       
        //ordenar la lista de paises. Primero convertimos el hashset a una lista
        ArrayList<String> paisesOrdenados = new ArrayList(paises);
        Collections.sort(paisesOrdenados);
        
        
        System.out.println("PAISES ORDENADOS ALFABETICAMENTE");
        for (String p : paisesOrdenados) {
            System.out.println("*"+p);
                       
        }
 
        
        //borrar un elemento
        System.out.println("Ingrese el nombre de un pais para borrarlo de la lista");
        String paisBorrar = sc.nextLine();
        //creamos el iterator
        Iterator<String> iterator = paises.iterator();
       boolean Cpais=false;
        while(iterator.hasNext()){//mientras quede un elemento en la lista
            if(iterator.next().equals(paisBorrar)){
                iterator.remove();
                System.out.println("Se ha removido el pais elegido");
                Cpais=true;
            }
        }
        //comprobar si el pais existe en la lista
        
        if(!Cpais){
            System.out.println("El pais no existe en la lista");
        }
        //mostramos la lista actualizada
        for (String p : paisesOrdenados) {
            System.out.println("*"+p);
                       
        }
    }

}

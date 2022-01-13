
package Ejercicio4;
/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
Para esto, tendremos una clase Pelicula con el titulo, director y duración de la
película (en horas). Implemente las clases y métodos necesarios para esta
situación, teniendo en cuenta lo que se pide a continuación:
18
En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario
si quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
*/
import java.util.ArrayList;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Pelicula p = new Pelicula();
        Pelicula_Service ps=new Pelicula_Service();
        ArrayList<Pelicula> peliculas = new ArrayList();
        String verif;
        int cont = 1;
        do{
            System.out.println("<<<<< CARGAR PELICULA N-" +cont +">>>>>");
            Pelicula Pelis_creadas = p.Crear();
            peliculas.add(Pelis_creadas);
            System.out.println("Desea guardaar otra pelicula?(S/N)");
            verif = leer.next().toUpperCase();
            cont++;
            
        }while(verif.equals("S"));
        
        
        ps.mostrarPeliculas(peliculas);
        System.out.print("Presiona enter para continuar");
        verif = leer.next();
        ps.mostrarPeliculasLargas(peliculas);
        System.out.print("Presiona enter para continuar");
        verif = leer.next();
        ps.ordenarMayorMenor(peliculas);
        System.out.print("Presiona enter para continuar");
        verif = leer.next();
        ps.ordenarMenorMayor(peliculas);
        System.out.print("Presiona enter para continuar");
        verif = leer.next();
        ps.ordenarPorTitulos(peliculas);
        System.out.print("Presiona enter para continuar");
        verif = leer.next();
        ps.ordenarPorDirector(peliculas);
        

    }
    
}

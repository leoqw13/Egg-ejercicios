/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
*/
package ejercicio1;

import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
   Libro L1=new Libro();
        System.out.println("ISBN");
String isbn = leer.next();
        System.out.println("Titulo:");
        String titulo = leer.next();
          System.out.println("Autor:");
        String autor = leer.next();
          System.out.println("Numero de paginas:");
        int numPaginas = leer.nextInt();
   L1.cargarLibro(isbn, titulo,autor,numPaginas);
 
   L1.mostrarLibro();
    }
    
}

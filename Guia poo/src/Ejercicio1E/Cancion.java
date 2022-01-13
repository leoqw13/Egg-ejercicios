
package Ejercicio1E;

import java.util.Scanner;


public class Cancion {
     private String titulo;
    private String autor;

    public Cancion() {
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", autor=" + autor + '}';
    }
    
  public void cargar() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese Titulo:");
        this.titulo = leer.next();
        System.out.print("Ingrese Autor:");
        this.autor = leer.next();
    }


}

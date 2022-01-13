
package Ejercicio4;

import java.util.Scanner;


public class Pelicula {
    private Scanner leer;
    private String Titulos;
    private String Director;
    private double Duracion;

    public Pelicula( String Titulos, String Director, double Duracion) {

        this.Titulos = Titulos;
        this.Director = Director;
        this.Duracion = Duracion;
    }

    public Pelicula() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void setTitulos(String Titulos) {
        this.Titulos = Titulos;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public void setDuracion(double Duracion) {
        this.Duracion = Duracion;
    }

    public Scanner getLeer() {
        return leer;
    }

    public String getTitulos() {
        return Titulos;
    }

    public String getDirector() {
        return Director;
    }

    public double getDuracion() {
        return Duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "Titulos=" + Titulos + ", Director=" + Director + ", Duracion=" + Duracion + '}';
    }
public Pelicula Crear(){
        System.out.println("<<<<< CARGAR PELICULA >>>>>");
        System.out.print("Titulo:");
        Titulos=leer.next();
        System.out.print("Director:");
        Director=leer.next();
        System.out.print("Duracion(h):");
        Duracion=leer.nextDouble();
//        double D=(double) Duracion;
        return new Pelicula(Titulos, Director, Duracion);
    }

}

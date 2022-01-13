
package Ejercicio2E;


public class CantanteFamoso {
private String nombre;
private String discoConMasVentas;

    public CantanteFamoso(String nombre, String discoConMasVentas) {
        this.nombre = nombre;
        this.discoConMasVentas = discoConMasVentas;
        
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Nombre del cantante: " + nombre + ", discoConMasVentas: " + discoConMasVentas ;
    }

}

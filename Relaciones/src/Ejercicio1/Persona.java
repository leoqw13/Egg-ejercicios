
package Ejercicio1;

import java.util.List;


public class Persona {
    private String nombre, apellido;
    private Integer documento, edad;
    
    private Perro perro;
    private List<Perro> perros;
    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer documento, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.edad = edad;
    
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", edad=" + edad + ", \nperro=" + perro + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getDocumento() {
        return documento;
    }

    public Integer getEdad() {
        return edad;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }
    
}


package Ejercicio12;

import java.util.Date;


public class Pers {
    private String nombre;
    private Date fecha_de_nacimiento;
    private Date fecha_actual;
    private int edad;

    public Pers() {
    }

    public Pers(String nombre, Date fecha_de_nacimiento, Date fecha_actual, int edad) {
        this.nombre = nombre;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
        this.fecha_actual = fecha_actual;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha_de_nacimiento(Date fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }

    public void setFecha_actual(Date fecha_actual) {
        this.fecha_actual = fecha_actual;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }

    public Date getFecha_actual() {
        return fecha_actual;
    }

    public int getEdad() {
        return edad;
    }

}


package Ejercicio12;

import java.util.Date;
import java.util.Scanner;


public class Pers_Serv {
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Pers datos = new Pers();

  public void Crear_Persona() {
        System.out.println("<<<<< USUARIO 1 >>>>>");
        System.out.print("-Ingrese Nombre: ");
        datos.setNombre(leer.next());
        System.out.println("-Fecha de Nacimiento");
        System.out.print("*Ingrese año: ");
        int year = leer.nextInt();
        year -= 1900;
        System.out.print("*Ingrese el mes: ");
        int mes = leer.nextInt();
        mes -= 1;
        System.out.print("*Ingrese dia:");
        int dia = leer.nextInt();
        datos.setFecha_de_nacimiento(new Date(year, mes, dia));
    }

 public void Calcular_Edad() {
        datos.setFecha_actual(new Date());
        Date fecha_actual = datos.getFecha_actual();
        Date fecha_de_nacimiento = datos.getFecha_de_nacimiento();
        datos.setEdad(fecha_actual.getYear() - fecha_de_nacimiento.getYear());
    }
 
 public void Menor_Que(int edad2) {
        if (datos.getEdad() > edad2) {
            System.out.println("La edad del Usuario 1 es Mayor de la edad del Usuario 2");
        } else {
            System.out.println("La edad del Usuario 2 es Mayor de la edad del Usuario 1");
        }
    }

public void Mostrar_Personal() {
        System.out.println("\n<<<<< DATOS USUARIO 1>>>>>");
        System.out.println("-Nombre: " + datos.getNombre());
        System.out.println("-Nacimiento: " + datos.getFecha_de_nacimiento());
        System.out.println("-Edad: " + datos.getEdad()); 
    }

}

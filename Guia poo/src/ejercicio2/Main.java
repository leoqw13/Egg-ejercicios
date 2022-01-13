/*
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package ejercicio2;

import java.util.Scanner;


public class Main {

     
    public static void main(String[] args) {
         Circulo C1=new Circulo();
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese radio");
        double radio = leer.nextDouble();
        double area = C1.area(radio);
        double perim = C1.perim(radio);
        System.out.println("El perimetro es:" +perim);
        System.out.println("El area es:"+area);
    }
    
}

/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package ejercici04;


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
    Cuadrado C1=new Cuadrado();
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese base");
        double base = leer.nextDouble();
               System.out.println("Ingrese altura");
        double altura = leer.nextDouble();
        double sup = C1.superficie(base,altura);
        double perim = C1.perimetro(base,altura);
        System.out.println("El perimetro es:" +perim);
        System.out.println("La superficie es:"+sup);
        C1.dibujarCuadrado(base, altura);
    }
    
}

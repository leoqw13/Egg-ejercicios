
package ejercicio4;

import java.util.Scanner;

public class Main4 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circulo circulo = new Circulo();
        
        System.out.println("Ingrese el radio del circulo");
        circulo.setRadio(sc.nextDouble());
        
        Rectangulo rectangulo = new Rectangulo();
        System.out.println("Ingree la base del rectangulo");
        rectangulo.setBase(sc.nextDouble());
        System.out.println("Ingrese la altura del rectangulo");
        rectangulo.setAltura(sc.nextDouble());
        
        circulo.calculoArea();
        circulo.calculoPerimetro();
        
        rectangulo.calculoArea();
        rectangulo.calculoPerimetro();
    }

}

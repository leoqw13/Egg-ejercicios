/*
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio 
de tipo real.
 */
package ejercicio2;


public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    Circulo() {
      
    }

    

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    public void crearCircunferencia(double radio){
        this.radio = radio;
         }
public double area(double radio){
   double area =  Math.PI*(Math.pow(radio,2));
    return area;
}
public double perim(double radio){
   double perim =  Math.PI*2*radio;
    return perim;
}
}

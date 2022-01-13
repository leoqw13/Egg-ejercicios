
package ejercicio4;


public class Rectangulo implements calculosFormas {
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    

    @Override
    public void calculoArea() {
        System.out.println("El área del rectangulo es: "+ this.base*this.altura);
    }

    @Override
    public void calculoPerimetro() {
        System.out.println("El perímetro del rectangulo es: "+ (this.base+this.altura)*2);
    }

}

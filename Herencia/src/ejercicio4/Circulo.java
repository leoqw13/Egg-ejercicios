
package ejercicio4;


public class Circulo implements calculosFormas {
    private double radio;

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    

    @Override
    public void calculoArea() {
        System.out.println("El área del circulo es: "+ calculosFormas.PI*this.radio*this.radio);
    }

    @Override
    public void calculoPerimetro() {
        System.out.println("El perimetro circulo es: "+ calculosFormas.PI*2*this.radio);
    }

}

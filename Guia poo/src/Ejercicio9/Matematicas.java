
package Ejercicio9;


public class Matematicas {
    private double numero1,numero2,aux,auxm;
    public Matematicas() {
    }

    public Matematicas(double numero1, double numero2, double aux, double auxm) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.aux = aux;
        this.auxm = auxm;
    }

    public void setAuxm(double auxm) {
        this.auxm = auxm;
    }

    public double getAuxm() {
        return auxm;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void setAux(double aux) {
        this.aux = aux;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public double getAux() {
        return aux;
    } 
}



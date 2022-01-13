
package ejercicio5;

import java.util.Scanner;


public class Cuenta {
int numeroCuenta;
long dni;
double Saldo_A;
int interes;
    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dni, double Saldo_A) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.Saldo_A = Saldo_A;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldo_A(double Saldo_A) {
        this.Saldo_A = Saldo_A;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }


    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public double getSaldo_A() {
        return Saldo_A;
    }

    public int getInteres() {
        return interes;
    }



}

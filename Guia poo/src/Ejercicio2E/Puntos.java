/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2E;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Puntos {
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public Puntos() {
    }

    public Puntos(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getY1() {
        return y1;
    }

    public double getY2() {
        return y2;
    }
 public void Crear_Puntos(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("<<< PUNTO 1 >>>");
        System.out.print("X1:");
        x1=leer.nextDouble();
        System.out.print("Y1:");
        y1=leer.nextDouble();
        System.out.println("\n<<< PUNTO 2 >>>");
        System.out.print("X2:");
        x2=leer.nextDouble();
        System.out.print("Y2:");
        y2=leer.nextDouble();
    }
public double Calcular_Distancia(){
        double x=x2-x1;
        double y=y2-y1;
        double distancia= (double) Math.sqrt(Math.pow(x, 2)+ Math.pow(y, 2));
        double truncar = Math.pow(10, 2);
        distancia= Math.round(distancia*truncar)/truncar;
        return distancia;
    } 

}

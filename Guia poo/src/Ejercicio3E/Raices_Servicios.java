
package Ejercicio3E;

import java.util.Scanner;

public class Raices_Servicios {
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Raices R1 = new Raices();
 public Raices cargar_valores() {
        System.out.println("<<< VALORES >>>");
        System.out.print("a:");
        R1.setA(leer.nextDouble());
        double a = R1.getA();
        System.out.print("b:");
        R1.setB(leer.nextDouble());
        double b = R1.getB();
        System.out.print("c:");
        R1.setC(leer.nextDouble());
        double c = R1.getC();
        return new Raices(a, b, c);
    }
public double Descriminante() {
        double descr = ((double) Math.pow(R1.getB(), 2)) - 4 * R1.getA() * R1.getC();
        R1.setAux(descr);
        return descr;
    }

 
    public boolean Tiene_Raices() {
       return R1.getAux() > 0;
    }
  public boolean Tiene_Raiz() {
       return R1.getAux() == 0;
    }


public void Obtener_Raices() {
        double a = R1.getA();
        double b = R1.getB();
        double c = R1.getC();
        double b2= Math.pow(b, 2);
        if(Tiene_Raices()){
            double Raiz1= (-b-Math.sqrt(b2-4*a*c))/(2*a);
            double Raiz2= (-b+Math.sqrt(b2-4*a*c))/(2*a);
            System.out.println("Raiz 1: "+Raiz1);
            System.out.println("Raiz 2: "+Raiz2);
        }else{
            System.out.println("No tiene raices o solo tiene una raiz");
        }
    }
 public void Obtener_Raiz() {
        double a = R1.getA();
        double b = R1.getB();
        double c = R1.getC();
        double b2= Math.pow(b, 2);
        if(Tiene_Raiz()){
            double Raiz= (-b)/(2*a);
            System.out.println("Raiz: "+Raiz);   
        }else{
            System.out.println("No tiene raices o tiene 2 raiz");
        }
    }
public void Calcular(){
        if(Tiene_Raices()){
            Obtener_Raices();
        }else{
            if(Tiene_Raiz()){
                Obtener_Raiz();
            }else{
                System.out.println("No tiene solucion de raices");
            }
        }
    }
}



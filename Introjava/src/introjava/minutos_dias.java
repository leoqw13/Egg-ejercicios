/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si 
el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 
horas.
 */
package introjava;

import java.util.Scanner;


public class minutos_dias {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int d, h, m;
        System.out.println("Ingrese el valor en minutos");
        m = leer.nextInt();
//        s = m*60;
        d = m / 1440;
        if(m < 1440){
            h=m/60;
        }else{
        h = (m / 60) - 24;
        }
        System.out.println(m + " Minutos son: "+ d + " Dias y "+ h + " Horas");
//        System.out.println(s+" Segundos");
    }

}


package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;


public class Main2 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Juego juegoNuevo = new Juego();
       
       System.out.println("Indique la cantidad de jugadores entre 1 y 6");
       int cantJugadores = sc.nextInt();
       if(cantJugadores>6){
           cantJugadores = 6;
       }
       
       ArrayList<Jugador> jugadores = new ArrayList();
        for (int i = 0; i < cantJugadores; i++) {
            Jugador jugadorNuevo = new Jugador();
            jugadorNuevo.setId(i+1);
            System.out.println("Ingrese nombre jugador"+(i+1));
            String nombre = sc.next();
            jugadorNuevo.setNombre(nombre);
            jugadores.add(jugadorNuevo);
        }
        RevolverAgua nuevoRevolver = new RevolverAgua();
        nuevoRevolver.llenarRevolver();
        
       juegoNuevo.llenarJuego(jugadores, nuevoRevolver);
//        System.out.println(nuevoRevolver.toString());
       juegoNuevo.ronda();
       
    }

}

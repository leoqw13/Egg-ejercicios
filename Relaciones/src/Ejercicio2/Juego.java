
package Ejercicio2;

import Ejercicio2.RevolverAgua;
import java.util.ArrayList;


public class Juego {
    private ArrayList<Jugador> jugadores;
    private RevolverAgua r;

    public Juego() {
        
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverAgua getR() {
        return r;
    }

    public void setR(RevolverAgua r) {
        this.r = r;
    }
    /*llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
     jugadores y el revolver para guardarlos en los atributos del juego.*/
    public void llenarJuego( ArrayList<Jugador>jugadores,RevolverAgua r){
        this.jugadores = jugadores;
        this.r = r;
    }
    
    public void ronda(){
        int cont = 0;
        String nombre =  null;
        esperar(1);
        for(Jugador aux: this.jugadores){//recorro la lista de jugadores, por cada jugador llamo a la funcion disparo
            System.out.print("El "+aux.getNombre()+" se apunta");
            esperar(1);
            System.out.print("...dispara");
            if(aux.disparo(this.r)== true){
                esperar(2);
//                 nombre = aux.getNombre();
                System.out.println("\033[36m...MOJADO!!!");
               
                break;
            }else{
                esperar(2);
                System.out.println("...salvado");
                cont++;
            }
            esperar(1);
        }
        if(cont == this.jugadores.size()){ //si pasaron todos los jugadores y ninguno se mojó, llamo de nuevo a la función ronda.
            ronda();
        }
        
    }
    public void esperar(int segundos){
        try {
            Thread.sleep(segundos * 1000);
         } catch (Exception e) {
            System.out.println(e);
         }
    } 

}

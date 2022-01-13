
package Ejercicio6;

import java.util.Scanner;


public class Cafetera {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
     int capacidadMaxima;
    int cantidadActual;

    public Cafetera() {
          this.capacidadMaxima = 100;
    }

    public Cafetera(int capacidadMaxima, int cantidadActua) {
        this.capacidadMaxima = 100;
        this.cantidadActual = cantidadActua;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }
    public int llenarCafetera(){
      
        cantidadActual= capacidadMaxima;
        System.out.println("Capacidad Actual: " +cantidadActual);
        return  cantidadActual;
    }
public int servirTaza(int cantidadActual){
//    Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//cuanto quedó la taza.

    System.out.println("Ingrese tamanio de la taza:");
    int tazaT=leer.nextInt();
    int taza=0;
    taza += cantidadActual;
    if(taza<tazaT){
        
         int x = (taza*100)/tazaT;
        System.out.println("La taza se ha llenado: "+ x+"%");
        cantidadActual=0;
    }else{
        System.out.println("La taza se ha llenado");
        cantidadActual-=tazaT;
    }
    
    return  cantidadActual;
}
public int vaciarCafetera(int cantidadActual){
//    pone la cantidad de café actual en cero. 
cantidadActual=0;
      return  cantidadActual;
}
public int agregarCafe(int cantidadActual){
       System.out.println("Ingrese cantidad de cafe:");
       int cant= leer.nextInt();
       cantidadActual+=cant;
       if(cantidadActual>100){
           System.out.println("Se ha exedido la capacidad. La cafetera esta llena (100)");
           cantidadActual=100;
       }
    return  cantidadActual;
}
}

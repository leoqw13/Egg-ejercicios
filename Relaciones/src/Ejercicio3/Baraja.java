
package Ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Baraja {
    ArrayList<Carta> cartas = new ArrayList();

    public Baraja() {
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }
    //metodo para crear la baraja
    public void crearBaraja(){
        String palo = "BASTO";
        for (int i = 1; i <= 4; i++) {
            if(i==2){
                palo = "ESPADAS";
            }else if(i==3){
                palo = "ORO";
            }else if(i==4){
                palo="COPAS";
            }
            for (int j = 1; j <= 10; j++) {
                Carta nuevaCarta = new Carta();
                    if(j==8){
                       nuevaCarta.setNumero(10);
                       nuevaCarta.setPalo(palo);
                    }else if(j==9){
                        nuevaCarta.setNumero(11);
                        nuevaCarta.setPalo(palo);
                    }else if(j==10){
                        nuevaCarta.setNumero(12);
                        nuevaCarta.setPalo(palo);
                    }else{
                        nuevaCarta.setNumero(j);
                        nuevaCarta.setPalo(palo);
                    }
                this.cartas.add(nuevaCarta);    
            }
            
        }
    }
    //barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar(){
        Collections.shuffle(this.cartas);
    }
    
    /*siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no
      haya más o se haya llegado al final, se indica al usuario que no hay más cartas.*/
    public void siguienteCarta(){
        if(this.cartas.isEmpty()){
            System.out.println("No hay mas cartas en la baraja.");
        }else{
            System.out.println("Carta: "+cartas.get(0).getNumero()+" de "+cartas.get(0).getPalo());
        }
    }
    
    //cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public void cartasDisponibles(){
        System.out.println("Cartas disponibles: "+this.cartas.size());
    }
    
    /*darCartas(): dado un número de cartas que nos pidan, le devolveremos ese
      número de cartas. En caso de que haya menos cartas que las pedidas, no
      devolveremos nada, pero debemos indicárselo al usuario.*/
    public void darCartas(ArrayList<Carta> cartasMonton, int numCartas){
        if(numCartas > this.cartas.size()){
            System.out.println("No hay cartas suficientes.");
        }else{
            for (int i = 0; i < numCartas; i++) {
                Carta nuevaCartaMonton = new Carta();
                nuevaCartaMonton.setNumero(this.cartas.get(i).getNumero());
                nuevaCartaMonton.setPalo(this.cartas.get(i).getPalo());
                cartasMonton.add(nuevaCartaMonton);
                this.cartas.remove(i);
            }
        }
    }
    
    //cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido
    //ninguna indicárselo al usuario
    public void cartasMonton(ArrayList<Carta> cartasMonton){
        if(cartasMonton.isEmpty()){
            System.out.println("No ha salido ninguna carta");
        }else{
            for(Carta aux: cartasMonton){
                System.out.println("Carta: "+aux.getNumero()+" de "+aux.getPalo());
            }
        }
    }
    
    //mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una
    //carta y luego se llama al método, este no mostrara esa primera carta.
    public void mostrarBaraja(){
        for(Carta aux: this.cartas){
            System.out.println("Carta: "+aux.getNumero()+" de "+aux.getPalo());
        }
    }
    
    public void menu(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Carta>cartasMonton = new ArrayList();
        boolean salir = true;
        while(salir){
          System.out.println("------MENU------\n1- Barajar\n2- Mostrar Siguiente Carta en la Baraja\n3- Nº de cartas en la Baraja\n4- Dar Cartas\n5- Mostrar las cartas repartidas\n6- Mostrar Baraja\n7- Salir ");  
          int opcion = sc.nextInt();
          switch(opcion){
              case 1:
                  barajar();
                  break;
              case 2:
                  siguienteCarta();
                  break;
              case 3:
                  cartasDisponibles();
                  break;
              case 4:
                  System.out.println("Indique cuantas cartas quiere");
                  int numCartas = sc.nextInt();
                  darCartas(cartasMonton, numCartas);
                  break;
              case 5:
                  cartasMonton(cartasMonton);
                  break;
              case 6:
                  mostrarBaraja();
                  break;
              case 7:
                  salir=false;
                  break;
              default:
                  System.out.println("Ingrese una opción valida");
          }
        }
        
        
    }
}

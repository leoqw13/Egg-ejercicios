
package Ejercicio2;


public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
        this.mojado = true;
        this.nombre = "Jugador";
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        this.nombre+= id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    /*disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
      mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
      revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
      devuelve true, sino false.*/
    public boolean disparo(RevolverAgua r){
        r.siguienteChorro();
        boolean mojado = r.mojar();
        if(mojado == true){
            this.mojado = false;
            return true;
        }else{
            return false;
        }
    }
    

}

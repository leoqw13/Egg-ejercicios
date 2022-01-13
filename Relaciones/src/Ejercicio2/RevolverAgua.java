
package Ejercicio2;


public class RevolverAgua {
    private int posTambor;
    private int posAgua;

    
    public RevolverAgua() {
        
    }
    

    public int getPosTambor() {
        return posTambor;
    }

    public int getPosAgua() {
        return posAgua;
    }
    //llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
    //valores deben ser aleatorios.
    public void llenarRevolver(){
        this.posTambor = (int)(Math.random()*6+1);
        this.posAgua = (int)(Math.random()*6+1);
    }
    //mojar(): devuelve true si la posición del agua coincide con la posición actual
    public boolean mojar(){
        return this.posTambor==this.posAgua;
    }
    //siguienteChorro(): cambia a la siguiente posición del tambor. Si está en la pos 6 cambia a la pos 1
   
    public void siguienteChorro(){
        if(this.posTambor==6){
            this.posTambor = 1;
        }else{
            this.posTambor++;
        }
    }
    //toString(): muestra información del revolver (posición actual y donde está el agua)
    @Override
    public String toString() {
        return "RevolverAgua{" + "posTambor=" + posTambor + ", posAgua=" + posAgua + '}';
    }
    

}

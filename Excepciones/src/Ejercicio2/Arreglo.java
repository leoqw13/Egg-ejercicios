
package Ejercicio2;

public class Arreglo {
    private int[] arreglo;

    

    public Arreglo() {
        this.arreglo = new int[2];
    }

    

    public int[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public void cargarArreglo(){
        for (int i = 0; i < 10; i++) {
            this.arreglo[i] = i;
        }
    }
    
    

}

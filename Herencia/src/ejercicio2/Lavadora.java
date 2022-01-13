
package ejercicio2;

import java.util.Scanner;


public class Lavadora extends Electrodomestico {
    
    private int carga;

    public Lavadora() {
    }
//    public Lavadora(int carga) {
//        this.carga = carga;
//    }

    public Lavadora(int carga, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }


    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){
        Scanner sc = new Scanner(System.in);
        super.crearElectrodomestico();
        System.out.println("Ingrese la carga de la lavadora");
        int carga = sc.nextInt(); sc.nextLine();
        this.carga = carga;
    }
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        if(this.carga>30){
            super.setPrecio(super.getPrecio()+500);
            
        }
    }

    @Override
    public String toString() {
        
        return super.toString()+"Lavadora{" + "carga=" + carga + '}';
    }
    
    

}

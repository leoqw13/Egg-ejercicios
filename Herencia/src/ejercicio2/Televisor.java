
package ejercicio2;

import java.util.Scanner;


public class Televisor extends Electrodomestico{
    private int resolucion;
    private boolean sintonizadorTDT;

    
    public Televisor(int resolucion, boolean sintonizadorTDT, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor() {
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    public void crearTelevisor(){
        Scanner sc = new Scanner(System.in);
        super.crearElectrodomestico();
        System.out.println("Ingrese la resolución del televisor");
        int resolucion = sc.nextInt(); sc.nextLine();
        this.resolucion = resolucion;
        System.out.println("Indique si el televisor tiene sintonizadorTDT");
        String res = sc.nextLine();
        res = res.toUpperCase();
        if(res.equals("SI")){
            this.sintonizadorTDT = true;
        }else{
            this.sintonizadorTDT = false;
        }
    }
    
   
    @Override
    public void precioFinal(){
        super.precioFinal();
        if(this.resolucion > 40){
            super.setPrecio(super.getPrecio()*1.4);
            
        }
        if(this.sintonizadorTDT == true){
            super.setPrecio(super.getPrecio()+500);
        }
    }

}

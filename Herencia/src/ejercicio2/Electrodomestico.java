
package ejercicio2;

import java.util.Scanner;


public class Electrodomestico {
    private double precio;
    private String color;
    private char consumo;
    private double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumo, double peso) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.consumo = consumo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    private void comprobarConsumoEnergetico(char letra){
        letra = Character.toUpperCase(letra);
        int asciiValor = letra;        
        if(asciiValor > 70){
            this.consumo = 'F';
        }else{
            this.consumo = letra;
        }
    }
    private void comprobarColor(String color){
        color = color.toUpperCase();
        if(!color.equals("BLANCO") && !color.equals("NEGRO") && !color.equals("ROJO") && !color.equals("AZUL") && !color.equals("GRIS")){
           this.color = "BLANCO"; 
        }else{
            this.color = color;
        }
    }
    public void crearElectrodomestico(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el color del electrodoméstico");
        String color = sc.nextLine();
        comprobarColor(color);
        System.out.println("Ingrese el consumo energético, una letra de la 'a' a la 'f'");
        char consumo = sc.next().charAt(0);
        comprobarConsumoEnergetico(consumo);
        System.out.println("Ingrese el peso del electrodoméstico");
        double peso = sc.nextDouble();
        this.peso = peso;
        this.precio= 1000;
        
    }
    
    public void precioFinal(){
        if(this.consumo =='A' ){
            this.precio+=1000;
        }else if(this.consumo == 'B'){
            this.precio+=800;
        }else if(this.consumo == 'C'){
            this.precio+=600;
        }else if(this.consumo == 'D'){
            this.precio+=500;
        }else if(this.consumo=='E') {
            this.precio+=300;
        }else{
            this.precio+=100;
        }
        if(this.peso >= 1 && this.peso <= 19){
            this.precio+=100;
        }else if(this.peso >= 20 && this.peso <= 49){
            this.precio+=500;
        }else if(this.peso >= 50 && this.peso <= 79){
            this.precio+=800;
        }else{
            this.precio+=1000;
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }

    
    

}

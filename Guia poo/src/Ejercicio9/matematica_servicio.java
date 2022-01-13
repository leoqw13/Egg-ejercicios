/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio9;

/**
 *
 * @author Usuario
 */
public class matematica_servicio {
Matematicas datos = new Matematicas();

    public void Crear_Numero() {
        datos.setNumero1((double) Math.random() * (9 - 0 + 1) + 0);
        System.out.print("Numero1: " +datos.getNumero1()+"\n");

        datos.setNumero2((double) Math.random() * (9 - 0 + 1) + 0);
        System.out.print("Numero2: " + datos.getNumero2()+"\n");
    }
    
    public void Mayor_Valor(){
        datos.setAux(Math.max(datos.getNumero1(), datos.getNumero2()));
        System.out.println("El Mayor es: "+datos.getAux());
    }
     public void Menor_Valor(){
        datos.setAuxm(Math.min(datos.getNumero1(), datos.getNumero2()));
        System.out.println("El Menor es: "+datos.getAuxm());
    }
    public void Potencia(){
        datos.setAux(Math.round(datos.getAux()));
        datos.setAuxm(Math.round(datos.getAuxm()));
        System.out.println("Potencia: "+Math.pow(datos.getAux(), datos.getAuxm()));
    }
    
    public void Calcular_Raiz(){
        
        datos.setAuxm(Math.abs(datos.getAuxm()));
        System.out.println("Raiz Cuadrada: "+Math.sqrt(datos.getAuxm()));
    }  
}
    


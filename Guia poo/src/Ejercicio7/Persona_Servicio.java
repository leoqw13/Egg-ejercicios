/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Persona_Servicio {
      private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona datos = new Persona();
public Persona datos() {
        
        System.out.print("Ingrese Nombre: ");
        datos.setNombre(leer.next());
        String nombre=datos.getNombre();
        System.out.print("Ingrese Edad: ");
        datos.setEdad(leer.nextInt());
        int edad=datos.getEdad();
        String sexo;
        do {
            System.out.print("Ingrese Sexo(M o F): ");
            datos.setSexo(leer.next().toUpperCase());
            sexo=datos.getSexo();
            if (sexo.equals("M") || sexo.equals("F")) {
            } else {
                System.out.println("Dato ingresado incorrecto");
            }
        } while (!sexo.equals("F") && !sexo.equals("M"));
        System.out.print("Ingrese Peso: ");
        datos.setPeso(leer.nextDouble());
        double peso=datos.getPeso();
        System.out.print("Ingrese Altura: ");
        datos.setAltura(leer.nextDouble());
        double altura=datos.getAltura();
        CalcularMC();
        verificar();
        return new Persona(nombre, sexo, edad, peso, altura,datos.getMC(), datos.isMayor_de_edad());
    }
public void CalcularMC() {
        datos.setMC(datos.getPeso() / (datos.getAltura()*datos.getAltura()));
        if (datos.getMC() < 20) {
            datos.setMC(-1); /*Peso ideal*/
            
        }
        if (datos.getMC() >= 20 && datos.getMC() <= 25) {
            datos.setMC(0); /*Por debajo del peso ideal*/
            
        }
        if (datos.getMC() > 25) {
            datos.setMC(1); /*Sobrepeso*/
           
        }
    }

    public void verificar() {
        if (datos.getEdad() >= 18) {
            datos.setMayor_de_edad(true);
            
        } else {
            datos.setMayor_de_edad(false);
            
        }
     
    }

public void MC_Edad() {
        if(datos.getMC()==-1)
        {System.out.println("MC: " + datos.getMC() + " Peso debajo del ideal, Mayor de edad: " + datos.isMayor_de_edad());}
        if(datos.getMC()==0)
        {System.out.println("MC: " + datos.getMC() + " Peso ideal, Mayor de edad: " + datos.isMayor_de_edad());}
        if(datos.getMC()==1)
        {System.out.println("MC: " + datos.getMC() + " Sobrepeso, Mayor de edad: " + datos.isMayor_de_edad());}
    }    
}




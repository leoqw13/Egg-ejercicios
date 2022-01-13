
package EjerciciosExtras;

import java.util.ArrayList;
import java.util.Scanner;


public class MainService {
    public ArrayList<Persona> crearPersona(Scanner sc,ArrayList<Persona> personas) {
        
      Persona nuevaPersona = new Persona();
                System.out.println("Ingrese su nombre");
             nuevaPersona.setNombre(sc.nextLine());
                System.out.println("Ingrese su apellido");
       nuevaPersona.setApellido(sc.nextLine());
                System.out.println("Ingrese su edad");
           nuevaPersona.setEdad(sc.nextInt());

adoptarPerro(sc, personas, nuevaPersona);

return personas;
  }
  
  private void adoptarPerro(Scanner sc, ArrayList<Persona> personas, Persona nuevaPersona){
 
      
      boolean adoptar;
                        do{
                    adoptar = true;
                    System.out.println("Elija un nombre de algun perro para adoptar:");

                    for (DatosPerros perro : DatosPerros.values()) {
                        System.out.println((perro.ordinal()+1)+"- "+perro.getNombre());

                    }
                    int posPerro = sc.nextInt();sc.nextLine();
                    
                    //recorro el arrayList de personas preguntando si el nombre del perro ya existe
                    for (Persona persona : personas) {
                        if (persona.getPerro().getNombre().equalsIgnoreCase(DatosPerros.values()[posPerro-1].getNombre())) {
                                //si el nombre del perro ya existe, el usuario tendrá que elejir otro perro
                                adoptar = false;
                                System.out.println(DatosPerros.values()[posPerro-1].getNombre() + " ya fue adoptado, elija otro perro");
                                break;
                        }
                    }
                    //si el nombre del perro no existe asigno el perro a la persona
                    
                    if (adoptar == true) {
                        System.out.println("Usted adoptó a "+DatosPerros.values()[posPerro-1].getNombre());
                        
                        nuevaPersona.setPerro(new Perro(DatosPerros.values()[posPerro-1].getNombre(),DatosPerros.values()[posPerro-1].getRaza(), DatosPerros.values()[posPerro-1].getEdad(), DatosPerros.values()[posPerro-1].getNombre()));
                        
                    }
                }while(!adoptar);
                        //guardo la persona a la lista de personas
            personas.add(nuevaPersona); 
    
    }
    
public void mostrarPersonas(ArrayList<Persona> personas){
         //muestro los datos de cada persona guardada en el arrayList y sus perros
        for (Persona persona : personas) {
                    System.out.println(persona.toString());
                    System.out.println("Perro adoptado: "+persona.getPerro().getNombre()+","+persona.getPerro().getRaza()+","+persona.getPerro().getTamanio());
                
            }
    }
}

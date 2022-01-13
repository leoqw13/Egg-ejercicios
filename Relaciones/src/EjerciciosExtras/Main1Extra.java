
package EjerciciosExtras;

import java.util.ArrayList;
import java.util.Scanner;


public class Main1Extra {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Perro> perros = new ArrayList();
        //asigno los datos de la clase enum a un array list de Perro
        for (DatosPerros datos: DatosPerros.values()) {
            Perro nuevoPerro = new Perro();
            nuevoPerro.setNombre(datos.getNombre());
            nuevoPerro.setRaza(datos.getRaza());
            nuevoPerro.setEdad(datos.getEdad());
            nuevoPerro.setTamanio(datos.getTamanio());
            
            perros.add(nuevoPerro);
        }
        //creo un arraylist de personas
        ArrayList<Persona> personas = new ArrayList();
        while(true){
            
                Persona nuevaPersona = new Persona();
                System.out.println("Ingrese su nombre");
                nuevaPersona.setNombre(sc.nextLine());
                System.out.println("Ingrese su apellido");
                nuevaPersona.setApellido(sc.nextLine());
                System.out.println("Ingrese su edad");
                nuevaPersona.setEdad(sc.nextInt());
               
                boolean adoptar;
                
                do{
                    adoptar = true;
                    System.out.println("Elija un nombre de algun perro para adoptar:");
                    int cont=1;
                        for (Perro perro : perros) {
                        System.out.println(cont+"- "+perro.toString());
                        cont++;
                        }
                    int posPerro = sc.nextInt();sc.nextLine();
                    
                    //recorro el arrayList de personas preguntando si el nombre del perro ya existe
                        for (Persona persona : personas) {
                         if (persona.getPerro().getNombre().equals(perros.get(posPerro-1).getNombre())) {
                                //si el nombre del perro ya existe, el usuario tendrá que elejir otro perro
                                adoptar = false;
                                System.out.println(perros.get(posPerro-1).getNombre() + " ya fue adoptado, elija otro perro");
                                break;
                        }
                    }
                    //si el nombre del perro no existe asigno el perro a la persona
                    if (adoptar == true) {
                        System.out.println("Usted adoptó a "+perros.get(posPerro-1).getNombre());
                        nuevaPersona.setPerro(perros.get(posPerro-1));
                        
                    }
                }while(adoptar == false);
                //guardo la persona a la lista de personas
                personas.add(nuevaPersona);
                //pregunto si quiere cargar otra persona 
                System.out.println("Presione cualquier tecla para ingresar otra persona o S para salir");
                String salir = sc.nextLine();
                if(salir.toUpperCase().equals("S")){
                    break;
                }
                
        }
        //muestro los datos de cada persona guardada en el arrayList y sus perros
        for (Persona persona : personas) {
                    System.out.println(persona.toString());
                    System.out.println("Perro adoptado: "+persona.getPerro().getNombre()+","+persona.getPerro().getRaza()+","+persona.getPerro().getTamanio());
                
            }
    }


    

}

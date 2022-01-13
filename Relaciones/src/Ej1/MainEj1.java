
package Ej1;

public class MainEj1 {

    
    public static void main(String[] args) {
        Perro perro1 = new Perro("boby", 4, "puroPerro", "mediano");
        Perro perro2 = new Perro("pepe", 4, "labrador", "grande");
        Persona persona1 = new Persona("Julio", "Perez", 25, 35619875, perro1);
        Persona persona2 = new Persona("Maria", "Gomez", 30, 30556087, perro2);
        
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        
        
    }

}

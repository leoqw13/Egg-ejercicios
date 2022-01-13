
package Ejercicio1;

import java.util.ArrayList;
import java.util.List;


public class Main {


    public static void main(String[] args) {

Perro pr1 = new Perro("Otto", TipoPerro.MANTO_NEGRO.getValor(), 5, 1.20);
Perro pr2 = new Perro("Axel", TipoPerro.PICHICHO.getValor(), 10, 1.23);
List<Perro> perros = new ArrayList();
perros.add(pr1);
perros.add(pr2);
Persona p1 = new Persona("Leo", "Wolf", 40822292, 23);
Persona p2 = new Persona("Ivan", "Luere", 41833392, 23);
p1.setPerro(pr2);
p2.setPerro(pr1);
List<Persona> personas = new ArrayList();
personas.add(p1);
personas.add(p2);

        for (Persona aux : personas) {
            System.out.println(aux.toString());
            
        }
    }
    
}

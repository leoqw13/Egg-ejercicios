
package Ejercicio3;

import Ejercicio3.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
de tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Despues de ese bluce tendremos el siguiente método en la clase Alumno:
Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
método. Dentro del método se usará la lista notas para calcular el promedio final de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
main. 
*/
public class Ejercicio3 {

    
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList();
        Scanner sc = new Scanner(System.in);
        
        
        while(true){
            Alumno nuevoAlumno = new Alumno();
            ArrayList<Integer> notas = new ArrayList();
            System.out.println("Ingrese el nombre del alumno: ");
            String nombre = sc.nextLine();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota: "+(i+1));
                notas.add(sc.nextInt());
            }
            nuevoAlumno.setNombre(nombre);
            nuevoAlumno.setNotas(notas);
            alumnos.add(nuevoAlumno);
            sc.nextLine();
            System.out.println("Presione cualquier tecla para cargar otro alumno o S para salir");
            String salir = sc.nextLine();
            if(salir.toUpperCase().equals("S")){
                break;
            }
        }
        //mostrar alumnos
//        for(Alumno aux: alumnos){
//            System.out.println(aux.getNombre());
//            for(Integer n: aux.getNotas()){
//                System.out.println(n);
//            }
//        }
        System.out.println("Ingrese el nombre del alumno que quiere mostrar su promedio: ");
        String nombreNotaFinal = sc.nextLine();
        double promedio =0;
        for(Alumno aux: alumnos){
            if(aux.getNombre().equals(nombreNotaFinal)){
                promedio = aux.notaFinal(nombreNotaFinal);
            }
        }
        System.out.println("El promedio de "+nombreNotaFinal+" es: "+promedio);
        
    }
    
    

}

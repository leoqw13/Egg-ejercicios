/*
6. Leer la altura de N personas y determinar el promedio de estaturas que se
encuentran por debajo de 1.60 mts. y el promedio de estaturas en genera
 */
package condicionales;

public class estatura {

   
    public static void main(String[] args) {
 java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");
        double estatura;
        double promedio_bajo;
        double promedio_total;
        int alumnos;
        int contador1 = 0;
        int contador2 = 0;
        double suma1 = 0.0;
        double suma2 = 0.0;
        
        System.out.println("Ingresar cantidad de alumnos a analizar");
        alumnos = leer.nextInt();
        
        for (int i = 1; i <= alumnos; i++){
            System.out.println("Ingresar estatura de los alumnos");
            estatura = leer.nextDouble();
            suma1 = suma1 + estatura;
            
            if (estatura < 1.60){
                suma2 = suma2 + estatura;
                contador2 = contador2 +1;
            }
           
        }
        
        promedio_bajo = (suma2/contador2);
        promedio_total = (suma1/alumnos);
        System.out.println("El promedio de estauras que se encuentran por debajo de 1.60 es: "+promedio_bajo);
        System.out.println("El promedio de estauras totales es: "+promedio_total);
    }
    }
    


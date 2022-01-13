
package Ejercicio2;

/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el
código para generar y capturar una excepción ArrayIndexOutOfBoundsException
(índice de arreglo fuera de rango).
*/
public class main2 {

    
    public static void main(String[] args) {
        Arreglo nuevoArreglo = new Arreglo();
        
       try{
           nuevoArreglo.cargarArreglo();
       } catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Error: no se pueden almacenar mas de dos numeros: "+e.toString());
       }finally{
           System.out.println("Saliendo del programa...");
       }
       
        
       
        
    }

}

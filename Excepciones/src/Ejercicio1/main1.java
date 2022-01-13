
package Ejercicio1;
/*
Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el
código con una cláusula try-catch para probar la nueva excepción que debe ser
controlada.
*/

public class main1 {

    
    public static void main(String[] args) throws ValidarNumero {
        
        //try catch
        Persona nuevaPersona = new Persona();
        nuevaPersona = null;
        try{
            System.out.println("Es mayor de edad: "+ nuevaPersona.mayorEdad());
        }catch(NullPointerException e){
            System.out.println("Error: "+e.toString());
        }finally{
            System.out.println("saliendo del programa");
        }
        
        //throws
//        try{
//            System.out.println("Es mayor de edad: "+ nuevaPersona.mayorEdad());
//        }catch(Exception e){
//            System.out.println("Error: "+e.toString());
//        }finally{
//            System.out.println("saliendo del programa");
//        }
        

        //throw
//        Persona persona2 = new Persona();
//        try{
//            persona2.mayorEdad();
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }finally{
//            System.out.println("saliendo del programa");
//        }
        

        //throw personalizado
//        Persona persona2 = new Persona();
//        if(persona2.getEdad()==0){
//            throw new ValidarNumero("Error: Numero igual a cero");
//        }
    }

}

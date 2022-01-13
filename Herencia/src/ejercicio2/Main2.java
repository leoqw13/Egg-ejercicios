
package ejercicio2;


public class Main2 {

    
    public static void main(String[] args) {
        
          Lavadora nuevaLavadora = new Lavadora();
          System.out.println("-------Lavadora-------");
          nuevaLavadora.crearLavadora();
          nuevaLavadora.precioFinal();
                    
          Televisor nuevoTelevisor = new Televisor();
          System.out.println("-------Televisor--------");
          nuevoTelevisor.crearTelevisor();
          nuevoTelevisor.precioFinal();
          
          System.out.println("Precio final de la lavadora: "+nuevaLavadora.getPrecio());
          System.out.println("Precio final del televisor: "+ nuevoTelevisor.getPrecio());
    }

}

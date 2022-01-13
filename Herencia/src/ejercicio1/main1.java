
package ejercicio1;

public class main1 {

    
    public static void main(String[] args) {
        
        Perro perro = new Perro("Stich","Carnivoro",15,"Doberman");
        perro.alimentarse();
        
        Perro perro1 = new Perro("Teddy", "Croquetas",10,"Chihuahua");
        perro1.alimentarse();
        
        Gato gato = new Gato("Pelusa","Galletas",15,"Siames");
        gato.alimentarse();
        
        Caballo caballo = new Caballo("Spark","Pasto",25,"Fino");
        caballo.alimentarse();
    }

}


package EjerciciosExtras;


public enum DatosPerros {
    BOBY("Boby","Callejero",2,"mediano"), COCO("Coco","Caniche",3,"pequeño"), THOR("Thor","pequines",4,"pequeño"), MAX("Max","Ovejero",2,"grande"), ROCKY("Rocky","Bulldog",3,"mediano"), TOBY("Toby","Callejero",1,"mediano");
    
    private String nombre;
    private String raza;
    private int edad;
    private String tamanio;

    private DatosPerros(String nombre, String raza, int edad, String tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public static DatosPerros getBOBY() {
        return BOBY;
    }

    public static DatosPerros getCOCO() {
        return COCO;
    }

    public static DatosPerros getTHOR() {
        return THOR;
    }

    public static DatosPerros getMAX() {
        return MAX;
    }

    public static DatosPerros getROCKY() {
        return ROCKY;
    }

    public static DatosPerros getTOBY() {
        return TOBY;
    }

    

    
    
    
}

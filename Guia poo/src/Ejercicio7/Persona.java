
package Ejercicio7;


public class Persona {
     private String nombre,sexo;
    private int edad;
    private double peso,altura;
    private double MC;
    private boolean Mayor_de_edad;

    public Persona() {
    }


    public Persona(String nombre, String sexo, int edad, double peso, double altura, double MC, boolean Mayor_de_edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.MC = MC;
        this.Mayor_de_edad = Mayor_de_edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setMC(double MC) {
        this.MC = MC;
    }

    public void setMayor_de_edad(boolean Mayor_de_edad) {
        this.Mayor_de_edad = Mayor_de_edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getMC() {
        return MC;
    }

    public boolean isMayor_de_edad() {
        return Mayor_de_edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura + ", MC=" + MC + ", Mayor_de_edad=" + Mayor_de_edad + '}';
    }

}

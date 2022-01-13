
package Ejercicio1;

public class Persona {
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    //try catch
     public boolean mayorEdad(){
        if(this.edad<18){
            return false;
        }else{
            return true;
        }
    }
     
    //throws
//    public boolean mayorEdad() throws Exception{
//        if(this.edad<18){
//            return false;
//        }else{
//            return true;
//        }
//    } 
     
     
    //trow
//    public void mayorEdad() throws Exception{
//        if(this.edad==0){
//            throw new Exception ("Error: edad no tiene valor");
//        }else{
//            if(this.edad<18){
//                System.out.println("Es menor de edad");
//            }else{
//                System.out.println("Es mayor de edad");
//            }
//        } 
//    }
}

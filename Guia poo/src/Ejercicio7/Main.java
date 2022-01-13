/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
(incluidos), significa que el peso está por debajo de su peso ideal y la función
devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
hacer uso de constantes para devolver estos valores.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.
 */
package Ejercicio7;


public class Main {

 
    public static void main(String[] args) {
        Persona_Servicio datos = new Persona_Servicio();
        int mayores = 0, menores = 0, p_ideal = 0, p_bajo = 0, sobre_p = 0;
        Persona p[] = new Persona[4];
        
        for(int i=0;i<p.length;i++){
            System.out.println("Persona: "+(i+1));
        p[i] = datos.datos();
            datos.CalcularMC();
        datos.verificar();
        datos.MC_Edad();
        if (p[i].getMC() == -1) {
            p_bajo++;
        }
        if (p[i].getMC() == 0) {
            p_ideal++;
        }
        if (p[i].getMC() == 1) {
            sobre_p++;
        }
        if (p[i].getEdad() >= 18) {
            mayores++;
        } else {
            menores++;

        }
        }
//        Persona P1 = datos.datos();
//        System.out.println(P1);
//        datos.CalcularMC();
//        datos.verificar();
//        datos.MC_Edad();
//        if (P1.getMC() == -1) {
//            p_bajo++;
//        }
//        if (P1.getMC() == 0) {
//            p_ideal++;
//        }
//        if (P1.getMC() == 1) {
//            sobre_p++;
//        }
//        if (P1.getEdad() >= 18) {
//            mayores++;
//        } else {
//            menores++;
//
//        }
//
//        Persona P2 = datos.datos();
//        System.out.println(P2);
//        datos.CalcularMC();
//        datos.verificar();
//        datos.MC_Edad();
//        if (P2.getMC() == -1) {
//            p_bajo++;
//        }
//        if (P2.getMC() == 0) {
//            p_ideal++;
//        }
//        if (P2.getMC() == 1) {
//            sobre_p++;
//        }
//        if (P2.getEdad() >= 18) {
//            mayores++;
//        } else {
//            menores++;
//        }
//
//        Persona P3 = datos.datos();
//        System.out.println(P3);
//        datos.CalcularMC();
//        datos.verificar();
//        datos.MC_Edad();
//        if (P3.getMC() == -1) {
//            p_bajo++;
//        }
//        if (P3.getMC() == 0) {
//            p_ideal++;
//        }
//        if (P3.getMC() == 1) {
//            sobre_p++;
//        }
//        if (P3.getEdad() >= 18) {
//            mayores++;
//        } else {
//            menores++;
//        }
//
//        Persona P4 = datos.datos();
//        System.out.println(P4);
//        datos.CalcularMC();
//        datos.verificar();
//        datos.MC_Edad();
//        if (P4.getMC() == -1) {
//            p_bajo++;
//        }
//        if (P4.getMC() == 0) {
//            p_ideal++;
//        }
//        if (P4.getMC() == 1) {
//            sobre_p++;
//        }
//        if (P4.getEdad() >= 18) {
//            mayores++;
//        } else {
//            menores++;
//        }

        System.out.println("% Mayores: " + (25 * mayores));
        System.out.println("% Menores: " + (25 * menores));
        System.out.println("% Peso Ideal: " + (25 * p_ideal));
        System.out.println("% Peso Bajo: " + (25 * p_bajo));
        System.out.println("% SobrePeso: " + (25 * sobre_p));
    }

}

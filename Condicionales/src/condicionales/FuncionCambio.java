/*
21. Crea una aplicación que a través de una función nos convierta una cantidad de 
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o 
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a 
converir que será una cadena, este no devolverá ningún valor y mostrará un 
mensaje indicando el cambio (void).
El cambio de divisas es: 
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

libras
yenes
dolares
 */
package condicionales;

import java.util.Scanner;

public class FuncionCambio {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese cantidad en euros");
        double eu = leer.nextDouble();
        System.out.println("Escribe la moneda a la que quieres convertir: \n"
                + "libras\n"
                + "yenes\n"
                + "dolares");
        String moneda = leer.next();
        conversor(eu, moneda);
    }

    public static void conversor(double eu, String moneda) {
        double resp = 0;

        //Moneda introducida
        boolean correcto = true;

        switch (moneda) {
            case "libras":
                resp = eu * 0.86;
                break;
            case "dolares":
                resp = eu * 1.29;
                break;
            case "yenes":
                resp = eu * 129.852;
                break;
            default:
                System.out.println("No has introducido una moneda correcta");
                correcto = false;
        }

        if (correcto) {
            System.out.println(eu + " euros en son " + resp + " " + moneda);
        }

    }
}

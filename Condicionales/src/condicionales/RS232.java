/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este 
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar 
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer 
carácter tiene que ser X y el último tiene que ser una O. 
Las secuencias leídas que respeten el formato se consideran correctas, la 
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda 
secuencia distinta de FDE, que no respete el formato se considera incorrecta. 
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo 
se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package condicionales;

import java.util.Scanner;

public class RS232 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String cadena, subcadena1, subcadena2, salida = "&&&&&";
        int correctas = 0, incorrectas = 0;
        boolean control = false;

        do {
            System.out.println("Ingrese la cadena");
            cadena = leer.next();
            // cadena=toUpperCase(cadena);
            int n = cadena.length();
            subcadena1 = cadena.substring(0, 1);
            subcadena2 = cadena.substring(n - 1, n);

            if (subcadena1.equals("x") && subcadena2.equals("o") && n < 6) {
                correctas = correctas + 1;
                salida = "&&&&&";
            } else {
                incorrectas = incorrectas + 1;
                salida = " ";
            }
            System.out.println("Quiere agregar otro valor? (s/n) ");
            String confirm = leer.next();
            if (confirm.equals("n"))
                break;
            
        } while (!control);
        System.out.println("La cantidad de lecturas correctas fue de : " + correctas + "\n"
                + "La cantidad de lecturas incorrectas fue de: " + incorrectas);
    }
}

    

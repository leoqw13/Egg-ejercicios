/*
 Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Ejercicio8;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena_Servicio datos = new Cadena_Servicio();
        System.out.print("Ingrese frase o palabra:");
        datos.cargar(leer.next()); 
        System.out.println("La cantidad de vocales es : "+datos.mostrarVocales());
        datos.invertirFrase();
        
        System.out.print("Ingrese el caracter a buscar:");
        System.out.println("El caracter se repite "+datos.Veces_Repetido(leer.next().toUpperCase()));
        
        System.out.println("Ingrese una nueva frase a comparar");
        datos.Comparar_Longitud(leer.next());
        
        System.out.println("Ingrese una nueva frase a unir ");
        datos.Unir_Frase(leer.next());
        
        System.out.print("Ingrese el caracter para remplazar las 'a':");
        datos.Reemplazar(leer.next());
        
        System.out.print("Ingrese el caracter a buscar:");
        datos.Contiene(leer.next());      
    }

    }
    


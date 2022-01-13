/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco 
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de 
números pares y la cantidad de números impares. Al igual que en el ejercicio 
anterior los números negativos no deben sumarse. 
*/
package condicionales;

public class multip5 {


    public static void main(String[] args) {
        java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");
        int numero, pares, impares, numeros;
        pares = 0;
        impares = 0;
        numeros = 0;

        do {
            System.out.println("Ingrese un numero");
            numero = leer.nextInt();
            if (numero % 5 == 0) {
                break;
            }
            if (numero > 0) {
                numeros += 1;
                if (numero % 2 == 0) {
                    pares += 1;
                } else {
                    impares += 1;
                }
            }

        } while (numero > 0 && numero % 5 != 0);
        System.out.println("La cantidad de numeros leidos es de " + numeros);
        System.out.println("La cantidad de numeros pares es de " + pares);
        System.out.println("La cantidad de numeros impares es de " + impares);
//        leer.close();
    }

}

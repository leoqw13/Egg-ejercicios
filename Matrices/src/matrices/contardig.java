/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos). 
 */
package matrices;

import java.util.Scanner;

public class contardig {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese tamanio n");
        int n = leer.nextInt();
        int[] arreglo = new int[n];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 10001 + 1);
            System.out.print(arreglo[i] + " ");

        }
        int[] cont = new int[5];
        System.out.println("");
        for (int i = 0; i < arreglo.length; i++) {
            int cifras = n_digitos(arreglo[i]);
            if (cifras == 1) {
                cont[0]++;
            }
            if (cifras == 2) {
                cont[1]++;

            }
            if (cifras == 3) {
                cont[2]++;

            }
            if (cifras == 4) {
                cont[3]++;

            }
            if (cifras == 5) {
                cont[4]++;

            }
        }
        System.out.println("Los numero con 1 cifras son: " + cont[0]);
        System.out.println("Los numero con 2 cifras son: " + cont[1]);
        System.out.println("Los numero con 3 cifras son: " + cont[2]);
        System.out.println("Los numero con 4 cifras son: " + cont[3]);
        System.out.println("Los numero con 5 cifras son: " + cont[4]);
    }

    public static int n_digitos(int dato) {
        int n_digitos = 1; // Al menos tiene un dígito
// Recorremos la secuencia de dígitos...

        while (dato >= 10) {
            dato = dato / 10;
            n_digitos++;

        }
        return n_digitos;
    }
}
//       
//
//        for (int i = 0; i < arreglo.length; i++) {
//            arreglo[i] = (int) (Math.random() * 50 + 1);
//
//            System.out.print(arreglo[i] + " ");
//        }
//
//        int n, cifras;
//        for (int i = 0; i < arreglo.length; i++) {
//            cifras = 0;    //esta variable es el contador de cifras
//            while (arreglo[i] != 0) {             //mientras a n le queden cifras
//                arreglo[i] = arreglo[i] / 10;         //le quitamos el último dígito
//                cifras++;          //sumamos 1 al contador de cifras
//                if (cifras =)
//            }
//            
//                cifras = 0;    //esta variable es el contador de cifras
//                while (n != 0) {             //mientras a n le queden cifras
//                    n = n / 10;         //le quitamos el último dígito
//                    cifras++;          //sumamos 1 al contador de cifras
//                }
//                System.out.println("El número tiene " + cifras + " cifras");
//                System.out.print("Continuar? ");
//                car = (char) System.in.read();
//            } while (car != 'n' && car != 'N');e

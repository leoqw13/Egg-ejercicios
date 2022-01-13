/*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un 
programa que permita introducir un cuadrado por teclado y determine si este 
cuadrado es mágico o no. El programa deberá comprobar que los números 
introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package matrices;

import java.util.Scanner;


public class magic_matrix {

    public int i, j;

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int[][] m = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese dato en la fila:" + (i + 1));
                int d;
                do {
                    d = leer.nextInt();
                    m[i][j] = d;
                    if (d < 1 || d > 9) {
                        System.out.println("El numero debe ser entre 1 y 9");
                    }
                } while (d < 1 || d > 9);
            }
        }
        esmagico(m);
    }

    public static void esmagico(int[][] m) {
        int sumafila = 0;
        int sumacolumna = 0;
        int cont = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumafila += m[i][j];
                sumacolumna += m[j][i];
            }
            if (!isIgual(sumafila, sumacolumna)) {
                System.out.println("No es magica");
                mostrar(m);
                return;
            } else {
                cont++;
                if (cont == 3) {
                    System.out.println("Es magica");
                    mostrar(m);
                } else {
                    sumafila = 0;
                    sumacolumna = 0;
                }
            }
        }
    }

    private static boolean isIgual(int sumafila, int sumacolumna) {
        return sumafila == sumacolumna;
    }

    private static void mostrar(int[][] m) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + m[i][j] + "]");
            }
            System.out.println("");
        }

    }
}

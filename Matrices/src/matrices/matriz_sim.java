/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice 
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero 
cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se denota por A
T y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package matrices;

import java.util.Scanner;

public class matriz_sim {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int matriz[][], n, m;
        boolean simetrica = true;
        System.out.println("ingrese filas:");
        n = leer.nextInt();
        System.out.println("ingrese columnas:");
        m = leer.nextInt();
        matriz = new int[n][m];
        System.out.println("Digite una matriz");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]; ");
                matriz[i][j] = leer.nextInt();

            }

        }
        if (n == m) {
            int i, j;
            i = 0;
            while (i < n && simetrica == true) {
                j = 0;
                while (j < i && simetrica == true) {
                    if (matriz[i][j] != matriz[j][i]) {
                        simetrica = false;
                    }
                    j++;
                }
                i++;

            }
            if (simetrica == true) {
                System.out.println("la matriz es simetrica");
            } else {
                System.out.println("la matriz no es simetrica");

            }
        } else {
            System.out.println("La matriz no es simetrica");
        }
    }

}

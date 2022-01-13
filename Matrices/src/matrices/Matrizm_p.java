/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz 
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está 
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las 
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o 
columnas, existe al menos una que coincida con la matriz P. En ese caso, el 
programa debe indicar la fila y la columna de la matriz M en la cual empieza el 
primer elemento de la submatriz P.
 */
package matrices;

import java.util.Scanner;

public class Matrizm_p {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int n = 10;
        int m = 10;

        int[][] matM = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matM[i][j] = (int) (Math.random() * 50 + 1);
            }
        }
        mostrar(matM, n, m);

        int[][] matP = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese dato en la fila:" + (i + 1));
                int d;

                d = leer.nextInt();
                matP[i][j] = d;

            }
        }
//        verificar(matM, matP, n, m);
        verif(matM, matP, n, m);
    }

    public static void verificar(int[][] matM, int[][] matP, int n, int m) {
        boolean verif = false;
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                if (matM[i][j] == matP[0][0]) {
                    if (matM[i][j + 1] == matP[0][1] && matM[i][j + 2] == matP[0][2]) {
                        if (matM[i + 1][j] == matP[1][0] && matM[i + 1][j + 1] == matP[1][1] && matM[i + 1][j + 2] == matP[1][2]) {
                            if (matM[i + 2][j] == matP[2][0] && matM[i + 2][j + 1] == matP[2][1] && matM[i + 2][j + 2] == matP[2][2]) {

                                System.out.println("La matriz se encuentra en la matriz grande");
                                System.out.println("En la posición " + (i + 1) + "," + (j + 1));
                                verif = true;
                            }
                        }
                    }
                }
            }
        }
        if (verif == false) {
            System.out.println("No se encontro la matriz en la matriz grande");
        }
    }

    public static void verif(int[][] matM, int[][] matP, int n, int m) {
        //busco la matriz de 3*3 en la matriz de 10*10
        int fila, col;
        int cont = 0;
        int contMatriz = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                fila = i;
                col = j;
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (matP[k][l] == matM[fila][col]) {
                            cont++;
                        }
                        col++;
                    }
                    col = j;
                    fila++;
                }

                if (cont == 9) {
                    System.out.println("Se encontró la matriz en la fila " + i + " columna " + j);
                    contMatriz++;
                }
                cont = 0;
            }
        }

        if (contMatriz == 0) {
            System.out.println("La matriz de 3*3 no esta incluida en la matriz de 10*10");
        }
    }

    private static void mostrar(int[][] matriz, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (matriz[i][j] < 10) {
                    System.out.print("[0" + matriz[i][j] + "]");
                } else {
                    System.out.print("[" + matriz[i][j] + "]");
                }
            }
            System.out.println("");
        }

    }
}

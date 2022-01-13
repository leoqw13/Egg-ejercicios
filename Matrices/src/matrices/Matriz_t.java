/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
muestre traspuesta.
 */
package matrices;

import java.util.Scanner;


public class Matriz_t {

    
    public static void main(String[] args) {
 Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int matriz [][] = new int [4][4];
        System.out.println("Digite la matriz");
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                matriz[i][j] = (int)(Math.random() * 50 + 1);
            }
    
       }
        System.out.println("Matriz original");
        for (int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print("["+matriz[i][j] + "] ");
            }
            System.out.println("");
        }
        int matriz_t[][] = new int [4][4] ;
        for (int i = 0; i<4;i++){
            for(int j=0;j<4; j++){
//                aux = matriz[i][j];
                matriz_t [j][i] = matriz[i][j];
//                matriz[j][i] = aux;
            }
        }
        System.out.println("La matriz transpueta es:");
         for (int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print("["+matriz_t[i][j]+ "] ");
            } 
             System.out.println("");
         }
            
    }
    
}

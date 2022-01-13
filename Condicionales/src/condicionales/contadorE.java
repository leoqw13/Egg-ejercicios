/*
18. Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números 
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya 
por una E
 */
package condicionales;

public class contadorE {

    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    System.out.print(i != 3 ? i : "E");
                    System.out.print("-");
                    System.out.print(j != 3 ? j : "E");
                    System.out.print("-");
                    System.out.println(k != 3 ? k : "E");
                }
            }
        }
//     
//for (int i = 0; i <= 9; i++) {
//            for (int j = 0; j <= 9; j++) {
//                for (int k = 0; k <= 9; k++) {
//                    if (i != 3) {
//                        System.out.print(i + "-");
//                    } else {
//                        System.out.print("E");
//                    }
//                    if (j != 3) {
//                        System.out.print(j + "-");
//                    } else {
//                        System.out.print("E-");
//                    }
//                    if (k != 3) {
//                        System.out.println(k);
//                    } else {
//                        System.out.println("E");
//                    }
//                }
//
//            }
//        }
    }
}

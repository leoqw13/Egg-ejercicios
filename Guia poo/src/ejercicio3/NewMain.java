/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;


import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Operacion Op1=new Operacion();
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el primer numero:");
    double numero1=leer.nextDouble();
         System.out.println("Ingrese el segundo numero:");
    double numero2=leer.nextDouble();
    
        boolean salir = false;
        while (!salir){
int op;
            System.out.println("MENU\n" +
            "1. Sumar\n" +
            "2. Restar\n" +
            "3. Multiplicar\n" +
            "4. Dividir\n" +
            "5. Salir\n" +
            "Elija opción:");
            op = leer.nextInt();

                String enter;
                switch (op){
                   
                    case 1:
                     double suma = Op1.sumar(numero1, numero2);
                        System.out.println("La suma es: " + suma);
                        System.out.println("Presione enter para continuar");
                        enter = leer.next();
                        System.out.println("");
                        break;
                    case 2:
                          double resta = Op1.restar(numero1, numero2);
                   
                        System.out.println("La resta es: " + resta);
                        System.out.println("Presione enter para continuar");
                        enter = leer.next();
                        System.out.println("");
                        break;
                    case 3:
                                           double mult = Op1.multiplicar(numero1, numero2);
                        System.out.println("La multiplicacion es: " + mult);
                        System.out.println("Presione enter para continuar");
                        enter = leer.next();
                        System.out.println("");
                        break;
                    case 4:
                         double div = Op1.dividir(numero1, numero2);
                        System.out.println("La division es: " + div);
                        System.out.println("Presione enter para continuar");
                        enter = leer.next();
                        System.out.println("");
                        break;
                    case 5:
                        System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                       
                        String confirm = leer.next();
                        
                        if (confirm.equals("s")){
                            salir = true;
                        }
                        break;
                        
                    default:
                        System.out.println("Numero no valido");
                        
                        
                
    
    }
    
}
    }
}
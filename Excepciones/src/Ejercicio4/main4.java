
package Ejercicio4;

import java.util.Scanner;

/**
Escribir un programa en Java que juegue con el usuario a adivinar un número. La
computadora debe generar un número aleatorio entre 1 y 500, y el usuario tiene
que intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la
computadora debe decirle al usuario si el número que tiene que adivinar es mayor
o menor que el que ha introducido el usuario. Cuando consiga adivinarlo, debe
indicárselo e imprimir en pantalla el número de veces que el usuario ha intentado
adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se
debe contar el carácter fallido como un intento.
 */
public class main4 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=0, cont=0;
        int numeroAl = (int)Math.floor(Math.random()*(499)+1);
        System.out.println(numeroAl);
        while(numero!= numeroAl){
            try{
                System.out.println("Ingrese un numero");
                numero = sc.nextInt();sc.nextLine();
            }catch(Exception e){
                System.out.println("Error: debe ingresar un numero: "+e.toString());
                cont++;
                break;
            }
            if(numero<numeroAl){
                System.out.println("El numero es muy bajo");
            }else if(numero>numeroAl){
                System.out.println("El numero es muy alto");
            }else{
                System.out.println("Adivinó el numero");
            }
            cont++;
            
            
            
        }
        
        System.out.println("Intentos: "+cont);
    }

}

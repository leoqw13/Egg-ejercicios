/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el 
promedio de n números (n>0). El valor de n se solicitará al principio del programa y 
los números serán introducidos por el usuario. Realice dos versiones del programa, 
una usando el bucle “while” y otra con el bucle “do - while”.
 */
package condicionales;

public class mayor_menor_prom {

    public static void main(String[] args) {
        java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");
        int num;
        int suma = 0;
        int cont = 0;
        int may =0;
        int men=0;
        int i = 1;
        do {
            System.out.println("Ingrese los numeros");
            num = leer.nextInt();
            if (num > 0) {
                
                suma += num;
                
                cont++;
            }
            if (i==1){
                
               may=num;
                men = num;
            } else{
                if(num>may){
                    may = num;
                }
                if ((num<men) && num>0){
                    men = num;
                }
            }
            i++;
        } while (num > 0);
        int prom = suma/cont;
int[] vMmp = new int[3];
vMmp[0]= may;
vMmp[1] = men;
vMmp[2] = prom;
        System.out.println("El promedio total es:" +vMmp[2]);
        System.out.println("El numero mayor es:" +vMmp[0]);
        System.out.println("El numero menor es:" +vMmp[1]);
        System.out.println("Presione enter para continuar");
        String enter = leer.next();
        System.out.println("-----------Con While---------------");
System.out.println("Ingrese los numeros");
            num = leer.nextInt();        
while (num>0){
    
            if (num > 0) {
                
                suma += num;
                
                cont++;
            }
            if (i==1){
                
               may=num;
                men = num;
            } else{
                if(num>may){
                    may = num;
                }
                if ((num<men) && num>0){
                    men = num;
                }
            }
            i++;
            System.out.println("Ingrese los numeros");
            num = leer.nextInt();   
    }
System.out.println("El promedio total es:" +(suma/cont));
        System.out.println("El numero mayor es:" +may);
        System.out.println("El numero menor es:" +men);
    
}
}

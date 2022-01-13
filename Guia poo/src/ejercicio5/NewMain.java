/*
 Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package ejercicio5;

import java.util.Scanner;

public class NewMain {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cuenta_Service C1 = new Cuenta_Service();
        C1.crearCuenta();

        boolean salir = false;
        while (!salir) {
            int op;
            System.out.println("MENU\n"
                    + "1. Ingresar Dinero\n"
                    + "2. Retirar dinero\n"
                    + "3. Consultar Saldo\n"
                    + "4. Extraccion Rapida\n"
                    + "5. Consultar Datos\n"
                    + "6. Salir\n"
                    + "Elija opción:");
            op = leer.nextInt();

            String enter;
            switch (op) {

                case 1:
                    C1.ingresar();
                    System.out.println("Presione enter para continuar");
                    enter = leer.next();
                    System.out.println("");
                    break;
                case 2:
                    C1.retirar();
                    System.out.println("Presione enter para continuar");
                    enter = leer.next();
                    System.out.println("");
                    break;
                case 3:
                    C1.consultarSaldo();
                    System.out.println("Presione enter para continuar");
                    enter = leer.next();
                    System.out.println("");
                    break;
                case 4:
                    C1.extraccionRapida();
                    System.out.println("Presione enter para continuar");
                    enter = leer.next();
                    System.out.println("");
                    break;
                case 5:
                    C1.consultarDatos();
                    System.out.println("Presione enter para continuar");
                    enter = leer.next();
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");

                    String confirm = leer.next();

                    if (confirm.equals("s")) {
                        salir = true;
                    }
                    break;

                default:
                    System.out.println("Numero no valido");

            }

        }
    }

}

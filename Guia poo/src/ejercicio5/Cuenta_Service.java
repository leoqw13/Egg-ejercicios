
package ejercicio5;

import java.util.Scanner;


public class Cuenta_Service {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
      Cuenta c = new Cuenta();

    public Cuenta crearCuenta(){
        System.out.println("Ingrese su numero de cuenta");
        c.setNumeroCuenta(leer.nextInt());
      int numeroCuenta = c.getNumeroCuenta();
        System.out.println("Ingrese su numero de DNI");
        c.setDni(leer.nextLong());
      long dni = c.getDni();
        System.out.println("Ingrese su saldo Actual");
                c.setSaldo_A(leer.nextDouble());
      double Saldo_A = c.getSaldo_A();

        return new Cuenta(numeroCuenta, dni, Saldo_A);
}
    
public void ingresar(){
 System.out.println("Ingrese dinero a ingresar:");
    double ingreso=leer.nextDouble();
    c.setSaldo_A(c.getSaldo_A()+ ingreso);
    System.out.println("Ha ingresado: $"+ingreso +" Su Saldo Actual es: $"+c.getSaldo_A());
}

public void retirar(){
   System.out.println("Ingrese dinero a retirar:");
    double dinero_R = leer.nextDouble();
    
    if(c.getSaldo_A()<dinero_R){
       
        System.out.println("El monto a retirar es mayor a su sueldo Actual");
    }else{
    c.setSaldo_A(c.getSaldo_A()-dinero_R);
    System.out.println("Ha retirado: $"+dinero_R +" Su Saldo Actual es: $"+c.getSaldo_A());
    }
}

public void extraccionRapida(){
 System.out.println("Ingrese dinero a retirar:");
    double dinero_R2=leer.nextDouble();
    
    while(dinero_R2>(c.getSaldo_A()*0.2) ){
        System.out.println("El monto a retirar no puede ser mayor al 20% de su Saldo");
        System.out.println("Ingrese un monto menor:");
        dinero_R2 = leer.nextDouble();
    }
     c.setSaldo_A(c.getSaldo_A()-dinero_R2);
       System.out.println("Ha retirado: $"+dinero_R2 +" Su Saldo Actual es: $"+c.getSaldo_A());
}
public void consultarSaldo(){
    System.out.println("Su saldo Actual es: $"+c.getSaldo_A());
}
public void consultarDatos(){
    System.out.println("Dni:" +c.getDni());
    System.out.println("Numero de Cuenta:" +c.getNumeroCuenta());
    System.out.println("Saldo Actual es: $" + c.getSaldo_A());
}
}

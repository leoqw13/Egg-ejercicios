
package ejercici04;


public class Cuadrado {
    private double base;
        private double altura;

    public Cuadrado(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Cuadrado() {
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
   public void crearCuadrado(double radio){
        this.base = base;
        this.altura = altura;
      }     
     public double superficie(double base,double altura){
   double sup =  base*altura;
    return sup;
}
public double perimetro(double base,double altura){
   double perim =  (base+altura)*2;
    return perim;
} 
public void dibujarCuadrado(double base,double altura){
     for(int i=1 ; i<=altura ; i++){
           for(int j=1 ; j<=base ; j++){
               if (i>1 && i<altura && j>1 && j<base){
                   System.out.print(" ");
               }else{
                   System.out.print("*");
               }
           }
           System.out.println("");
        }  
}
}

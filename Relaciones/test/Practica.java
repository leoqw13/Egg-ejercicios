

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Practica {

    
//    La función recibirá un numero x y deberá determinar si es capicúa o no. 
//    Este deberá devolver verdadero(true) si es capicúa y falso(false) si no lo es. 
//    Además deberemos contemplar los siguientes escenarios: 
//    Contemplar que el numero que llega puede ser negativo. 
//    Contemplar que el numero que llega puede ser de un digito, si es así debe devolver true. 
//    Contemplar que el numero que llega puede ser null, si es así debe devolver false.
//    @param num
//    @return esPalindromo
     
    public Boolean numeroCapicua(Integer num) {
        Integer numero;
        if(num == null){         
            return false;
        }else{
            numero = Math.abs(num); //valor absoluto. me ahorra problemas con numeros negativos,
                                    //en la inversion del numero.
                                    
            //La cantidad de digitos no es necesaria pero como soy complicado hice una funcion largo();
            //pero esto se pude resolver asi.
            //      opcion 1:  if(Integer.toString(numero).lenght ==1) intervalo [0, 9]esta linea 
            //                  necesita ante la presencia del valor absoluto(linea 24), 
            //                  si es negativo me cuenta el espacio del "-"
            //      opcion 2   if(numero>-10 && numero<10) es indiferente si en numero en negativo o no
            // reemplazando la linea 35 por cualquiera de las opciones es valida y escriben menos.
            
            if(largo(numero)==1){  
                return true;
            }else{
                return numero.equals(reverse(numero));  //comparo su el numero es igual al 
            }                                           //resultado de reverse y devuelve false si son distintos
        }                                               // true si son iguales.
        

    }
    
    private Integer reverse(Integer num){
        int rest;
        int invertido=0;
        
        while(num >0){                          //Suponiendo q |num|= 123
            rest = num%10;                      // resto de 123/10 = 3    resto 12/10 = 2     resto 1/10=1
            invertido=invertido * 10 + rest;    // 1v -> 0*+3=3           3*10+2=32           32*10+1=321 
            num/=10;                            // 123/10= 12             12/10=1             1/10=0,1=(int)0
        }                                       // se sale y devuelve el numero invertido.                                    
        
        return invertido;
    }
    
    private Integer largo(Integer num){
        int largo=0;
        if(num ==0){
            largo=1;
        }else{
            while(num>0){   // en el de los digitos para el largo solo divido por 10 y cuento las veces q dividi.
                num/=10;    // y cuento las veces q dividi. siendo el contador la cantidad de digitos.
                largo++;
            }
        }
        return largo;
    }

    
//    Estamos en caramelolandia, donde estan los peores ladrones de dulces. 
//    Una vez al mes, se sienta una n cantidad de presos en ronda, contemplando 
//    al preso que inicia la ronda, como el preso 0. 
//    A los presos se les da una m cantidad de caramelos, estos caramelos se repartirán de uno en uno a cada
//    preso, 
//    contemplando que se comenzaran a repartir los caramelos desde el primer preso (inicio). 
//    Se repartirán los caramelos hasta que no queden más y el ultimo caramelo en repartirse estará podrido, 
//    determinar a que preso, según su posición en la ronda le tocara el caramelo podrido.
//     @param inicio
//     @param cantidadCaramelos
//     @param cantidadLadrones
//     @return ladronQueLeTocoElCarameloPodrido
    
    public int prisioneroDulce(int inicio, int cantidadCaramelos, int cantidadLadrones) { 
        int z;
        if(cantidadLadrones==1){
            return 0; //si tengo un solo ladron es su posicion inicial es 0 independiente del numero de caramelos.
        }else{
            for (int i = 0; i < cantidadCaramelos-1; i++) { //inicio es mi variable desplazante
                if(inicio==cantidadLadrones){               //si inicio es igual a los ladrones 
                    inicio=0;                               //se vuelve cero para iniciar la ronda, hasta 
                }                                           //acabar los caramelos, siendo el valor de inicio
                inicio++;                                   //el utlimo preso en recibir el caramelo podrido.
            }
        }
        return inicio;
    }

//    En un universo paralelo, donde los habitantes son medias, existe un crucero de medias donde se sube 
//    una lista de medias. 
//    Esta lista de tripulantes del crucero es una Collection de letras. 
//    Lo que se deberá hacer, es filtrar la lista de medias que se suben al crucero y 
//    retornar una lista que contenga los grupos de medias que si tenían pares. 
//    Esta lista final de medias pares se mostraran ordenadas de menor a mayor.
//    A continuación un ejemplo: 
//    List de medias que llegan : A,B,A,B,C,A,F,Z,C,H. A,B y C tiene pares, mientras que F,Z y H no. 
//    Entonces la List que se debería retornar sería: A,B,C.
//   @param pasajeros
//   @return mediasAmigas
    
    public List<String> mediasAmigas(List<String> pasajeros) {
        //Aca escribir la logica necesaria
        ArrayList<String> repetidas = new ArrayList();   
        int cont;
        for (int i = 0; i < pasajeros.size(); i++) {
            cont = letrasRepetidas(pasajeros.get(i),pasajeros); //devuelve las veces repetidas del elemento i de la lista pasajeros
            if (cont>1){                                        //si cont es mayor a 1 se guarda en la lista  
                repetidas.add(pasajeros.get(i));                //repetidas el elemento i de pasajeros.
            }                                                   //las letras se deben repetir mas de una vez
        }                                                       //para ser guardadas en la lista repetidas
        
        HashSet<String> listaFinal=new HashSet(repetidas); //convierto el ArrayList en HashSet ordenando y eliminando repetidos
        return new ArrayList(listaFinal);                   //devuelvo un nuevo arraylist con los elemento de hashset
    }
    
    private int letrasRepetidas(String a, List<String> pasajeros){ 
        int cont=0;                                     //letrasRepetidas(pasajeros.get(i),pasajeros);
        for (int i = 0; i < pasajeros.size(); i++) {    
            if(a.equalsIgnoreCase(pasajeros.get(i))){   //comparo a=pasajeros.get(i) de la funcion anterios con 
                cont++;                                 //cada uno de los elementos de la lista pasajeros.       
            }                                           //si se encuentra lo cuento.
        }
        return cont;                                    //termino de comparar el elemento a en la lista y 
    }                                                   //devuelvo la cantidad de veces repetidas.
}                                                       

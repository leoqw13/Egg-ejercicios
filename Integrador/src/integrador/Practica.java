package integrador;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        String numero;
        Boolean esPalindromo = true;
        if (num == null) {
            return false;
        } else {
            numero = String.valueOf(Math.abs(num));
            for (int i = 0, j = numero.length() - 1; i <= j; i++, --j) {
                if (numero.charAt(i) != numero.charAt(j)) {
//                    return false;
                    esPalindromo = false;
                }
            }
        }
//        return true;
        return esPalindromo;

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
        if (cantidadLadrones == 1) {
            return 0; //si tengo un solo ladron es su posicion inicial es 0 independiente del numero de caramelos.
        } else {
            for (int i = 0; i < cantidadCaramelos - 1; i++) { //inicio es mi variable desplazante
                if (inicio == cantidadLadrones) {               //si inicio es igual a los ladrones 
                    inicio = 0;                               //se vuelve cero para iniciar la ronda, hasta 
                }                                           //acabar los caramelos, siendo el valor de inicio
                inicio++;                                   //el utlimo preso en recibir el caramelo podrido.
            }
        }
        
        int ladronQueLeTocoElCarameloPodrido = inicio;
        return ladronQueLeTocoElCarameloPodrido;
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
        Set<String> mediasAmigas = new HashSet<>();
        for (String aux : pasajeros) {
            //Si no coincide el primer y último index => están repetidas
            if (pasajeros.indexOf(aux) != pasajeros.lastIndexOf(aux)) {
                mediasAmigas.add(aux);
            }

        }

        return new ArrayList(mediasAmigas);
    }
}
//    public List<String> mediasAmigas(List<String> pasajeros) {
//        Aca escribir la logica necesaria
//        ArrayList<String> repetidas = new ArrayList();
//        int cont;
//        for (int i = 0; i < pasajeros.size(); i++) {
//cont=letrasRepetidas(pasajeros.get(i), pasajeros);
//            if (cont > 1) {                                        //si cont es mayor a 1 se guarda en la lista  
//                repetidas.add(pasajeros.get(i));                //repetidas el elemento i de pasajeros.
//            }                                                   //las letras se deben repetir mas de una vez
//        }                                                       //para ser guardadas en la lista repetidas
//
//        HashSet<String> listaFinal = new HashSet(repetidas); //convierto el ArrayList en HashSet ordenando y eliminando repetidos
//        return new ArrayList(listaFinal);                   //devuelvo un nuevo arraylist con los elemento de hashset
//    }

//    private int letrasRepetidas(String a, List<String> pasajeros) {
//        int cont = 0;                                     //letrasRepetidas(pasajeros.get(i),pasajeros);
//        for (int i = 0; i < pasajeros.size(); i++) {
//            if (a.equalsIgnoreCase(pasajeros.get(i))) {   //comparo a=pasajeros.get(i) de la funcion anterios con 
//                cont++;                                 //cada uno de los elementos de la lista pasajeros.       
//            }                                           //si se encuentra lo cuento.
//        }
//        return cont;                                    //termino de comparar el elemento a en la lista y 
//    }   

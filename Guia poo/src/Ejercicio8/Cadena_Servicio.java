
package Ejercicio8;


public class Cadena_Servicio {

    Cadena datos = new Cadena();

    public void cargar(String fraseopalabra) {
        datos.setFraseopalabra(fraseopalabra);
        datos.setLong_frase(fraseopalabra.length());
        System.out.print("La longitud de la Frase es: " + datos.getLong_frase() + "\n");
    }

    public void invertirFrase() {
StringBuilder sb = new StringBuilder(datos.getFraseopalabra());
        System.out.println("La frase al reves: "+sb.reverse());
    }

    public int mostrarVocales() {
        int cont = 0;
        for (int i = 0; i < datos.getFraseopalabra().length(); i++) {
            if (datos.getFraseopalabra().substring(i, i + 1).matches(("[aeiouAEIOU]"))) {
                cont++;
            }
        }
return cont;
//        System.out.println("La frase tiene: " + cont + " vocales.");
    }

    public int Veces_Repetido(String Caracter) {
        int repetido = 0;
        String fraseopalabra = datos.getFraseopalabra().toUpperCase();
        for (int i = 0; i < datos.getLong_frase(); i++) {
            if (fraseopalabra.substring(i, i + 1).equals(Caracter.toUpperCase())) {
                repetido++;
            }
        }
        return repetido;
    }

    public void Comparar_Longitud(String newfrase) {
        int frase1 = datos.getFraseopalabra().length();
        int frase2 = newfrase.length();
        if (frase1 == frase2) {
            System.out.println("Las 2 frases tiene la misma longitud");
        } else {
            System.out.println("Las 2 frases no tiene la misma longitud");
        }
    }

    public void Unir_Frase(String frase2) {
        String Aux = datos.getFraseopalabra() + " " + frase2;
        System.out.println("La frase queda: " + Aux);
    }

    public void Reemplazar(String simbolo) {
        String fraseopalabra = datos.getFraseopalabra().toUpperCase().replace("A", simbolo);
        System.out.println("La frase resultante: " + fraseopalabra);
    }

    public void Contiene(String Letra) {
        int verificador = 0;
        String fraseopalabra = datos.getFraseopalabra().toUpperCase();
        System.out.println(datos.getFraseopalabra());
        for (int i = 0; i < datos.getLong_frase(); i++) {
            if (fraseopalabra.substring(i, i + 1).equals(Letra.toUpperCase())) {
                System.out.println("La frase contiene la letra?: " + true);
                verificador = 1;
                break;
            }
        }
        if (verificador == 0) {
            System.out.println("La frase contiene la letra?: " + false);
        }
    }

}


package Ejercicio8;


public class Cadena {
    private String fraseopalabra;
    private int long_frase;
    private String Aux;

    public Cadena() {
    }

    public Cadena(String fraseopalabra, int long_frase, String Aux) {
        this.fraseopalabra = fraseopalabra;
        this.long_frase = long_frase;
        this.Aux = Aux;
    }

    public String getFraseopalabra() {
        return fraseopalabra;
    }

    public int getLong_frase() {
        return long_frase;
    }

    public String getAux() {
        return Aux;
    }

    public void setFraseopalabra(String fraseopalabra) {
        this.fraseopalabra = fraseopalabra;
    }

    public void setLong_frase(int long_frase) {
        this.long_frase = long_frase;
    }

    public void setAux(String Aux) {
        this.Aux = Aux;
    }

}

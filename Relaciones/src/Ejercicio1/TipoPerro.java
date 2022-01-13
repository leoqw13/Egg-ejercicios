
package Ejercicio1;


public enum TipoPerro {
    PICHICHO("Pichicho"), MANTO_NEGRO("Manto Negro"), PITBULL("Pitbull"), BEAGLE("Beagle");
    
    private String valor;

    private TipoPerro(String valor) {
        this.valor = valor;
    }


    public String getValor() {
        return valor;
    }
    
}

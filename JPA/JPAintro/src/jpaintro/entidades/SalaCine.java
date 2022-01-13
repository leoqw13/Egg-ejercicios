
package jpaintro.entidades;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class SalaCine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @OneToOne
    private Pelicula pelicula;
    
    @OneToMany
    private List<Persona> personas;

    public SalaCine() {
    }

    public SalaCine(Pelicula pelicula, List<Persona> personas) {
        this.pelicula = pelicula;
        this.personas = personas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return "SalaCine{" + "id=" + id + ", pelicula=" + pelicula + ", personas=" + personas + '}';
    }
    
    
    
    
}

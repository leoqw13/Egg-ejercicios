
package jpaintro.servicios;

import jpaintro.entidades.Pelicula;
import jpaintro.persistencia.PeliculaDAO;


public class PeliculaService {
    
    PeliculaDAO pdao = new PeliculaDAO();
    
    public Pelicula crearPelicula(Pelicula p) throws Exception{
        
        if (p.getTitulo()==null || p.getTitulo().isEmpty()) {
            throw new Exception("Ingresaste un titulo nulo o vacio");
        }
        if (p.getDuracion()==null || p.getDuracion()<=0) {
            throw new Exception("La duracion es invalido");
        }
//        if (p.getDni()) {
//            
//        }

        if (p.getAutor()==null || p.getAutor().isEmpty()) {
            throw new Exception("Ingresaste un autor nulo o vacio");
        }
        
        pdao.crear(p);
        return p;
    }
    
}

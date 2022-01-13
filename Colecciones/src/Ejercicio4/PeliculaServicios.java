
package Ejercicio4;

import java.util.ArrayList;
import java.util.Comparator;


public class PeliculaServicios {
    
    public void mostrarPeliculas(ArrayList<Pelicula>peliculas){
        System.out.println("Listado de todas las peliculas");
        for(Pelicula aux: peliculas){
            System.out.println("Titulo: "+aux.getTitulos()+" Director: "+aux.getDirector()+" Duración: "+aux.getDuracion()+" horas");
        }
    }
    
    public void mostrarPeliculasLargas(ArrayList<Pelicula>peliculas){
        System.out.println("Peliculas con una duración mayor a 1 hora:");
        for(Pelicula aux: peliculas){
            if(aux.getDuracion()>1){
                System.out.println("Titulo: "+aux.getTitulos()+" Director: "+aux.getDirector()+" Duración: "+aux.getDuracion()+" horas");
            }
        }
    }
    public void ordenarMayorMenor(ArrayList<Pelicula>peliculas){
        System.out.println("Listado de peliculas ordenadas de mayor a menor según su duración:");
        peliculas.sort(ordenarDuracionMayor);
        for(Pelicula aux: peliculas){
            System.out.println("Titulo: "+aux.getTitulos()+" Director: "+aux.getDirector()+" Duración: "+aux.getDuracion()+" horas");
        }
    }
    public void ordenarMenorMayor(ArrayList<Pelicula>peliculas){
        System.out.println("Listado de peliculas ordenadas de menor a mayor según su duración:");
        peliculas.sort(ordenarDuracionMenor);
        for(Pelicula aux: peliculas){
            System.out.println("Titulo: "+aux.getTitulos()+" Director: "+aux.getDirector()+" Duración: "+aux.getDuracion()+" horas");
        }
    }
    
    public void ordenarPorTitulos(ArrayList<Pelicula>peliculas){
        System.out.println("Listado ordenado por titulo:");
        peliculas.sort(ordenarPorTitulo);
        for(Pelicula aux: peliculas){
            System.out.println("Titulo: "+aux.getTitulos()+" Director: "+aux.getDirector()+" Duración: "+aux.getDuracion()+" horas");
        }
    }
    public void ordenarPorDirector(ArrayList<Pelicula>peliculas){
        System.out.println("Listado ordenado por director:");
        peliculas.sort(ordenarPorDirector);
        for(Pelicula aux: peliculas){
            System.out.println("Titulo: "+aux.getTitulos()+", Director: "+aux.getDirector()+", Duración: "+aux.getDuracion()+", horas");
        }

    }
    
    // metodos Comparator
    public static Comparator<Pelicula> ordenarDuracionMayor = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula o2, Pelicula o1) {
            if(o1.getDuracion()<o2.getDuracion()){
                return -1;
            }
            if(o1.getDuracion()>o2.getDuracion()){
                return 1;
            }
            return 0;
        }
    };
    
    public static Comparator<Pelicula> ordenarDuracionMenor = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            if(o1.getDuracion()<o2.getDuracion()){
                return -1;
            }
            if(o1.getDuracion()>o2.getDuracion()){
                return 1;
            }
            return 0;
        }
    }; 
    
    public static Comparator<Pelicula> ordenarPorTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getTitulos().compareTo(o2.getTitulos());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDirector().compareTo(o2.getDirector());
        }
    };

}

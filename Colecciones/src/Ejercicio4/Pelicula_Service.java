
package Ejercicio4;


import java.util.ArrayList;
import java.util.Comparator;

public class Pelicula_Service {
    public static Comparator<Pelicula>OrdDurAsc = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
             if(t.getDuracion()<t1.getDuracion()){
                return -1;
            }
            if(t.getDuracion()>t1.getDuracion()){
                return 1;
            }
            return 0;
        }
        
    };
    public static Comparator<Pelicula>OrdDurDes = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t1, Pelicula t) {
             if(t.getDuracion()<t1.getDuracion()){
                return -1;
            }
            if(t.getDuracion()>t1.getDuracion()){
                return 1;
            }
            return 0;
        }
        
    };
      public static Comparator<Pelicula>Ord_Tit= new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
       return t.getTitulos().compareTo(t1.getTitulos());
        }
          
      };
public static Comparator<Pelicula>Ord_Direct= new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
       return t.getDirector().compareTo(t1.getDirector());
       
        }
    
};
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
        System.out.println("\n<<<<< DURACION MAYOR A MENOR >>>>>");
        peliculas.sort(OrdDurDes);
        for(Pelicula aux: peliculas){
            System.out.println("Titulo: "+aux.getTitulos()+" Director: "+aux.getDirector()+" Duración: "+aux.getDuracion()+" horas");
        }
    }
    public void ordenarMenorMayor(ArrayList<Pelicula>peliculas){
       System.out.println("\n<<<<< DURACION MENOR A MAYOR >>>>>");

        peliculas.sort(OrdDurAsc);
        for(Pelicula aux: peliculas){
            System.out.println("Titulo: "+aux.getTitulos()+" Director: "+aux.getDirector()+" Duración: "+aux.getDuracion()+" horas");
        }
    }
    
    public void ordenarPorTitulos(ArrayList<Pelicula>peliculas){
       System.out.println("\n<<<<< ORDEN ALFABETICO TITULOS >>>>>");

        peliculas.sort(Ord_Tit);
        for(Pelicula aux: peliculas){
            System.out.println("Titulo: "+aux.getTitulos()+" Director: "+aux.getDirector()+" Duración: "+aux.getDuracion()+" horas");
        }
    }
    public void ordenarPorDirector(ArrayList<Pelicula>peliculas){
       
        System.out.println("\n<<<<< ORDEN ALFABETICO DIRECTORES >>>>>");
        peliculas.sort(Ord_Direct);
        for(Pelicula aux: peliculas){
            System.out.println("Titulo: "+aux.getTitulos()+", Director: "+aux.getDirector()+", Duración: "+aux.getDuracion()+", horas");
        }

    }      

}


package ejercicio1;


public class Libro {

    String ISBN;
    String titulo;
    String autor;
    int numPaginas;

    public Libro(String ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public Libro() {
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void cargarLibro(String ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
    public void mostrarLibro(){
        System.out.println("El ISBN es: "+ISBN);
        System.out.println("El titulo es: "+ titulo);
        System.out.println("El autor es: "+ autor);
        System.out.println("El numero de paginas es: "+numPaginas);
    }
}

package servicios;

import entidades.Autor;
import entidades.Editorial;
import entidades.Libro;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class LibroServicio {

    protected Scanner sc = new Scanner(System.in);
    protected GestorServicio gestor = new GestorServicio();

    public void ingresarLibro() {
        AutorServicio autorServicio = new AutorServicio();
        EditorialServicio editorialServicio = new EditorialServicio();
        Autor autor = new Autor();
        Editorial editorial = new Editorial();
        Libro nuevoLibro = new Libro();

        try {

            if (nuevoLibro.getTitulo() == null) {
                System.out.println("Ingrese el título:");
                nuevoLibro.setTitulo(sc.next());
                sc.nextLine();
            }

            if (nuevoLibro.getAnio() == 0) {
                System.out.println("Ingrese el año:");
                nuevoLibro.setAnio(sc.nextInt());
                sc.nextLine();

            }
            if (nuevoLibro.getEjemplares() == 0) {
                System.out.println("Ingrese la cantidad de ejemplares:");
                nuevoLibro.setEjemplares(sc.nextInt());
                sc.nextLine();
            }
            if (nuevoLibro.getEjemplaresPrestados() == 0) {
                System.out.println("Ingrese la cantidad de ejemplares prestados:");
                nuevoLibro.setEjemplaresPrestados(sc.nextInt());
                sc.nextLine();

            }

            //Se pide ingresar un autor para el libro
            System.out.println("Elija un Autor de la siguiente Lista:");//un autor puede tener muchos libros
            autorServicio.listarAutor();//se puede elegir un autor que ya exista o crear un nuevo autor    

            System.out.println("O preesione el número 0 para crear un nuevo autor");
            int opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 0) {
                System.out.println("Ingrese el nombre del Autor:");
                autor.setNombre(sc.nextLine());
                nuevoLibro.setAutor(autor);
                gestor.ingresarEntidad(nuevoLibro);
            } else {
                autor = autorServicio.buscarAutorID(opcion);
                nuevoLibro.setAutor(autor);

            }

            //Se pide ingresar una editorial para el libro
            System.out.println("Elija una Editorial de la siguiente Lista:");//un editorial puede tener muchos libros
            editorialServicio.listarEditorial();//se puede elegir una editorial ya existente o crear una nueva

            System.out.println("O preesione el número 0 para crear una nueva Editorial");
            opcion = sc.nextInt();
            sc.nextLine();
            if (opcion == 0) {
                System.out.println("Ingrese el nombre de la nueva Editorial:");
                editorial.setNombre(sc.nextLine());
                nuevoLibro.setEditorial(editorial);
                gestor.actualizarEntidad(nuevoLibro);
            } else {
                editorial = editorialServicio.buscarEditorialID(opcion);
                nuevoLibro.setEditorial(editorial);
                gestor.actualizarEntidad(nuevoLibro);

            }

        } catch (InputMismatchException e) {
            System.out.println("Caracter no valido");
            ingresarLibro();
        }

    }

    public void editarLibro() {
        System.out.println("Indique el numero de ISBN del libro a editar:");
        listarLibros();
        int isbn = sc.nextInt();
        sc.nextLine();
        Libro libro = buscarLibroID(isbn);
        System.out.println("Quiere modificar el Titulo? y/n");
        String opcion = sc.nextLine().toUpperCase();
        if (opcion.equals("Y")) {
            System.out.println("Escriba el nuevo Titulo:");
            libro.setTitulo(sc.nextLine());
        }
        System.out.println("Quiere modificar el año? y/n");
        opcion = sc.nextLine();
        if (opcion.equals("Y")) {
            System.out.println("Escriba el nuevo año:");
            libro.setAnio(sc.nextInt());
            sc.nextLine();
        }
        //falta el codigo para modificar los demas atributos, que seria repetir lo mismo de arriba

        gestor.actualizarEntidad(libro);
    }

    public Libro buscarLibroID(int id) {

        String jpql = "Select a FROM Libro a WHERE a.isbn = " + id;
        Libro libro = (Libro) gestor.listarEntidad(jpql);
        return libro;
    }

    public void buscarLibroISBN() {
        System.out.println("Indique el numero de ISBN a buscar");
        int isbn = sc.nextInt();
        String jpql = "Select a FROM Libro a WHERE a.isbn=" + isbn;
        Libro libro = (Libro) gestor.listarEntidad(jpql);

        if (libro == null) {
            System.out.println("No hay autores para mostrar");
        } else {
            System.out.println("Libro: " + libro.getTitulo());
        }
    }

    public void buscarLibroTitulo() {
        System.out.println("Ingrese el titulo a buscar");
        String titulo = sc.nextLine();
        String jpql = "Select a FROM Libro a WHERE a.titulo IN ('" + titulo + "')";
        List<Libro> list = gestor.listarEntidades(jpql);

        if (list.isEmpty()) {
            System.out.println("No hay Libros para mostrar");
        } else {
            for (Libro a : list) {
                System.out.println("ISBN: " + a.getIsbn() + "Libro: " + a.getTitulo() + " Cant Ejemplares: " + a.getEjemplares());
            }
        }
    }

    public void buscarLibroAutor() {
        System.out.println("Indique el Autor de los libros a buscar");
        String autor = sc.nextLine();
        String jpql = "Select a FROM Libro a WHERE a.autor.nombre IN ('" + autor + "')";
        List<Libro> list = gestor.listarEntidades(jpql);

        if (list.isEmpty()) {
            System.out.println("No hay Libros para mostrar");
        } else {
            for (Libro a : list) {
                System.out.println("Libro: " + a.getTitulo());
            }
        }
    }

    public void buscarLibroEditorial() {
        System.out.println("Indique la Editorial de los libros a buscar");
        String editorial = sc.nextLine();
        String jpql = "Select a FROM Libro a WHERE a.editorial.nombre IN ('" + editorial + "')";
        List<Libro> list = gestor.listarEntidades(jpql);

        if (list.isEmpty()) {
            System.out.println("No hay Libros para mostrar");
        } else {
            for (Libro a : list) {
                System.out.println("Libro: " + a.getTitulo());
            }
        }
    }

    public void eliminarLibro() {
        System.out.println("Ingrese el numero de ISBN del libro a eliminar:");
        int isbn = sc.nextInt();
        String jpql = "Select a FROM Libro a WHERE a.isbn=" + isbn;
        Libro libro = (Libro) gestor.listarEntidad(jpql);

        if (libro == null) {
            System.out.println("No hay Libro para eliminar");
        } else {
            libro.setAlta(false);
            gestor.actualizarEntidad(libro);
        }

    }

    public void eliminarLibroTitulo() {
        System.out.println("ingrese el titulo del libro a eliminar");
        String titulo = sc.nextLine();
        String jpql = "Select a FROM Libro a WHERE a.titulo = '" + titulo + "'";
        Libro libro = (Libro) gestor.listarEntidad(jpql);
        if (libro == null) {
            System.out.println("No hay Libro para eliminar");
        } else {
            libro.setAlta(false);
            gestor.actualizarEntidad(libro);
        }
    }

    public void listarLibros() {
        String sql = "Select a FROM Libro a WHERE a.alta = 'true'";
        List<Libro> list = gestor.listarEntidades(sql);

        if (list.isEmpty()) {
            System.out.println("No hay libros para mostrar");
        } else {
            System.out.println(espacios("ISBN:") + espacios("Titulos:") + espacios("Años:") + espacios("Ejemplares:") + espacios("Ejemplares Prestados:") + espacios("Ejemplares restantes:") + espacios("Alta:"));
            for (Libro a : list) {
                System.out.println(espacios(String.valueOf(a.getIsbn())) + espacios(a.getTitulo()) + espacios(String.valueOf(a.getAnio())) + espacios(String.valueOf(a.getEjemplares())) + espacios(String.valueOf(a.getEjemplaresPrestados())) + espacios(String.valueOf(a.getEjemplaresRestantes())) + a.isAlta());
//            
            }
        }
    }

    public static String espacios(String cadena) {
        int cantEspacios = 40 - cadena.length();
        for (int i = 0; i < cantEspacios; i++) {
            cadena += " ";
        }
        return cadena;
    }
}

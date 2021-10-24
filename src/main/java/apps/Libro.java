package apps;

import java.util.List;

public class Libro {
    private final String nombre;
    private final String editorial;
    private final Integer cantidad;
    //Listado de copias para diferenciar las ediciones de libros.
    private final List<LibroCopia> copias;
    private final Autor autor;

    public Libro(String nombre, String editorial, List<LibroCopia> copias, Autor autor,Integer cantidad) {
        this.nombre = nombre;
        this.editorial = editorial;
        this.copias = copias;
        this.autor = autor;
        this.cantidad  =cantidad;
    }
}

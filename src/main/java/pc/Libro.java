package pc;

import java.util.List;

public class Libro {
    private  String nombre ;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public List<LibroCopia> getCopias() {
        return copias;
    }

    public void setCopias(List<LibroCopia> copias) {
        this.copias = copias;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    private  String editorial;
    private  Integer cantidad;
    //Listado de copias para diferenciar las ediciones de libros.
    private  List<LibroCopia> copias;
    private  Autor autor;

    public Libro(String nombre, String editorial, List<LibroCopia> copias, Autor autor,Integer cantidad) {
        this.nombre = nombre;
        this.editorial = editorial;
        this.copias = copias;
        this.autor = autor;
        this.cantidad  =cantidad;
    }
}

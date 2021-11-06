package pc;

public class Oferta {
    private  String nombre ;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    private  String temporada;
    private  String descuento;
    public Oferta(String nombre, String temporada, String descuento) {
        this.nombre = nombre;
        this.temporada = temporada;
        this.descuento = descuento;
    }

}

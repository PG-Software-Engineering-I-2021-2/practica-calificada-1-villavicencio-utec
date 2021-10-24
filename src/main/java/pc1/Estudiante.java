package pc1;
import java.util.logging.Logger;

public class Estudiante {
    private static Logger logger = Logger.getLogger(Estudiante.class.getName());

    private final String nombre;
    private final String correo;
    private final String telefono;
    public Estudiante(String nombre, String correo, String telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }
    public void notificarLibro(){
        logger.info("Se le notificó al usuario xxxx por correo...");
    }
    public void notificarOferta(){
        logger.info("Se le notificó al usuario xxxx por correo...");
    }



}

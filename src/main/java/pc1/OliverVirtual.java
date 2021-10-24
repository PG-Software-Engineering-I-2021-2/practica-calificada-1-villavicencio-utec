package pc1;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
public class OliverVirtual {
    private static OliverVirtual instance;
    private Map<Integer, Estudiante> estudiantes = new HashMap<>();
    private Map<Integer, Libro> libros = new HashMap<>();

    private Map<Integer, HashMap<Integer, Boolean>> libroEstudiante = new HashMap<>();

    //Validar el singleton para obtener solamente una instacia de oliver.
    public static OliverVirtual getInstance() {
        if(instance == null){
            instance = new OliverVirtual();
        }
        return instance;
    }
    public void registrarEstudiante(Integer id,String nombre, String correo, String telefono){
        estudiantes.put(id, new Estudiante(nombre, correo,telefono));
    }
    public void registrarLibro(Integer id, String nombre, String editorial, List<LibroCopia> copias, Autor autor, Integer cantidad){
        libros.put(id,new Libro( nombre,  editorial, copias,  autor,cantidad));
    }
    public boolean condicionMinima(Integer idEstudiante){
        Estudiante estudiante = estudiantes.get(idEstudiante);
        return estudiante.getCorreo() != null && estudiante.getCorreo() != "";
    }
    public boolean vincularEstudianteLibro(Integer idEstudiante, Integer idLibro){
        if(condicionMinima(idEstudiante)) return false;
        libroEstudiante.computeIfAbsent(idLibro, k -> new HashMap<Integer, Boolean>());
        libroEstudiante.get(idLibro).put(idEstudiante, true);
        return true;
    }

    public boolean desvincularEstudianteLibro(Integer idEstudiante, Integer idLibro){
        if(condicionMinima(idEstudiante)) return false;
        libroEstudiante.get(idLibro).put(idEstudiante, false);
        return true;
    }
    public boolean actualizarLibros(Integer idLibro,Integer cantidad){
        var estudiantesLibros = libroEstudiante.get(libroEstudiante);
        for (Map.Entry<Integer, Boolean> entry : estudiantesLibros.entrySet()) {
            if(entry.getValue()) estudiantes.get(entry.getKey()).notificarLibro();
        }
        return true;
    }

}

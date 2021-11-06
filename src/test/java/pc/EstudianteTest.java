package pc;
import org.testng.Assert;
import org.testng.annotations.Test;
public class EstudianteTest {
    @Test
    public void variables() {
        Estudiante lEstudiante = new Estudiante("nombre","correo","telefono");
        Assert.assertTrue(lEstudiante.getNombre() == "nombre");
        Assert.assertTrue(lEstudiante.getCorreo() == "correo");
        Assert.assertTrue(lEstudiante.getTelefono() == "telefono");

        lEstudiante.setNombre("nombre2");
        lEstudiante.setCorreo("correo2");
        lEstudiante.setTelefono("telefono2");

        Assert.assertTrue(lEstudiante.getNombre() == "nombre2");
        Assert.assertTrue(lEstudiante.getCorreo() == "correo2");
        Assert.assertTrue(lEstudiante.getTelefono() == "telefono2");
        lEstudiante.notificarLibro();
        lEstudiante.notificarOferta() ;
        Assert.assertTrue(true);

    }
}

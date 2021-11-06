package pc;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Date;
public class AutorTest {
    @Test
    public void variables() {
        Autor lAutor = new Autor("nombre",new Date());
        Assert.assertTrue(lAutor.getNombre() == "nombre");
//        Assert.assertTrue(lAutor.getFechaNacimiento() != null);

        lAutor.setNombre("nombre2");
        lAutor.setFechaNacimiento(new Date());
        Assert.assertTrue(lAutor.getNombre() == "nombre2");
//        Assert.assertTrue(lAutor.getFechaNacimiento() != null);

    }
}

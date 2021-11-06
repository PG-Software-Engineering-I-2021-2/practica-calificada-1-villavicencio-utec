package pc;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibroTest {

    @Test
    public void variables() {

        List<LibroCopia> acoLibroCopia  = new ArrayList<>();;
        for(int i = 0; i<10;i++){
            LibroCopia lLibroCopia = new LibroCopia(Integer.toString(i));
            acoLibroCopia.add(lLibroCopia);
        }
//        LibroCopia lLibroCopia1 = new LibroCopia("1");
//        LibroCopia lLibroCopia2 = new LibroCopia("1");
//        LibroCopia lLibroCopia3 = new LibroCopia("3");
//        acoLibroCopia.add(lLibroCopia1)

        Autor lAutor = new Autor("Jorge Villavicencio",new Date());
   
        Libro lLibro = new Libro("nombre","editorial",acoLibroCopia,lAutor,4);
        Assert.assertTrue(lLibro.getNombre() == "nombre");
        Assert.assertTrue(lLibro.getEditorial() == "editorial");
        Assert.assertTrue(lLibro.getCopias().size() == 10);
        Assert.assertTrue(lLibro.getCantidad() == 4);
        Assert.assertTrue(lLibro.getAutor().getNombre() == "Jorge Villavicencio");

        lLibro.setNombre("nombre2");
        lLibro.setEditorial("editorial2");
        lLibro.setCantidad(10);

        Assert.assertTrue(lLibro.getNombre() == "nombre2");
        Assert.assertTrue(lLibro.getEditorial() == "editorial2");
        Assert.assertTrue(lLibro.getCantidad() == 10);


    }
}

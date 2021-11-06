package pc;

import org.testng.Assert;
import org.testng.annotations.Test;
public class OfertaTest {

    @Test
    public void variables() {
        Oferta lOferta = new Oferta("nombre","Tempo","descuento");
        Assert.assertTrue(lOferta.getNombre() == "nombre");
        Assert.assertTrue(lOferta.getDescuento() == "descuento");
        Assert.assertTrue(lOferta.getTemporada() == "Tempo");

        lOferta.setNombre("nombre2");
        lOferta.setTemporada("tempo2");
        lOferta.setDescuento("desc2");

        Assert.assertTrue(lOferta.getNombre() == "nombre2");
        Assert.assertTrue(lOferta.getTemporada() == "tempo2");
        Assert.assertTrue(lOferta.getDescuento() == "desc2");


    }
}

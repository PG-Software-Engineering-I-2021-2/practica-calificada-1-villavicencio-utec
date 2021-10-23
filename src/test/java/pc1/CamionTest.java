package pc1;

import org.testng.Assert;
import org.testng.annotations.Test;

import static pc1.Main.*;
import static pc1.Main.capacidadTotal;

public class CamionTest {

    @Test
    public void Test01_fuelCantidad_OK(){
        Camion camionTest = new Camion(fuelCantidad,consumoCamion,capacidadTotal);
        Assert.assertEquals(camionTest.fuelCantidad(4),"Camion viajo 4.0 km y aun tiene 3.60 de combustible" );
    }
    @Test
    public void Test01_fuelCantidad_Fail(){
        Camion camionTest = new Camion(fuelCantidad,consumoCamion,capacidadTotal);
        Assert.assertEquals(camionTest.fuelCantidad(10),"Camion necesita reabastecimiento de combustible" );
    }


    @Test
    public void Test01_abastecer_OK(){
        Camion camionTest = new Camion(fuelCantidad,consumoCamion,capacidadTotal);
        Assert.assertEquals(camionTest.abastecer(10),"La cantidad de combustible del camion es: 19.5" );
    }
    @Test
    public void Test01_abastecer_Fail(){
        Camion camionTest = new Camion(fuelCantidad,consumoCamion,capacidadTotal);
        Assert.assertEquals(camionTest.abastecer(100),"Camion no se puede reabastecer el tanque, esta lleno" );
    }


    //Test de Stress
    @Test(invocationCount = 80,threadPoolSize = 80)
    public void Test02_Stress(){
        Camion camionTest = new Camion(fuelCantidad,consumoCamion,capacidadTotal);
        Assert.assertEquals(camionTest.fuelCantidad(40),"Camion necesita reabastecimiento de combustible" );
    }
}
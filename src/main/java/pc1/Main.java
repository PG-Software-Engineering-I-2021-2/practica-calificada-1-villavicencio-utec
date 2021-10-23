package pc1;
import java.util.logging.Logger;

public class Main {
    static final Logger logger = Logger.getLogger(Main.class.getName());
    static double consumoVehiculo = 0.9;
    static double consumoCamion = 1.6;
    static double capacidadTotal = 100;
    static double fuelCantidad = 10;
    public static void main(String[ ] args) {



//Ejemplo 1
        Automovil lAutomovil1 = new Automovil(fuelCantidad,consumoVehiculo,capacidadTotal);

        String rpta1 = lAutomovil1.fuelCantidad(4);
        logger.info(rpta1);

//Ejemplo 2
        Automovil lAutomovil2 = new Automovil(fuelCantidad,consumoVehiculo,capacidadTotal);
        String rpta2 = lAutomovil2.fuelCantidad(12);
        logger.info(rpta2);

//Ejemplo 3
        Camion lCamion = new Camion(fuelCantidad,consumoCamion,capacidadTotal);
        String rpta3 = lCamion.fuelCantidad(4);
        logger.info(rpta3);



    }
}

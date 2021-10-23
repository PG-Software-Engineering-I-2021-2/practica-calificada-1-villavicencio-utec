package pc1;

import java.text.DecimalFormat;

public class Camion  extends Vehiculo{

    Camion(double prCantidad, double prConsumo, double prCapacidad) {
        super(prCantidad, prConsumo, prCapacidad);
    }
    String  abastecer(double prLitros){
        double freeSpace = this.capacidad - this.cantidad;
        if (prLitros > freeSpace)
        {
            return "Camion no se puede reabastecer el tanque, esta lleno";

        }
        else{
            this.cantidad += (prLitros * 0.95);
            return "La cantidad de combustible del camion es: "+cantidad;
        }
    }
    @Override
    String fuelCantidad(double prkm) {
        DecimalFormat df = new DecimalFormat("0.00");
        double fuelRequiere = prkm*this.consumo;
        if(cantidad-fuelRequiere<0){
            return "Camion necesita reabastecimiento de combustible";
        }
        else{
            this.cantidad -=fuelRequiere;
            return ("Camion viajo " +(prkm)+" km y aun tiene " +df.format(cantidad)+ " de combustible");
        }
    }
}

package pc1;

import java.text.DecimalFormat;

public class Vehiculo {
    double  cantidad;
    double capacidad;
    double consumo;

    Vehiculo(double prCantidad, double prConsumo, double prCapacidad){
        this.cantidad = prCantidad;
        this.consumo = prConsumo;
        this.capacidad = prCapacidad;
    }

    String fuelCantidad(double prkm){
        DecimalFormat df = new DecimalFormat("0.00");
        double fuelRequiere = prkm*this.consumo;
        if(cantidad-fuelRequiere<0){
            return ("Vehiculo necesita reabastecimiento de combustible");
        }
        else{
            this.cantidad -=fuelRequiere;
            return ("Vehiculo viajo " +(prkm)+" km y aun tiene " +df.format(cantidad)+ " de combustible");
        }
    }
}


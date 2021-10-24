package pc1;


import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
public class OliverVirtualTest {
    @Test
    public void test(){
        var oliverVirtual = OliverVirtual.getInstance();


        oliverVirtual.registrarEstudiante(1, "Pedro", "pedro@gmail.com","959388801");
        oliverVirtual.registrarEstudiante(2, "Pedro", "pedro@gmail.com","959388802");
        oliverVirtual.registrarEstudiante(3, "Jose", "jose@gmail.com","959388803");
        oliverVirtual.registrarEstudiante(4,"Jesus", "jesus@gmail.com","959388804");
        oliverVirtual.registrarEstudiante(5,"Alonso", "alonso@gmail.com","959388805");

        List<LibroCopia> acoLibroCopia  = null;
        for(int i = 0; i<10;i++){
            LibroCopia lLibroCopia = new LibroCopia(Integer.toString(i));
            acoLibroCopia.add(lLibroCopia);
        }
        Autor lAutor = new Autor("Jorge Villavicencio",new Date());
        oliverVirtual.registrarLibro(1, "Quien se robo mi queso", "Pucara",acoLibroCopia,lAutor,5);
        oliverVirtual.registrarLibro(2, "Caballero Carmelo", "",acoLibroCopia,lAutor,3);
        oliverVirtual.registrarLibro(3, "Pecado humado", "Brunno",acoLibroCopia,lAutor,3);
        oliverVirtual.registrarLibro(4, "Tradiciones peruanas", "Lumbreras",acoLibroCopia,lAutor,2);


        Assert.assertTrue(oliverVirtual.vincularEstudianteLibro(1, 2));
        Assert.assertTrue(oliverVirtual.desvincularEstudianteLibro(1,2));

        Assert.assertTrue(oliverVirtual.vincularEstudianteLibro(1, 1));
        Assert.assertTrue(oliverVirtual.actualizarLibros(1, 12));
    }
}

package com.example.ExamenSemana4.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class Modulo extends Contenido{
    private List<Contenido> contenidoList;

    public Modulo(String nombre, String descripcion, Integer duracion) {
        super(nombre, descripcion, duracion);
    }

    /*
    public void mn(){
        Tema t = new Tema();
        t.setNombre("Campana de Gauss");
        t.setDescripcion("");
        t.setDuracion(2);

        Modulo submodulo= new Modulo();
        submodulo.setNombre("Estadistica 2");
        submodulo.setDescripcion("hey");
        submodulo.setDuracion(4);
        submodulo.modulo.add(t);

        modulo.add(t);
        modulo.add(submodulo);
    }*/
}
package com.example.ExamenSemana4.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name="Contenidos")
public class Contenido {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String nombre;
    private String descripcion;
    private Integer duracion;

    public Contenido(String nombre, String descripcion, Integer duracion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracion = duracion;
    }
}

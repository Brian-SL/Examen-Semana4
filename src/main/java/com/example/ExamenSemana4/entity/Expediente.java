package com.example.ExamenSemana4.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name="Expedientes")
public class Expediente {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String fechaInsc;
    private int calificacion;
    private String fechaFin;

    @ElementCollection
    @Column(name = "curso")
    private List<Curso> cursoList;

    public Expediente(String fechaInsc, int calificacion, String fechaFin, List<Curso> cursoList) {
        this.fechaInsc = fechaInsc;
        this.calificacion = calificacion;
        this.fechaFin = fechaFin;
        this.cursoList = cursoList;
    }
}

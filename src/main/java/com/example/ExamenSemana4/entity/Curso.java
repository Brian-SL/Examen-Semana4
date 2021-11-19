package com.example.ExamenSemana4.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name="Cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private  Integer id;

    @ElementCollection
    @Column(name = "contenido")
    private List<Contenido> contenidoList;

    public Curso(List<Contenido> contenidoList) {
        this.contenidoList = contenidoList;
    }
}

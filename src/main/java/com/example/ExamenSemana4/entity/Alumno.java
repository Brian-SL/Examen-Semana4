package com.example.ExamenSemana4.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter @Setter
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "Alumnos")
public class Alumno {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer dni;

    private String nombre;
    private String apellido;
    private String direccion;
    private String mail;
    //private List<Expediente> expedienteList;
    @ElementCollection
    @Column(name = "expediente")
    private List<Expediente> expedienteList;

    public Alumno(String nombre, String apellido, String direccion, String mail, List<Expediente> expedienteList) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.mail = mail;
        this.expedienteList = expedienteList;
    }
}

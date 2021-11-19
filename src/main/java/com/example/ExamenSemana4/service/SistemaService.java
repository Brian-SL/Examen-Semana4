package com.example.ExamenSemana4.service;

import com.example.ExamenSemana4.entity.Alumno;
import com.example.ExamenSemana4.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SistemaService {

    @Autowired
    AlumnoRepository alumnoRepository;

    public void addAlumno(Alumno alumno) {
        alumnoRepository.addAlumno(alumno);
    }

    public void deleteAlumno(Integer dni) {
        alumnoRepository.deleteAlumno(dni);
    }

    public List<Alumno> getAlumnos() {
        return alumnoRepository.getAll();
    }

    public void updateAlumno(Alumno alumno) {
        alumnoRepository.updateAlumno(alumno);
    }
}

package com.example.ExamenSemana4.repository;

import com.example.ExamenSemana4.entity.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AlumnoRepository {

    @Autowired
    AlumnoRepositoryDao alumnoRepositoryDao;

    public void addAlumno(Alumno alumno) {
        alumnoRepositoryDao.save(alumno);
    }

    public void deleteAlumno(Integer dni) {
        alumnoRepositoryDao.deleteById(dni);
    }

    public List<Alumno> getAll() {
        return (List<Alumno>)alumnoRepositoryDao.findAll();
    }

    public void updateAlumno(Alumno alumno) {
        alumnoRepositoryDao.save(alumno);
    }
}

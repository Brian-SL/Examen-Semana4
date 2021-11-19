package com.example.ExamenSemana4.controller;

import com.example.ExamenSemana4.entity.Alumno;
import com.example.ExamenSemana4.service.SistemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SistemaController {

    @Autowired
    private SistemaService sistemaService;

    @PostMapping
    public ResponseEntity<Alumno> addAlumno(@RequestBody Alumno alumno){
        sistemaService.addAlumno(alumno);
        System.out.println("Alumno añadido");
        return ResponseEntity.ok(alumno);
    }

    @GetMapping
    public List<Alumno> getAlumnos(){
        return sistemaService.getAlumnos();
    }

    @PutMapping("/updateAlumno")
    public ResponseEntity<Alumno> updateAlumno(@RequestBody Alumno alumno) {
        sistemaService.updateAlumno(alumno);
        System.out.println("Alumno actualizado");

        return ResponseEntity.ok(alumno);
    }

    @DeleteMapping("/deleteAlumno/{dni}")
    public void deleteAlumno(@PathVariable("dni") Integer dni) {
        sistemaService.deleteAlumno(dni);
        System.out.println("Alumno eliminado");
    }

}

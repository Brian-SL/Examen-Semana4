package com.example.ExamenSemana4;

import com.example.ExamenSemana4.entity.*;
import com.example.ExamenSemana4.repository.AlumnoRepositoryDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ExamenSemana4Application {

	public static void main(String[] args) {
		SpringApplication.run(ExamenSemana4Application.class, args);
	}
/*
	@Bean
	public CommandLineRunner demo(AlumnoRepositoryDao alumnoRepositoryDao) {
		return args -> {

			Tema t = new Tema("Eventos", "aaaaa", 5);
			Tema t2 = new Tema("Probabilidad", "bbbb", 3);
			Tema t3 = new Tema("Distribucion Normal", "cccc", 2);

			Modulo submodulo= new Modulo("Probabilidad y estadistica", "dddd", 1);
			submodulo.setContenidoList(List.of(t, t2, t3));

			Modulo modulo= new Modulo("Estadistica 2", "descripcion estadistica 2", 3);
			modulo.setContenidoList(List.of(submodulo));

			Curso curso = new Curso(List.of(modulo));

			Expediente expendiente = new Expediente("19/11/2021",8,"01/12/2021",List.of(curso));

			Alumno alumno = new Alumno("Brian","Segura","Satelite 209","brian123@gmail.com",List.of(expendiente));
			alumnoRepositoryDao.save(alumno);


		};
	}*/

}

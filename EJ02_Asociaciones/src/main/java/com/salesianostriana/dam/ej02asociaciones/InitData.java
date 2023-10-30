package com.salesianostriana.dam.ej02asociaciones;

import com.salesianostriana.dam.ej02asociaciones.entities.models.Alumno;
import com.salesianostriana.dam.ej02asociaciones.entities.models.Asignatura;
import com.salesianostriana.dam.ej02asociaciones.entities.repos.AlumnoRepositorio;
import com.salesianostriana.dam.ej02asociaciones.entities.repos.AsignaturaRepositorio;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;

@Component
@RequiredArgsConstructor
public class InitData {

    private final AlumnoRepositorio alumnoRepositorio;
    private final AsignaturaRepositorio asignaturaRepositorio;

    @PostConstruct
    public void init(){
        Alumno a1 = new Alumno(1L, "Paco", "González", "paco@gmail.com", "682452338", LocalDate.of(1967, 12, 31), new ArrayList<>(), new ArrayList<>());
        Alumno a2 = new Alumno(2L, "Manolo", "Lama", "manolo@gmail.com", "625485699", LocalDate.of(1959, 4, 17), new ArrayList<>(), new ArrayList<>());
        Alumno a3 = new Alumno(3L, "Pepe Domingo", "Castaño", "pepe@gmail.com", "612004512", LocalDate.of(1946, 8, 23), new ArrayList<>(), new ArrayList<>());
        alumnoRepositorio.save(a1);
        alumnoRepositorio.save(a2);
        alumnoRepositorio.save(a3);

        Asignatura as1 = new Asignatura(1L, "Acceso a Datos", 20, "Lorem", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        Asignatura as2 = new Asignatura(2L, "Programacion de Servicios y Procesos", 32, "Lorem", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        Asignatura as3 = new Asignatura(3L, "Desarrollo de Interfaces", 47, "Lorem", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        asignaturaRepositorio.save(as1);
        asignaturaRepositorio.save(as2);
        asignaturaRepositorio.save(as3);

    }
}

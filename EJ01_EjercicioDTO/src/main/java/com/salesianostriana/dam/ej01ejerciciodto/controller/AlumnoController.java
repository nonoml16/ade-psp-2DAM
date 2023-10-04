package com.salesianostriana.dam.ej01ejerciciodto.controller;

import com.salesianostriana.dam.ej01ejerciciodto.dto.AlumnoDto;
import com.salesianostriana.dam.ej01ejerciciodto.model.Alumno;
import com.salesianostriana.dam.ej01ejerciciodto.repositories.AlumnoRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/alumno")
public class AlumnoController {

    private final AlumnoRepositorio alumnoRepositorio;

    @GetMapping("/")
    public ResponseEntity<List<AlumnoDto>> getAll (){

        List<Alumno> alumnos = alumnoRepositorio.findAll();

        if (alumnos.isEmpty())
            return ResponseEntity.notFound().build();

        List<AlumnoDto> resultado = alumnos.stream()
                .map(AlumnoDto::of)
                .toList();

        return ResponseEntity.ok(resultado);
    }
}
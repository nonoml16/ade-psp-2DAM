package com.salesianostriana.dam.ej01ejerciciodto.repositories;

import com.salesianostriana.dam.ej01ejerciciodto.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepositorio extends JpaRepository<Alumno, Long> {
}

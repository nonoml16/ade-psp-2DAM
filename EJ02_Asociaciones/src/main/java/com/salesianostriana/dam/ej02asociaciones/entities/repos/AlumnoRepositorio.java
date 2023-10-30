package com.salesianostriana.dam.ej02asociaciones.entities.repos;

import com.salesianostriana.dam.ej02asociaciones.entities.models.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepositorio extends JpaRepository<Alumno, Long> {
}

package com.salesianostriana.dam.ej01ejerciciodto.repositories;

import com.salesianostriana.dam.ej01ejerciciodto.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepositorio extends JpaRepository<Curso, Long> {
}

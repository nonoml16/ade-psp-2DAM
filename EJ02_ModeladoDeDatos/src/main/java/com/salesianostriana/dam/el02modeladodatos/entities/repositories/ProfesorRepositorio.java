package com.salesianostriana.dam.el02modeladodatos.entities.repositories;

import com.salesianostriana.dam.el02modeladodatos.entities.models.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepositorio extends JpaRepository<Profesor, Long> {
}

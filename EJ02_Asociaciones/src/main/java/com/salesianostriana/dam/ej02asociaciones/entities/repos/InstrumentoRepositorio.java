package com.salesianostriana.dam.ej02asociaciones.entities.repos;

import com.salesianostriana.dam.ej02asociaciones.entities.models.Instrumento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstrumentoRepositorio extends JpaRepository<Instrumento, Long> {
}

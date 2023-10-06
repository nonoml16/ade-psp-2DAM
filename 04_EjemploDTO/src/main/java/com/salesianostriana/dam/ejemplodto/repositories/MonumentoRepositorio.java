package com.salesianostriana.dam.ejemplodto.repositories;

import com.salesianostriana.dam.ejemplodto.model.Monumento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonumentoRepositorio extends JpaRepository<Monumento, Long> {
}

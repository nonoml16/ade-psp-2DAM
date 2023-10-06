package com.salesianostriana.dam.ejemplodto.repositories;

import com.salesianostriana.dam.ejemplodto.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepositorio extends JpaRepository<Categoria, Long> {
}

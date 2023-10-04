package com.salesianostriana.dam.ej01ejerciciodtoap2.repositories;

import com.salesianostriana.dam.ej01ejerciciodtoap2.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepositorio extends JpaRepository<Categoria, Long> {
}

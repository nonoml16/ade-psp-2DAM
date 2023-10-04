package com.salesianostriana.dam.ej01ejerciciodtoap2.repositories;

import com.salesianostriana.dam.ej01ejerciciodtoap2.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepositorio extends JpaRepository<Producto, Long> {
}

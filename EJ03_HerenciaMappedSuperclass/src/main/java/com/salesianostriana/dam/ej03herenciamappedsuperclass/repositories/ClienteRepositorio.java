package com.salesianostriana.dam.ej03herenciamappedsuperclass.repositories;

import com.salesianostriana.dam.ej03herenciamappedsuperclass.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {
}

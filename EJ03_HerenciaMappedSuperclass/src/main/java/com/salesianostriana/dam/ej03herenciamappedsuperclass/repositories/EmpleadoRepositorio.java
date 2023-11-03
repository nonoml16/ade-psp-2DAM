package com.salesianostriana.dam.ej03herenciamappedsuperclass.repositories;

import com.salesianostriana.dam.ej03herenciamappedsuperclass.models.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Long> {
}

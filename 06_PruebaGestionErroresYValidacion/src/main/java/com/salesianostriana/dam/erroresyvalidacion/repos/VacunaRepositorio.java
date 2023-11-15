package com.salesianostriana.dam.erroresyvalidacion.repos;

import com.salesianostriana.dam.erroresyvalidacion.models.Vacuna;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacunaRepositorio extends JpaRepository<Vacuna, Long> {
}

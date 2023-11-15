package com.salesianostriana.dam.erroresyvalidacion.services;

import com.salesianostriana.dam.erroresyvalidacion.DTOs.PostVacunaDTO;
import com.salesianostriana.dam.erroresyvalidacion.models.Vacuna;
import com.salesianostriana.dam.erroresyvalidacion.repos.VacunaRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VacunaService {

    private final VacunaRepositorio repositorio;

    public Vacuna save(PostVacunaDTO nuevo) {
        Vacuna v = new Vacuna();
        v.setNombre(nuevo.nombre());
        v.setDescripcionEnfermedad(nuevo.descripcion());
        return repositorio.save(v);
    }

    public List<Vacuna> getAll() {
        return repositorio.findAll();
    }

    public Optional<Vacuna> getByID(Long id) {
        return repositorio.findById(id);
    }

}

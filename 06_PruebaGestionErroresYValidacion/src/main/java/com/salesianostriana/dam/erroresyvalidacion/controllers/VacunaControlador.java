package com.salesianostriana.dam.erroresyvalidacion.controllers;

import com.salesianostriana.dam.erroresyvalidacion.DTOs.PostVacunaDTO;
import com.salesianostriana.dam.erroresyvalidacion.errors.VacunaNotFoundException;
import com.salesianostriana.dam.erroresyvalidacion.models.Vacuna;
import com.salesianostriana.dam.erroresyvalidacion.services.VacunaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequiredArgsConstructor
public class VacunaControlador {

    private final VacunaService service;

    @PostMapping("/")
    public ResponseEntity<Vacuna> nuevaVacuna(
            @Valid @RequestBody PostVacunaDTO nuevo){

        Vacuna vacuna = service.save(nuevo);

        URI vacunaURI = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(vacuna.getId()).toUri();

        return ResponseEntity
                .created(vacunaURI)
                .body(vacuna);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vacuna> findID(@PathVariable Long id){
        return service.getByID(id)
                .map(ResponseEntity::ok)
                .orElseThrow(() -> new VacunaNotFoundException(id));
    }
}

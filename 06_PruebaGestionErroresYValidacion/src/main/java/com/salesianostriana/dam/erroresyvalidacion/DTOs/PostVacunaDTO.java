package com.salesianostriana.dam.erroresyvalidacion.DTOs;

import com.fasterxml.jackson.annotation.JsonView;
import com.salesianostriana.dam.erroresyvalidacion.models.Vacuna;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record PostVacunaDTO(
        @NotEmpty
        String nombre,
        @NotBlank
        String descripcion) {
    public static PostVacunaDTO of(Vacuna v){
        return new PostVacunaDTO(
                v.getNombre(),
                v.getDescripcionEnfermedad()
        );
    }
}
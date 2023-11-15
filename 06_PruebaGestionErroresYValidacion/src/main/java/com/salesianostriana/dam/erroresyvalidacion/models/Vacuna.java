package com.salesianostriana.dam.erroresyvalidacion.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@ToString
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vacuna {

    @Id @GeneratedValue
    private Long id;

    private String nombre;

    private String descripcionEnfermedad;
}

package com.salesianostriana.dam.ej03herenciamappedsuperclass.models;

import jakarta.persistence.*;
import lombok.*;

@MappedSuperclass
@Getter @Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public abstract class Usuario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    protected String dni;
}

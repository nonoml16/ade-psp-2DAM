package com.salesianostriana.dam.ejemplodto.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.service.spi.InjectService;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ruta {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private int tiempo;

    @Enumerated(EnumType.STRING)
    private Dificultad dificultad;

    @OneToMany
    private List<Monumento> monumentos;

}

package com.salesianostriana.dam.rest.dto.model.entities;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.salesianostriana.dam.rest.dto.model.views.RutaView.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ruta {

    @Id @GeneratedValue
    @JsonView(RutaList.class)
    private Long id;

    @JsonView(RutaList.class)
    private String nombre;

    @JsonView(RutaDetail.class)
    private int tiempo; // en minutos

    @JsonView(RutaDetail.class)
    @Enumerated(EnumType.STRING)
    private Dificultad dificultad;

    @ManyToMany
    private List<Monumento> monumentos;

}

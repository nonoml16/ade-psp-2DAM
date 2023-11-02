package com.salesianostriana.dam.el02modeladodatos.entities.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@ToString
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Profesor {

    @Id @GeneratedValue
    private Long id;

    private String nombre, email;

    private float puntuacion;

    @ToString.Exclude
    @OneToMany(mappedBy = "profesor", orphanRemoval = true)
    private List<CursoOnline> cursoOnlines = new ArrayList<>();

}

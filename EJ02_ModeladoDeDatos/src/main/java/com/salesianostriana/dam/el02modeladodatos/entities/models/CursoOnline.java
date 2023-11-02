package com.salesianostriana.dam.el02modeladodatos.entities.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@ToString
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class CursoOnline {

    @Id @GeneratedValue
    private Long id;

    private String nombre;

    private float puntuacion;

    @ManyToOne
    @JoinColumn(name = "profesor_id")
    private Profesor profesor;

    @ToString.Exclude
    @OneToMany(mappedBy = "cursoOnline", orphanRemoval = true)
    private List<Video> videos = new ArrayList<>();

}

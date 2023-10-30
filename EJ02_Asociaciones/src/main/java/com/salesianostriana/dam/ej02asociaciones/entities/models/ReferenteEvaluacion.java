package com.salesianostriana.dam.ej02asociaciones.entities.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@ToString
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReferenteEvaluacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long codReferente;

    private String descripcion;

    @ManyToMany(mappedBy = "referenteEvaluacions")
    @ToString.Exclude
    private List<Instrumento> instrumentos = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "asignatura_id")
    private Asignatura asignatura;

    @ManyToOne
    @JoinColumn(name = "calificacion_id")
    private Calificacion calificacion;

}
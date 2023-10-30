package com.salesianostriana.dam.ej02asociaciones.entities.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@ToString
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Instrumento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private LocalDate fecha;

    private String nombre, contenidos;

    @ManyToOne
    @JoinColumn(name = "asignatura_id")
    private Asignatura asignatura;

    @ManyToMany
    @JoinTable(name = "Instrumento_referenteEvaluacions",
            joinColumns = @JoinColumn(name = "instrumento_id"),
            inverseJoinColumns = @JoinColumn(name = "referenteEvaluacions_id"))
    @ToString.Exclude
    private List<ReferenteEvaluacion> referenteEvaluacions = new ArrayList<>();

}
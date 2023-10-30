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
public class Asignatura {

    @Id @GeneratedValue
    private Long id;

    private String nombre;

    private int horas;

    private String descripcion;

    @OneToMany(mappedBy = "asignatura", orphanRemoval = true)
    @ToString.Exclude
    private List<Instrumento> instrumentos = new ArrayList<>();

    @ManyToMany(mappedBy = "asignaturas")
    @ToString.Exclude
    private List<Alumno> alumnoes = new ArrayList<>();

    @OneToMany(mappedBy = "asignatura", orphanRemoval = true)
    @ToString.Exclude
    private List<ReferenteEvaluacion> referenteEvaluacions = new ArrayList<>();

}

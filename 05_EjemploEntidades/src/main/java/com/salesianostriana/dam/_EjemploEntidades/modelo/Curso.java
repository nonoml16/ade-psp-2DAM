package com.salesianostriana.dam._EjemploEntidades.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nombre;

    //todo
    @ToString.Exclude
    @OneToMany(mappedBy = "curso", orphanRemoval = true)
    private List<Alumno> alumnoes = new ArrayList<>();

}
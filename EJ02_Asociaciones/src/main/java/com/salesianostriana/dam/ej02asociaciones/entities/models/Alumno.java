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
public class Alumno {

    @Id @GeneratedValue
    private Long id;

    private String nombre, apellidos, email, telefono;
    private LocalDate fechaNacimiento;

    @ManyToMany
    @JoinTable(name = "Alumno_asignaturas",
            joinColumns = @JoinColumn(name = "alumno_id"),
            inverseJoinColumns = @JoinColumn(name = "asignaturas_id"))
    @ToString.Exclude
    private List<Asignatura> asignaturas = new ArrayList<>();

    @OneToMany(orphanRemoval = true)
    @JoinColumn(name = "alumno_id")
    @ToString.Exclude
    private List<Calificacion> calificaciones = new ArrayList<>();

}

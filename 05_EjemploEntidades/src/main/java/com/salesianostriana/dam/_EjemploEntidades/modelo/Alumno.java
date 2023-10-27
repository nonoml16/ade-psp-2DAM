package com.salesianostriana.dam._EjemploEntidades.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "alumno")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nombre, apellidos;

    private LocalDate fechaNacimiento;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;

    //Helpers
    public void addToCurso(Curso curso){
        this.curso = curso;
        curso.getAlumnoes().add(this);
    }

}
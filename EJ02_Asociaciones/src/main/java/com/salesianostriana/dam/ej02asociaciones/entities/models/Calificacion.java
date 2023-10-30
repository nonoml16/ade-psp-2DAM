package com.salesianostriana.dam.ej02asociaciones.entities.models;

import com.salesianostriana.dam.ej02asociaciones.entities.models.Alumno;
import com.salesianostriana.dam.ej02asociaciones.entities.models.Instrumento;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@ToString
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Calificacion {

    @Id @GeneratedValue
    private Long id;

    private double calificacion;

    @ManyToOne
    @JoinColumn(name = "alumno_id")
    private Alumno alumno;

    @ManyToOne
    @JoinColumn(name = "instrumento_id")
    private Instrumento instrumento;

    @OneToMany(mappedBy = "calificacion", orphanRemoval = true)
    @ToString.Exclude
    private List<ReferenteEvaluacion> referenteEvaluacions = new ArrayList<>();

}
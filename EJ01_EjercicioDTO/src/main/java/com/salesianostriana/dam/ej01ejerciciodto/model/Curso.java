package com.salesianostriana.dam.ej01ejerciciodto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Curso {

    @Id
    @GeneratedValue
    private Long id;

    String nombre, tipo, tutor, aula;
}

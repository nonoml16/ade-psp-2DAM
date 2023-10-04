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
public class Direccion {

    @Id
    @GeneratedValue
    private Long id;

    private String tipoVia, linea1, linea2, poblacion, provincia;
    private int cp;
}

package com.salesianostriana.dam.ow01tallerdto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Auto {

    @Id
    private String placa;
    private String marca, modelo, propietario;
}

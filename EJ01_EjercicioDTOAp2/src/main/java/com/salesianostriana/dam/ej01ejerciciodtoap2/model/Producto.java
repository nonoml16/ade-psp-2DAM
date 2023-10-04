package com.salesianostriana.dam.ej01ejerciciodtoap2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Producto {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre, desc;
    private Double pvp;
    private List<String> imagenes;

    @ManyToOne
    private Categoria categoria;
}
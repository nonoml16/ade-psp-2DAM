package com.salesianostriana.dam.ejemplodto.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Monumento {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre, codPais, direccion, localidad, localizacion;
    private String[] imagenes;

    @ManyToOne
    private Categoria categoria;
    @ManyToOne
    private Ruta ruta;
}

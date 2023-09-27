package com.salesianostriana.dam.ejeval01monumentos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Monumento {

    @Id
    @GeneratedValue
    private Long id;

    private String codPais, nombrePais, nombreCiudad, latitud, longitud,
            nombreMonumento, descripcion, urlImagen;

}

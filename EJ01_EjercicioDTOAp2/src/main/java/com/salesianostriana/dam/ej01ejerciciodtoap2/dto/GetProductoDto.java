package com.salesianostriana.dam.ej01ejerciciodtoap2.dto;

import com.salesianostriana.dam.ej01ejerciciodtoap2.model.Producto;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class GetProductoDto {

    private String nombre, imagen, categoria;
    private double pvp;

    public static GetProductoDto of(Producto producto){
        return GetProductoDto.builder()
                .nombre(producto.getNombre())
                .pvp(producto.getPvp())
                .imagen(producto.getImagenes().get(1))
                .categoria(
                        producto.getCategoria() != null
                                ? producto.getCategoria().getNombre()
                                : "Sin categoria"
                )
                .build();
    }
}

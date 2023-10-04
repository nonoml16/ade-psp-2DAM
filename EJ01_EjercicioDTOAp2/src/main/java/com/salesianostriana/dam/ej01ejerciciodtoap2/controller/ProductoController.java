package com.salesianostriana.dam.ej01ejerciciodtoap2.controller;

import com.salesianostriana.dam.ej01ejerciciodtoap2.dto.GetProductoDto;
import com.salesianostriana.dam.ej01ejerciciodtoap2.model.Producto;
import com.salesianostriana.dam.ej01ejerciciodtoap2.repositories.ProductoRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/producto")
@RequiredArgsConstructor
public class ProductoController {

    private final ProductoRepositorio productoRepositorio;

    @GetMapping("/")
    public ResponseEntity<List<GetProductoDto>> todos() {

        List<Producto> data = productoRepositorio.findAll();

        if (data.isEmpty())
            return ResponseEntity.notFound().build();

        List<GetProductoDto> result =
                data.stream()
                        .map(GetProductoDto::of)
                        .toList();

        return ResponseEntity.ok(result);

    }
}

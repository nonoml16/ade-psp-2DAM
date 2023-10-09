package com.salesianostriana.dam.rest.dto.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.salesianostriana.dam.rest.dto.dto.GetMonumentoDetailsDto;
import com.salesianostriana.dam.rest.dto.dto.GetMonumentoDto;
import com.salesianostriana.dam.rest.dto.model.entities.Monumento;
import com.salesianostriana.dam.rest.dto.model.repos.MonumentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.salesianostriana.dam.rest.dto.model.views.MonumentoView.*;

@RestController
@RequestMapping("/monumento")
@RequiredArgsConstructor
public class MonumentoController {

    private final MonumentoRepository monumentoRepository;

    @GetMapping("/")
    @JsonView(MonumentoList.class)
    public ResponseEntity<List<GetMonumentoDto>> todos() {

        List<Monumento> data = monumentoRepository.findAll();

        if (data.isEmpty())
            return ResponseEntity.notFound().build();

        // Aquí hacemos la transformación de Monumento -> GetMonumentoDto
        List<GetMonumentoDto> result =
                data.stream()
                        .map(GetMonumentoDto::of)
                        .toList();

        return ResponseEntity.ok(result);

    }

    @GetMapping("/{id}")
    @JsonView(MonumentoList.class)
    public ResponseEntity<GetMonumentoDetailsDto> porId(@PathVariable Long id) {
        return ResponseEntity.of(monumentoRepository.findById(id)
                .map(GetMonumentoDetailsDto::of));
    }

}

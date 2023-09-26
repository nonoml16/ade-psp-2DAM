package com.salesianostriana.dam.ejemplospringboot2;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Servicio {

    private final Componente componente;
    private final Componente2 componente2;

}

package com.salesianostriana.dam.el02modeladodatos;

import com.salesianostriana.dam.el02modeladodatos.entities.models.CursoOnline;
import com.salesianostriana.dam.el02modeladodatos.entities.models.Profesor;
import com.salesianostriana.dam.el02modeladodatos.entities.repositories.CursoOnlineRepositorio;
import com.salesianostriana.dam.el02modeladodatos.entities.repositories.ProfesorRepositorio;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InitData {

    private final ProfesorRepositorio profesorRepositorio;
    private final CursoOnlineRepositorio cursoOnlineRepositorio;

    @PostConstruct
    public void init(){

        Profesor p1 = Profesor.builder()
                .nombre("Luismi")
                .email("luismi@triana.com")
                .puntuacion(4.5F)
                .build();

        profesorRepositorio.save(p1);

        Profesor p2 = Profesor.builder()
                .nombre("Michael")
                .email("michaelfields@triana.com")
                .puntuacion(4.49F)
                .build();

        profesorRepositorio.save(p2);
    }
}

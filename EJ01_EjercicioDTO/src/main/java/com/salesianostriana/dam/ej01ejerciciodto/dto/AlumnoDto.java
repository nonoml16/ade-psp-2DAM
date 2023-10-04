package com.salesianostriana.dam.ej01ejerciciodto.dto;

import com.salesianostriana.dam.ej01ejerciciodto.model.Alumno;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class AlumnoDto {

    private String nombre, apellidos, email, curso, direccion;

    public static AlumnoDto of(Alumno alumno){
        return AlumnoDto.builder()
                .nombre(alumno.getNombre())
                .apellidos(alumno.getApellido1() + " " + alumno.getApellido2())
                .email(alumno.getEmail())
                .curso(alumno.getCurso().getNombre())
                .direccion(alumno.getDireccion().getLinea1())
                .build();
    }

}
package com.salesianostriana.dam.rest.dto.model.entities;

import com.fasterxml.jackson.annotation.JsonView;
import com.salesianostriana.dam.rest.dto.model.views.MonumentoView;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.salesianostriana.dam.rest.dto.model.views.MonumentoView.*;

@Entity
@Data // Jpa Buddy
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Monumento {

    @Id @GeneratedValue
    @JsonView(MonumentoList.class)
    private Long id;

    private String codigoPais;

    @JsonView(MonumentoList.class)
    private String pais;

    @JsonView(MonumentoList.class)
    private String ciudad;

    private String loc;

    @JsonView(MonumentoList.class)
    private String nombre;

    @JsonView({MonumentoDetail.class, MonumentoEdit.class})
    private String descripcion;

    @ElementCollection // Obligatoria en Spring Boot 2.
    @JsonView({MonumentoDetail.class, MonumentoEdit.class})
    private List<String> imagenes;

    @ManyToOne
    private Categoria categoria;


}

package com.salesianostriana.dam.ej03herenciamappedsuperclass.models;

import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter @Setter
@Builder @ToString
@NoArgsConstructor
@AllArgsConstructor
public class Cliente extends Usuario {

    private int numeroPedidos;
    private LocalDate ultimoPedido;
}

package com.salesianostriana.dam.pruebadb;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@ToString
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "entidad")
public class Entidad {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String nombre;
}
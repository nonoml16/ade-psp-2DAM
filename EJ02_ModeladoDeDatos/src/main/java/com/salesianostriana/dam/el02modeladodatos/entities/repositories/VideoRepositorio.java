package com.salesianostriana.dam.el02modeladodatos.entities.repositories;

import com.salesianostriana.dam.el02modeladodatos.entities.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepositorio extends JpaRepository<Video, Long> {
}

package com.salesianostriana.dam.el02modeladodatos.entities.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@ToString
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Video {

    @Id @GeneratedValue
    private Long id;

    private int orden;

    private String titulo, descripcion, url;

    @ManyToOne
    @JoinColumn(name = "curso_online_id")
    private CursoOnline cursoOnline;

    //Helpers
    public void addToCursoOnline(CursoOnline cursoOnline){
        this.cursoOnline = cursoOnline;
        cursoOnline.getVideos().add(this);
    }

    public void removeFromCursoOnline(CursoOnline cursoOnline){
        cursoOnline.getVideos().remove(this);
        this.cursoOnline = null;
    }
}

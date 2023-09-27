package com.salesianostriana.dam.ejemploapirest;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@ResponseBody
public class ControladorAlumno {

    //GET (200 OK) (404 NOT FOUND)
    //POST (201 CREATED) (400 BAD REQUEST)
    //PUT (200 OK) (400 BAD REQUEST) (404 NOT FOUND)
    //DELELTE (204 TODO BIEN PERO EL CUERPO DE LA RESPUESTA ESTA VACIO)
    private AlumnoRepositorio repositorioAlumno;

    @GetMapping("/alumno/")
    public ResponseEntity<List<Alumno>> getAll(){
        List<Alumno> result = repositorioAlumno.findAll();

        if(result.isEmpty())
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(result);
    }

    @GetMapping("/alumno/{id}")
    public ResponseEntity<Alumno> getById(@PathVariable Long id){
        return ResponseEntity.of(repositorioAlumno.findById(id));
    }

    @PostMapping("/alumno/")
    public ResponseEntity<Alumno> create(@RequestBody Alumno alumno){
        Alumno nuevo = repositorioAlumno.save(alumno);
        //return ResponseEntity.created(null).body(nuevo);
        return ResponseEntity.status(201).body(nuevo);
    }

    @PutMapping("/alumno/{id}")
    public Alumno edit(@PathVariable Long id, @RequestBody Alumno alumno){

        return repositorioAlumno.findById(id)
                .map(antiguo -> {
                    antiguo.setNombre(alumno.getNombre());
                    antiguo.setApellidos(alumno.getApellidos());
                    antiguo.setEmail(alumno.getEmail());
                    antiguo.setEdad(alumno.getEdad());
                    return repositorioAlumno.save(antiguo);
                })
                .orElse(null);
    }

    @DeleteMapping("/alumno/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        if(repositorioAlumno.existsById(id))
            repositorioAlumno.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}

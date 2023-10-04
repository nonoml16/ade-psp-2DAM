package com.salesianostriana.dam.ejeval01monumentos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MonumentoControlador {

    private MonumentoRepositorio monumentoRepositorio;

    @GetMapping("/monumento/")
    public ResponseEntity<List<Monumento>> getAll(){
        List<Monumento> resultado = monumentoRepositorio.findAll();

        if(resultado.isEmpty())
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(resultado);
    }

    @GetMapping("/monumento/{id}")
    public ResponseEntity<Monumento> getById(@PathVariable Long id){
        return ResponseEntity.of(monumentoRepositorio.findById(id));
    }

    @PostMapping("/monumento/")
    public ResponseEntity<Monumento> create(@RequestBody Monumento monumento){
        Monumento nuevoMonumento = monumentoRepositorio.save(monumento);

        return ResponseEntity.status(201).body(nuevoMonumento);
    }

    @PutMapping("/monumento/{id}")
    public Monumento edit(@PathVariable Long id, @RequestBody Monumento monumento){
        return monumentoRepositorio.findById(id)
                .map(antiguoM -> {
                     antiguoM.setCodPais(monumento.getCodPais());
                    antiguoM.setNombrePais(monumento.getNombrePais());
                    antiguoM.setNombreCiudad(monumento.getNombreCiudad());
                    antiguoM.setLocalizacion(monumento.getLocalizacion()

                    );
                    antiguoM.setNombreMonumento(monumento.getNombreMonumento());
                    antiguoM.setDescripcion(monumento.getDescripcion());
                    antiguoM.setUrlImagen(monumento.getUrlImagen());
                    return monumentoRepositorio.save(antiguoM);
                })
                .orElse(null);
    }

    @DeleteMapping("/monumento/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        if(monumentoRepositorio.existsById(id))
            monumentoRepositorio.deleteById(id);

        return ResponseEntity.noContent().build();
    }
}

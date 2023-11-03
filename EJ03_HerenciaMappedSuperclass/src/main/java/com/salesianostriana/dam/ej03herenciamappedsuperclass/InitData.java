package com.salesianostriana.dam.ej03herenciamappedsuperclass;


import com.salesianostriana.dam.ej03herenciamappedsuperclass.models.Cliente;
import com.salesianostriana.dam.ej03herenciamappedsuperclass.models.Empleado;
import com.salesianostriana.dam.ej03herenciamappedsuperclass.repositories.ClienteRepositorio;
import com.salesianostriana.dam.ej03herenciamappedsuperclass.repositories.EmpleadoRepositorio;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class InitData {

    private final ClienteRepositorio clienteRepositorio;
    private final EmpleadoRepositorio empleadoRepositorio;

    @PostConstruct
    public void init(){
        Cliente c1 = new Cliente();
        c1.setDni("95668420X");
        c1.setNumeroPedidos(34);
        c1.setUltimoPedido(LocalDate.of(2023, 1, 22));

        clienteRepositorio.save(c1);

        Cliente c2 = new Cliente();
        c2.setDni("65842355C");
        c2.setNumeroPedidos(16);
        c2.setUltimoPedido(LocalDate.of(2023, 4, 11));

        clienteRepositorio.save(c2);

        Empleado e1 = new Empleado();
        e1.setDni("84552489P");
        e1.setSalario(12000);
        e1.setFechaContratacion(LocalDate.of(1999, 11, 20));

        empleadoRepositorio.save(e1);

        Empleado e2 = new Empleado();
        e2.setDni("85412635D");
        e2.setSalario(34000);
        e2.setFechaContratacion(LocalDate.now());

        empleadoRepositorio.save(e2);
    }
}

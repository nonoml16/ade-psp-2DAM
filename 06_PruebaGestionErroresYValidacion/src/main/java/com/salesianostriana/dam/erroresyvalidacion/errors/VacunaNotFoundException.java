package com.salesianostriana.dam.erroresyvalidacion.errors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.ErrorResponseException;

import java.net.URI;
import java.time.Instant;

public class VacunaNotFoundException extends ErrorResponseException {

    public VacunaNotFoundException(Long id) {
        super(HttpStatus.NOT_FOUND, asProblemDetail("Vacuna with id "+ id +" not found"), null);
    }

    public static ProblemDetail asProblemDetail(String mensaje){
        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, mensaje);
        problemDetail.setTitle("Vacuna Not Found");
        problemDetail.setType(URI.create("https://localhost:4200/errors/not-found"));
        problemDetail.setProperty("errorCategory", "Generic");
        problemDetail.setProperty("timestamp", Instant.now());
        return problemDetail;
    }
}

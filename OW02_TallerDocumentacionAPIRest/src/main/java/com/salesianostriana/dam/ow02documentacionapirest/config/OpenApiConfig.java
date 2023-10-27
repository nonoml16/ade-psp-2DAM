package com.salesianostriana.dam.ow02documentacionapirest.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
* http://localhost:8080/v3/api-docs
* http://localhost:8080/swagger-ui/index.html
*/
@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI openApi(){
        return new OpenAPI()
                .info(new Info()
                        .title("Employees API")
                        .description("Descripcion")
                        .version("v0.0.1")
                        .license(new License().name("Licencia").url("https://wwww.ejemplo.com")))
                .externalDocs(new ExternalDocumentation()
                        .description("Wiki Docs")
                        .url("https://wwww.ejemplo.com"));
    }

}

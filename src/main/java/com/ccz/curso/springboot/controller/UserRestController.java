package com.ccz.curso.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController // Sirve para crear APIs REST
public class UserRestController {

    // Ruta diferente, no pueden haber duplicados porque sino Spring Boot no sabe a cuál escoger
    @GetMapping("/detalleUserRestController") // http://localhost:8080/detalleUserRestController
    public Map<String, Object> details() {
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola Mundo Spring Boot");
        body.put("name", "Andrés");
        body.put("lastname", "Carbajal");
        return body; // Devuelve un JSON
    }

}

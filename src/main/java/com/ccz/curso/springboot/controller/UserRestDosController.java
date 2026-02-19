package com.ccz.curso.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController // Sirve para crear APIs REST
@RequestMapping("/api")
public class UserRestDosController {

    // Esta no es una ruta duplicada porque se agrego api
    @GetMapping("/detalleUserRestController") // http://localhost:8080/api/detalleUserRestController
    public Map<String, Object> details() {
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola Mundo Spring Boot");
        body.put("name", "Andrés");
        body.put("lastname", "Carbajal");
        return body; // Devuelve un JSON
    }

}

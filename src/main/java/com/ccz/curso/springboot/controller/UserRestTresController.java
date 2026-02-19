package com.ccz.curso.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

// @RestController se reemplaza por @Controller y @ResponseBody
@Controller // Sirve para crear APIs REST
@RequestMapping("/api")
public class UserRestTresController {

    @GetMapping("/UserRestTresController") // http://localhost:8080/api/UserRestTresController
    // @RequestMapping("/UserRestTresController") // RequestMapping lo mismo que GetMapping
    @ResponseBody
    public Map<String, Object> details() {
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola Mundo Spring Boot");
        body.put("name", "Andrés");
        body.put("lastname", "Carbajal");
        return body; // Devuelve un JSON
    }

    // @GetMapping("/UserRestCuatroController") // http://localhost:8080/api/UserRestCuatroController
    @RequestMapping(path="/UserRestCuatroController", method = RequestMethod.GET)
    // RequestMapping puede ser RequestMethod. GET, POST, DELETE ENTRE OTROS
    @ResponseBody
    public Map<String, Object> detailsdos() {
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola Mundo Spring Boot");
        body.put("name", "Andrés");
        body.put("lastname", "Carbajal");
        return body; // Devuelve un JSON
    }

}

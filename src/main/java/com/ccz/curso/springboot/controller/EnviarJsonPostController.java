package com.ccz.curso.springboot.controller;

import com.ccz.curso.springboot.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/post")
public class EnviarJsonPostController {

    @PostMapping("/create")
    public User create(User user) {
        // Jackson necesita instanciar la clase User. Para ello, busca el constructor por defecto (vacío).
        // Si no existe el constructor vacío, Jackson no puede crear la instancia inicial y lanza un error.
        user.setName(user.getName().toUpperCase());
        // Convertir name en mayúsculas
        return user;
    }
}

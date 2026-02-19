package com.ccz.curso.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Presenta vistas HTML
public class UserController {

    @GetMapping("/detalle") // http://localhost:8080/detalle
    public String details1() {
        // Llama a la pag. web de ~/templates/details.html
        return "details"; // Mismo nombre que la página web que se va a llamar, debe existir
    }

}

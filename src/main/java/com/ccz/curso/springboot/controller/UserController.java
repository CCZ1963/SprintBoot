package com.ccz.curso.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller // Presenta vistas HTML
public class UserController {

    @GetMapping("/detalle") // http://localhost:8080/detalle
    public String details1(Model model) { // Con Model pasamos información
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("name", "Andrés");
        model.addAttribute("lastname", "Carbajal");
        // Llama a la pag. web de ~/templates/details.html
        return "details"; // Mismo nombre que la página web que se va a llamar, debe existir
    }

    // Otra manera de pasar información
    @GetMapping("/otrodetalle") // http://localhost:8080/otrodetalle
    public String details2(Map<String, Object> model) { // Con Model pasamos información
        model.put("title", "Hola Mundo Spring Boot");
        model.put("name", "Andrés");
        model.put("lastname", "Carbajal");
        // Llama a la pag. web de ~/templates/details.html
        return "details"; // Mismo nombre que la página web que se va a llamar, debe existir
    }

}

package com.ccz.curso.springboot.controller;

import com.ccz.curso.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

// @RestController se reemplaza por @Controller y @ResponseBody
@Controller // Sirve para crear APIs REST
@RequestMapping("/api")
public class UserRestCuatroController {

    @GetMapping("/UserRestCuatroAController") // http://localhost:8080/api/UserRestCuatroAController
    // @RequestMapping("/UserRestCuatroAController") // RequestMapping lo mismo que GetMapping
    @ResponseBody // Con esta instrucción avisa a Spring que no busque ninguna vista HTML
    public Map<String, Object> details() {
        User user = new User("Andrés", "Carbajal");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola Mundo Spring Boot");
        body.put("user", user); // JSON con una estructura de árbol
        return body; // Devuelve un JSON
    }

    @GetMapping("/UserRestCuatroBController") // http://localhost:8080/api/UserRestCuatroBController
    // @ResponseBody ya no va para que SpringBoot busque un archivo HTML en la carpeta templates
    public String details(Model model) {
        User user1 = new User("Jorge", "Salamanca");
        Map<String, Object> body = new HashMap<>();
        model.addAttribute("title", "Nombres y Apellidos");
        model.addAttribute("name", user1.getName());
        model.addAttribute("lastname", user1.getLastname());
        return "details";
    }

}

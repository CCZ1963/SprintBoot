package com.ccz.curso.springboot.controller;

import com.ccz.curso.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller // Presenta vistas HTML
public class UserEmailController {

    @GetMapping("/detalle_email") // http://localhost:8080/detalle_email
    public String details1(Model model) { // Con Model pasamos información
        User user = new User("Tobías", "Noriega");
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("name", user.getName());
        model.addAttribute("lastname", user.getLastname());
        // Llama a la pag. web de ~/templates/details_email.html
        return "details_email"; // Mismo nombre que la página web que se va a llamar, debe existir
    }

    @GetMapping("/detalle_email_user2") // http://localhost:8080/detalle_email_user2
    public String details2(Model model) { // Con Model pasamos información
        User user = new User("Mario", "García", "mariogarcia@email.com");
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("user", user);
        // Llama a la pag. web de ~/templates/details_email_user.html
        return "details_email_user";
    }

    @GetMapping("/detalle_email_user3") // http://localhost:8080/detalle_email_user3
    public String details3(Model model) { // Con Model pasamos información
        User user = new User("Mario", "García");
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("user", user);
        // Llama a la pag. web de ~/templates/details_email_user.html
        return "details_email_user";
    }

    @GetMapping("/detalle_email_user4") // http://localhost:8080/detalle_email_user4
    public String details4(Model model) { // Con Model pasamos información
        User user = new User("Mario", "García", "mgarcia@outlook.com");
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("user", user);
        // Llama a la pag. web de ~/templates/details_email_user.html
        return "details_email_user";
    }

}

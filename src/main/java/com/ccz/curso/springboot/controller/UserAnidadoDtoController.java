package com.ccz.curso.springboot.controller;

import com.ccz.curso.springboot.dto.UserAnidadoDto;
import com.ccz.curso.springboot.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController // Sirve para crear APIs REST
@RequestMapping("/api")
public class UserAnidadoDtoController {

    @GetMapping("/UserAnidadoDtoController") // http://localhost:8080/api/UserAnidadoDtoController
    // @RequestMapping("/UserRestDtoController") // RequestMapping lo mismo que GetMapping
    //@ResponseBody Con esta instrucción avisa a Spring que no busque ninguna vista HTML
    public UserAnidadoDto details() {
        UserAnidadoDto userAnidadoDto = new UserAnidadoDto();
        User user = new User("Andrés", "Carbajal");
        userAnidadoDto.setTitle("Hola Mundo desde un DTO");
        userAnidadoDto.setUser(user);
        return userAnidadoDto; // Devuelve un JSON
    }

    @GetMapping(path = "/UserAnidadoDtoAController") // http://localhost:8080/api/UserAnidadoDtoAController
    public Map<String, Object> detailsDto() {

        User user1 = new User("Juan", "Salazar");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola Mundo desde un DTO");
        body.put("user", user1);
        return body;
    }

}

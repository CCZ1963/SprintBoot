package com.ccz.curso.springboot.controller;

import com.ccz.curso.springboot.dto.UserDto;
import com.ccz.curso.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController // Sirve para crear APIs REST
@RequestMapping("/api")
public class UserRestDtoController {

    @GetMapping("/UserRestDtoController") // http://localhost:8080/api/UserRestDtoController
    // @RequestMapping("/UserRestDtoController") // RequestMapping lo mismo que GetMapping
    //@ResponseBody Con esta instrucción avisa a Spring que no busque ninguna vista HTML
    public UserDto details() {
        UserDto userDto = new UserDto();
        User user = new User("Andrés", "Carbajal");
        userDto.setTitle("Hola Mundo desde un DTO");
        userDto.setUser(user);
        return userDto; // Devuelve un JSON
    }

    @GetMapping(path = "/UserRestDtoAController") // http://localhost:8080/api/UserRestDtoAController
    public Map<String, Object> detailsDto() {

        User user1 = new User("Juan", "Salazar");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola Mundo desde un DTO");
        body.put("user", user1);
        return body;
    }

}

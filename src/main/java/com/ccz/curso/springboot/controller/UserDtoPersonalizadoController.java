package com.ccz.curso.springboot.controller;

import com.ccz.curso.springboot.dto.UserDto;
import com.ccz.curso.springboot.dto.UserSinLastnameDto;
import com.ccz.curso.springboot.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController // Sirve para crear APIs REST
@RequestMapping("/api1")
public class UserDtoPersonalizadoController {

    @GetMapping("/UserDtoPersonalizadoControllerA") // http://localhost:8080/api1/UserDtoPersonalizadoControllerA
    public UserDto detailsA() {
        UserDto userDto = new UserDto();
        // Un JSON ya no anidado, lo vamos personalizando.
        userDto.setTitle("Hola Mundo desde un DTO Personalizado");
        userDto.setName("Carlos");
        userDto.setLastname("Huarcaya");
        return userDto; // Devuelve un JSON
    }

    @GetMapping(path = "/UserDtoPersonalizadoControllerB") // http://localhost:8080/api1/UserDtoPersonalizadoControllerB
    public UserDto detailsB() {

        User user = new User("María", "Cansino");
        UserDto userDto = new UserDto();

        userDto.setTitle("Hola Mundo desde un DTO Personalizado");
        userDto.setName(user.getName());
        userDto.setLastname(user.getLastname());

        return userDto;
    }

    @GetMapping(path = "/UserDtoPersonalizadoControllerC") // http://localhost:8080/api1/UserDtoPersonalizadoControllerC
    public UserSinLastnameDto detailsC() {

        User user = new User("María", "Cansino");
        UserSinLastnameDto userSinLastnameDto = new UserSinLastnameDto();

        userSinLastnameDto.setTitle("Hola Mundo desde un DTO Personalizado");
        // Lo sacamos de "user" (María y Cansino)
        userSinLastnameDto.setName(user.getName() + " " + user.getLastname());

        return userSinLastnameDto;
    }

}

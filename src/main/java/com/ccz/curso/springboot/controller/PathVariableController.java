package com.ccz.curso.springboot.controller;

import com.ccz.curso.springboot.dto.ParamDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @GetMapping("/foo/{message}")
    // Message es necesario no hay manera de obviarlo para que funcione la URL
    // message debe llamarse igual en todo el método, no podemos cambiarle de nombre
    public ParamDto foo(@PathVariable() String message){
        // http://localhost:8080/api/var/foo/Este%20es%20un%20mensaje%20de%20texto
        ParamDto  paramDto = new ParamDto();
        paramDto.setMessage(message);
        return paramDto;
    }

    @GetMapping("/foo1/{message}/{id}/{name}")
    // http://localhost:8080/api/var/foo1/Vamos%20por%20todo/5624/Juan
    // message debe llamarse igual en todo el método, no podemos cambiarle de nombre
    public Map<String, Object> foo1(@PathVariable() String message, @PathVariable Long id, @PathVariable String name){
        // http://localhost:8080/api/var/foo/Este%20es%20un%20mensaje%20de%20texto
        Map<String,Object> json = new HashMap<>();

        json.put("message", message);
        json.put("id", id);
        json.put("name", name);
        return json;
    }
}

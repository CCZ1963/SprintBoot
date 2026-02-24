package com.ccz.curso.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/var")
public class InyectarEnvironmentController {

    @Autowired
    private Environment environment;

    // Con Autowired e Environment se reemmplaza todas las variables de abajo
    /*
    @Value("${dato.username}")
    private String username;
    @Value("${dato.code}")
    private String code;
    @Value("${dato.message}")
    private String message;
    @Value("${dato.listOfValues}")
    private String[] listOfValues;

    @Value("${values1.variable1}")
    private String variable1;
    @Value("${values1.variable2}")
    private String variable2;
    @Value("${values1.variable3}")
    private String variable3;
    @Value("${values1.variable4}")
    private String variable4;

    . . . y demás
    */

    @GetMapping("/environment")
    // El archivo application.properties src/main/resources
    // Es donde se ingresaron los valores de cada variable
    // Cuando se trata de archivos properties es mejor no utilizar acentos o ñ
    public Map<String, Object> values() {

        Long code3 = environment.getProperty("dato.code", Long.class);

        Map<String, Object> json = new HashMap<>();
        json.put("code", Integer.valueOf(environment.getProperty("dato.code")));
        json.put("code2", environment.getProperty("dato.code", Long.class));
        json.put("code3", code3);
        json.put("username", environment.getProperty("dato.username"));
        json.put("message", environment.getProperty("dato.message"));
        json.put("othermessage", environment.getProperty("dato.othermessage"));
        json.put("listOfValues", environment.getProperty("dato.listOfValues"));
        json.put("listOfValues2", environment.getProperty("dato.listOfValues", String[].class));
        json.put("listOfValues3", environment.getProperty("dato.listOfValues", List.class));

        return json;
    }
}


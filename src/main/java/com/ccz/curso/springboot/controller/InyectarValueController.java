package com.ccz.curso.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/var")
public class InyectarValueController {

    @Value("${dato.username}")
    private String username;
    @Value("${dato.code}")
    private String code;
    @Value("${dato.message}")
    private String message;
    @Value("${dato.listOfValues}")
    private String[] listOfValues;

    @GetMapping("/values")
    // dato.messagedos lo inyectamos como argumento como @Value
    public Map<String, Object> values(@Value("${dato.messagedos}") String messagedos) {

        Map<String, Object> json = new HashMap<>();
        json.put("username", username);
        json.put("code", code);
        json.put("message", message);
        json.put("messagedos", messagedos);
        json.put("listOfValues", listOfValues);

        return json;
    }
}

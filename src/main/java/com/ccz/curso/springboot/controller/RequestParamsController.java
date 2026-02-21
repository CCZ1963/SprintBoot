package com.ccz.curso.springboot.controller;

import com.ccz.curso.springboot.dto.ParamDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    @GetMapping("/foo") // localhost:8080/api/params/foo?message=Colocar aquí mensaje
    public ParamDto foo(@RequestParam String message) {
        // message tiene que enviarse sino produce un error
        ParamDto paramDto = new ParamDto();
        paramDto.setMessage(message);
        return paramDto;

    }

    @GetMapping("/foo1") // localhost:8080/api/params/foo1
    public ParamDto foo1(@RequestParam (required = false) String message) {
        // message ya no es obligatorio por (required = false)
        ParamDto paramDto = new ParamDto();
        paramDto.setMessage(message);
        return paramDto;

    }

    @GetMapping("/foo2") // localhost:8080/api/params/foo2
    public ParamDto foo2(@RequestParam (required = false) String message) {
        // message ya no es obligatorio por (required = false)
        ParamDto paramDto = new ParamDto();
        // Si no hay mensaje muestra "Sin mensaje 2"
        paramDto.setMessage(message != null ? message : "Sin mensaje 2" );
        return paramDto;

    }

    @GetMapping("/foo3") // localhost:8080/api/params/foo3
    public ParamDto foo3(@RequestParam (required = false, defaultValue = "No hay mensaje 3") String message) {
        // message ya no es obligatorio por (required = false) y tiene mensaje por defecto
        ParamDto paramDto = new ParamDto();
        paramDto.setMessage(message);
        return paramDto;

    }


}

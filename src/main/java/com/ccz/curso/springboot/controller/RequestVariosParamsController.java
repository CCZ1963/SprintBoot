package com.ccz.curso.springboot.controller;

import com.ccz.curso.springboot.dto.VariosParamDto;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/variosparam")
public class RequestVariosParamsController {

    @GetMapping("/foo") // http://localhost:8080/api/variosparam/foo?text=Un%20mensaje%20por%20text&code=777
    public VariosParamDto foo(@RequestParam String text, @RequestParam Integer code) {
        // message tiene que enviarse sino produce un error
        // http://localhost:8080/api/variosparams/foo?text=Un%20mensaje%20por%20text&code=777
        VariosParamDto variosParamsDto = new VariosParamDto();
        variosParamsDto.setMessage(text);
        variosParamsDto.setCode(code);
        return variosParamsDto;
    }

    @GetMapping("/foo1") // http://localhost:8080/api/variosparam/foo1?text=Un%20mensaje%20por%20text&code=777
    // Usamos una forma nativa
    public VariosParamDto foo1(HttpServletRequest request) {
        // message tiene que enviarse sino produce un error
        VariosParamDto variosParamsDto = new VariosParamDto();
        variosParamsDto.setMessage(request.getParameter("text"));
        // code es Integer y necesita un String
        variosParamsDto.setCode(Integer.parseInt(request.getParameter("code")));
        return variosParamsDto;
    }

    @GetMapping("/foo2") // http://localhost:8080/api/variosparam/foo2?text=Un%20mensaje%20por%20text&code=777
    public VariosParamDto foo2(HttpServletRequest request) {
        Integer code = 10; // Valor por defecto, puede faltar valor
        try {
            code = Integer.parseInt(request.getParameter("code"));
        } catch (NumberFormatException e) {

        }
        // message tiene que enviarse sino produce un error
        VariosParamDto variosParamsDto = new VariosParamDto();
        variosParamsDto.setMessage(request.getParameter("text"));
        variosParamsDto.setCode(code);
        return variosParamsDto;
    }

}

package com.ccz.curso.springboot.controller;

import com.ccz.curso.springboot.dto.VariosParamDto;
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



}

package com.ccz.curso.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"", "/", "/home"})
    public String home() {

        return "forward:/detalle";
        // return "redirect:/detalle";
        // return "redirect:/otrodetalle";
        // return "forward:/otrodetalle";
        // return "redirect:/api/params/foo1";
        // return "redirect:<dirección existente a la cual queremos redirigir>
        /* La principal diferencia es que redirect ocurre en el navegador (cliente),
         cambiando la URL y creando una nueva solicitud, mientras que forward sucede
         internamente en el servidor, manteniendo la misma URL y reutilizando
         la solicitud original. Redirect es del lado del cliente (navegador);
         Forward es del lado del servidor.
         */

    }
}

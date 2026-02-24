package com.ccz.curso.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/var")
public class InyectarValueController {

    // Configurado en WebAppApplication
    // Variables en application.properties
    @Value("${dato.username}")
    private String username;
    @Value("${dato.code}")
    private String code;
    @Value("${dato.message}")
    private String message;
    @Value("${dato.listOfValues}")
    private String[] listOfValues; // Como Array, resultado e JSON es el mismo

    // Configurado en WebAppApplication
    // Variables en values.properties
    @Value("${valor.nombre}")
    private String nombre;
    @Value("${valor.codigo}")
    private String codigo;
    @Value("${valor.mensaje}")
    private String mensaje;
    @Value("#{${valor.valoresMap}}")
    private Map<String, Object> valoresMap;
    @Value("#{${valor.valoresMap}.product}")
    private String product;
    @Value("#{${valor.valoresMap}.description}")
    private String description;
    @Value("#{${valor.valoresMap}.price}")
    private Long price;
    @Value("${valor.listaDeValores}")
    // private String[] listaDeValoreses
    private List<String> listaDeValores; // Como lista, resultado e JSON es el mismo
    // La lista es más manipulable
    @Value("#{'${valor.listaDeValores}'.toUpperCase().split(',')}")
    private List<String> listaDeValorestoUpperCase;
    @Value("#{'${valor.listaDeValores}'}")
    private String listaDeValoresString;


    // Configurado en WebAppApplication
    // Variables en values1.properties
    @Value("${values1.variable1}")
    private String variable1;
    @Value("${values1.variable2}")
    private String variable2;
    @Value("${values1.variable3}")
    private String variable3;
    @Value("${values1.variable4}")
    private String variable4;

    // Configurado en WebAppApplication
    // Variables en values2.properties
    @Value("${values2.varia1}")
    private String varia1;
    @Value("${values2.varia2}")
    private String varia2;
    @Value("${values2.varia3}")
    private String varia3;
    @Value("${values2.varia4}")
    private String varia4;

    // Configurado en ValuesConfig
    // Puede tomar cualquier nombre pero debe estar en com.ccz.curso.springboot
    // Variables en values3.properties
    @Value("${values3.variab1}")
    private String variab1;
    @Value("${values3.variab2}")
    private String variab2;
    @Value("${values3.variab3}")
    private String variab3;
    @Value("${values3.variab4}")
    private String variab4;

    // Configurado en ValuesConfig
    // Puede tomar cualquier nombre pero debe estar en com.ccz.curso.springboot
    // Variables en values4.properties
    @Value("${values4.variabl1}")
    private String variabl1;
    @Value("${values4.variabl2}")
    private String variabl2;
    @Value("${values4.variabl3}")
    private String variabl3;
    @Value("${values4.variabl4}")
    private String variabl4;

    @GetMapping("/values")
    // El archivo application.properties src/main/resources
    // Es donde se ingresaron los valores de cada variable
    // dato.messagedos lo inyectamos como argumento como @Value
    // Cuando se trata de archivos properties es mejor no utilizar acentos o ñ
    public Map<String, Object> values(@Value("${dato.othermessage}") String othermessage) {

        Map<String, Object> json = new HashMap<>();
        json.put("username", username);
        json.put("code", code);
        json.put("message", message);
        json.put("othermessage", othermessage);
        json.put("listOfValues", listOfValues);

        return json;
    }

    @GetMapping("/valuesdos")
    // El archivo values.properties debe estar en la carpeta src/main/resources
    // Y debe configurarse en WebAppApplication @PropertySource("classpath:values.properties")
    public Map<String, Object> valuesdos(@Value("${valor.otromensaje}") String otromensaje,
                                         @Value("#{'${valor.otromensaje}'.toUpperCase()}") String otromensaje1) {

        Map<String, Object> json = new HashMap<>();
        json.put("nombre", nombre);
        json.put("codigo", codigo);
        json.put("mensaje", mensaje);
        json.put("othermessagedos", otromensaje);
        json.put("othermessage1", otromensaje1);
        json.put("valoresMap", valoresMap);
        json.put("product", product);
        json.put("description", description);
        json.put("price", price);
        json.put("listOfValuesdos", listaDeValores);
        json.put("listaDeValorestoUpperCase", listaDeValorestoUpperCase);
        json.put("listaDeValoresString", listaDeValoresString);

        return json;
    }

    @GetMapping("/values1")
    // http://localhost:8080/api/var/values1
    public Map<String, Object> values1(@Value("${values1.variable5}") String[] variable5) {

        Map<String, Object> json = new HashMap<>();
        json.put("variable1", variable1);
        json.put("variable2", variable2);
        json.put("variable3", variable3);
        json.put("variable4", variable4);
        json.put("variable5", variable5);

        return json;
    }

    @GetMapping("/values2")
    // http://localhost:8080/api/var/values2
    public Map<String, Object> values2(@Value("${values2.varia5}") List<String> varia5) {
        // public Map<String, Object> values2(@Value("${values2.varia5}") String[] varia5) {
        // Mismo resultado

        Map<String, Object> json = new HashMap<>();
        json.put("varia1", varia1);
        json.put("varia2", varia2);
        json.put("varia3", varia3);
        json.put("varia4", varia4);
        json.put("varia5", varia5);

        return json;
    }

    @GetMapping("/values3")
    // http://localhost:8080/api/var/values3
    public Map<String, Object> values3(@Value("${values3.variab5}") String[] variab5,
                                       @Value("${values3.variab5}") String[] variab6,
                                       @Value("#{'${valor.listaDeValores}'.toUpperCase().split(',')}") String[] variab7,
                                       @Value("#{'${valor.listaDeValores}'}") String variab8) {

        Map<String, Object> json = new HashMap<>();
        json.put("variab1", variab1);
        json.put("variab2", variab2);
        json.put("variab3", variab3);
        json.put("variab4", variab4);
        json.put("variab5", variab5);
        json.put("variab6", variab6);
        json.put("variab7", variab7);
        json.put("variab8", variab8);

        return json;
    }

    @GetMapping("/values4")
    // http://localhost:8080/api/var/values4
    public Map<String, Object> values4(@Value("${values4.variabl5}") String[] variabl5) {

        Map<String, Object> json = new HashMap<>();
        json.put("variabl1", variabl1);
        json.put("variabl2", variabl2);
        json.put("variabl3", variabl3);
        json.put("variabl4", variabl4);
        json.put("variabl5", variabl5);

        return json;
    }
}

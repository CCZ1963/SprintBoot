package com.ccz.curso.springboot.controller;

import com.ccz.curso.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller // Presenta vistas HTML
public class UserListController {

    @GetMapping("/list") // http://localhost:8080/list
    public String list(ModelMap model) { // Con ModelMap pasamos información

        User user1 = new User("Ricardo", "Pantoja", "rpantoja@email.com");
        User user2 = new User("Daniel", "Carrasco", "danycarrasco@email.com");
        User user3 = new User("Julia", "Juarez", "jjuarez@email.com");
        User user4 = new User("Luisa", "Abanto", "luabanto@email.com");

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        model.addAttribute("title", "Listado de Usuarios");
        model.addAttribute("users", users);
        // Llama a la pag. web de ~/templates/list_user.html
        return "list_user"; // Mismo nombre que la página web que se va a llamar, debe existir
    }

    @GetMapping("/list2") // http://localhost:8080/list2
    public String list2(ModelMap model) { // Con Model pasamos información

        List<User> users = Arrays.asList(new User("Tito", "Navarro", "navarrot@email.com"),
                new User("Iris", "Fernández"),
                new User("Teresa", "Bueno", "tebueno@email.com"),
                new User("Stefan", "Kross", "skross@email.com"));

        model.addAttribute("title", "Listado de Usuarios");
        model.addAttribute("users", users);
        // Llama a la pag. web de ~/templates/list_user.html
        return "list_user"; // Mismo nombre que la página web que se va a llamar, debe existir
    }

    @GetMapping("/list3") // http://localhost:8080/list3
    public String list3(ModelMap model) { // Con Model pasamos información

        model.addAttribute("title", "Listado de Usuarios");
        // Los user los envía a través del método enviarLista
        // Llama a la pag. web de ~/templates/list_user.html
        return "list_user"; // Mismo nombre que la página web que se va a llamar, debe existir
    }

    @ModelAttribute("users")
    public List<User> enviarLista(){
        List<User> users = Arrays.asList(new User("Sara", "mendoza", "saramendoza@email.com"),
                new User("Alicia", "Vivanco"),
                new User("César", "Palacios", "cpalacios@email.com"),
                new User("Mirtha", "Juliaca", "juliacam@email.com"));
        return users;
    }

}

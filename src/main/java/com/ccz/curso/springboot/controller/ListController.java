package com.ccz.curso.springboot.controller;

import com.ccz.curso.springboot.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api2")
public class ListController {

   @GetMapping("/list")
   public List<User> list(){

       User user1 = new User("José", "Calamaro");
       User user2 = new User("Daniel", "Fuenzalida");
       User user3 = new User("Julia", "Zamarona");
       User user4 = new User("Luisa", "Abanto");

       List<User> users = new ArrayList<>();
       users.add(user1);
       users.add(user2);
       users.add(user3);
       users.add(user4);

       return users;
   }

    @GetMapping("/list1")
    public List<User> Arraylist(){

        User user1 = new User("José", "Calamaro");
        User user2 = new User("Daniel", "Fuenzalida");
        User user3 = new User("Julia", "Zamarona");
        User user4 = new User("Luisa", "Abanto");
        User user5 = new User("Federico", "Gamboa");

        List<User> users = Arrays.asList(user1, user2, user3, user4, user5);

        return users;
    }

}

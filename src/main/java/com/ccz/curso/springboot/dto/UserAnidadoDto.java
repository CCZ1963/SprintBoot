package com.ccz.curso.springboot.dto;

import com.ccz.curso.springboot.model.User;

public class UserAnidadoDto {

    private String title;
    private User user;
    // Con user va a tener un objeto anidado
    // Si colocamos name y lastname como variables de UserDto no sería anidado

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public User getUser() { return user; }

    public void setUser(User user) { this.user = user; }

}

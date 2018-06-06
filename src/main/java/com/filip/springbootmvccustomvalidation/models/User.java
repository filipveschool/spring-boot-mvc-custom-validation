package com.filip.springbootmvccustomvalidation.models;

import com.filip.springbootmvccustomvalidation.validation.interfaces.UniqueLogin;

import java.util.Objects;

public class User {

    @UniqueLogin
    private String login;
    private String password;

    private User() {
        // no-arg Jackson constructor
    }

    public User(String login, String password) {
        Objects.requireNonNull(login);
        Objects.requireNonNull(password);
        this.login = login;
        this.password = password;
    }
    // getters omitted


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

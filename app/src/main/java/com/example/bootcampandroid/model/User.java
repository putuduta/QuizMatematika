package com.example.bootcampandroid.model;

import java.io.Serializable;

public class User implements Serializable {
    private String Username;
    private String password;

    //alt+insert getter setter

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        Username = username;
    }
}

package com.example.bootcampandroid.model;

import java.io.Serializable;

public class User implements Serializable {
    private String Username;
    private Integer Score;

    public Integer getScore() {
        return Score;
    }

    public void setScore(Integer score) {
        Score = score;
    }
    //alt+insert getter setter

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }
}

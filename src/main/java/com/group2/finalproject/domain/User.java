package com.group2.finalproject.domain;

public class User {
    private String email;
    private int id;
    private String password;

    public User(){}
    
    public User(String email, int id, String password) {
        this.email = email;
        this.id = id;
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}

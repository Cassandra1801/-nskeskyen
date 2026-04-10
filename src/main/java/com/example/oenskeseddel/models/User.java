package com.example.oenskeseddel.models;

public class User {

    private String username;
    private String mail;
    private String name;
    private String password;

    public User(){}


    public User(String username, String mail, String name, String password){
        this.username = username;
        this.mail = mail;
        this.name = name;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getMail() {
        return mail;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }



    public void setUsername(String username) {
        this.username = username;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

package com.example.tests;

public class User {

    private String email;

    private String login;

    public User(String email, String login) {
        this.email = email;
        this.login = login;
    }

    public User() {
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
            return true;
        } else {
            return false;
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}

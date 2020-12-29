package com.abnedlab.forms;

import javax.ws.rs.FormParam;

import com.abnedlab.entities.User;

public class UserForm {

    @FormParam("name")
    private String name;

    @FormParam("lastname")
    private String lastname;

    @FormParam("email")
    private String email;

    @FormParam("password")
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User user(User user) {
        if (user == null) {
            user = new User();
        }
        if (name != null) {
            user.setName(name);
        }
        if (lastname != null) {
            user.setLastname(lastname);
        }
        if (password != null) {
            user.setPassword(password);
        }
        if (email != null) {
            user.setEmail(email);
        }
        return user;
    }
}

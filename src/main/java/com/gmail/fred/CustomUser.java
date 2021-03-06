package com.gmail.fred;

import javax.persistence.*;

@Entity
public class CustomUser {
    @Id
    @GeneratedValue
    private long id;

    private String login;
    private String password;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    private String email;
    private String phone;
    private  String comment;

    public CustomUser(String login, String password, UserRole role) {
        this.login = login;
        this.password = password;
        this.role = role;

    }

    public CustomUser(String login, String password, UserRole role, String email, String phone,String comment) {
        this.login = login;
        this.password = password;
        this.role = role;
        this.email = email;
        this.phone = phone;
        this.comment=comment;
    }

    public CustomUser() {}

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.phone = comment;
    }
}

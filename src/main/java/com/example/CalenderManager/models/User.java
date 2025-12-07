package com.example.CalenderManager.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user2")
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
//    @Column(name = "mail", unique = true)
//    private String mail;
    @Column(name = "roles")
    private String roles;

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

//    public String getMail() {
//        return mail;
//    }

    public String getRoles() {
        return roles;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public void setMail(String mail) {
//        this.mail = mail;
//    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}

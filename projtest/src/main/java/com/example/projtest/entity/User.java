package com.example.projtest.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    private String username;

    private String password;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }


}

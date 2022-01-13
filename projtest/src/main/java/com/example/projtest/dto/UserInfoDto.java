package com.example.projtest.dto;

import com.example.projtest.entity.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
@Setter
public class UserInfoDto {
    private String email;
    private String password;

    private String auth;


    public UserInfoDto toEntity() {
        return new UserInfoDto(email, password, auth);
    }
}
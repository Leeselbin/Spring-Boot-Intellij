package com.example.projtest.controller;

import com.example.projtest.dto.ArticleForm;
import com.example.projtest.entity.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class MemberController {

    @GetMapping("/member/membernew")
    public String newmember(){

        return "member/membernew";
    }
}

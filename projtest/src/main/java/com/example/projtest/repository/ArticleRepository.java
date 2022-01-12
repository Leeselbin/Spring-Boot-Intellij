package com.example.projtest.repository;


import com.example.projtest.entity.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ArticleRepository extends CrudRepository<Article, Long> {    //CrudRepositoy< 관리대상엔티티, 대표값타입>

    @Override
    ArrayList<Article> findAll();
}

package com.example.projtest.entity;

import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor  //디폴트 생성자를 추가
@Entity // DB가 해당 객체를 인식 가능! (해당클래스로 테이블을 만든다)
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   // DB가 id를 자동 생성 어노테이션!
    private Long id;   // 대표값

    @Column
    private String title;
    @Column
    private String content;


    public void patch(Article article) {
        if (article.title != null)
            this.title = article.title;
        if (article.content != null)
            this.content = article.content;
    }
}
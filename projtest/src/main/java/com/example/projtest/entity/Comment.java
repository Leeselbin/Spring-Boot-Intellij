package com.example.projtest.entity;

import com.example.projtest.dto.CommentDto;
import lombok.*;


import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne // 해당 댓글 엔티티 여러개가, 하나의 Article에 연관된다.
    @JoinColumn(name = "article_id") // "article_id" 컬럼에 Aricle의 대표
    private Article article;

    @Column
    private String nickname;

    @Column
    private String body;


    public static Comment createComent(CommentDto dto, Article article) {
        // 예외 처리
        if (dto.getId() != null)
            throw new IllegalArgumentException("댓글 생성실패 id가 없다");
        if (dto.getArticleId() != article.getId())
            throw new IllegalArgumentException("댓글 생성실패 id가 잘못되었다.");

        // 엔티티 생성 및 반환
        return new Comment(
                dto.getId(),
                article,
                dto.getNickname(),
                dto.getBody()
        );
    }

    public void patch(CommentDto dto) {
        // 예외 발생
        if (this.id != dto.getId())
            throw new IllegalArgumentException("댓글 수정 실패! 잘못된id가 입력되었다.");

        // 객체를 갱신
        if (dto.getNickname() != null)
            this.nickname = dto.getNickname();

        if (dto.getBody() != null)
            this.body = dto.getBody();
    }
}

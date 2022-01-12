package com.example.projtest.repository;

import com.example.projtest.entity.Article;
import com.example.projtest.entity.Comment;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest // JPA와 연동한 테스트!
class CommentRepositoryTest {

//    @Autowired CommentRepository commentRepository;
//
//    @Test
//    @DisplayName("특정 게시글의 모든 댓글 조회")
//    void findByArticleId() {
//        /* Case 1: 4번 게시글의 모든 댓글 조회 */
//        {
//            // 입력 데이터 준비
//            Long articleId = 4L;
//
//            // 실제 수행
//            List<Comment> comments = commentRepository.findByArticleId(articleId);
//            // 예상하기
//            Article article = new Article(4L, "당신의 인생여오하는", "댓글ㄱㄱ");
//            Comment a = new Comment(1L, article, "park", "어쩌라고");
//            Comment b = new Comment(2L, article, "kim", "어쩔티비");
//            Comment c = new Comment(3L, article, "lee", "어쩔어쩔");
//            List <Comment> expected = Arrays.asList(a,b,c);
//
//            // 검증
//            assertEquals(expected.toString(), comments.toString(), "4번 글의 모든 댓글을 출력");
//        }
//
//        /* Case 2: 1번 게시글의 모든 댓글 조회 */
//        {
//            // 입력 데이터 준비
//            Long articleId = 1L;
//
//            // 실제 수행
//            List<Comment> comments = commentRepository.findByArticleId(articleId);
//
//            // 예상하기
//            Article article = new Article(1L, "가가가", "1111");
//            List <Comment> expected = Arrays.asList();
//
//            // 검증
//            assertEquals(expected.toString(), comments.toString(), "1번 글은 댓글이 없음");
//        }
//
//    }
//
//    @Test
//    @DisplayName("특정 닉네임의 모든 댓글 조회")
//    void findByNickname() {
//        /* Case 1: "Park"의 모든 댓글 조회 */
//        {
//            // 입력 데이터 준비
//            String nickname = "park";
//
//            // 실제 수행
//
//            List<Comment> comments = commentRepository.findByNickname(nickname);
//
//            // 예상하기
//            Comment a = new Comment(1L, new Article(4L, "당신의 인생여오하는", "댓글ㄱㄱ"), nickname, "어쩌라고");
//            Comment b = new Comment(4L, new Article(5L, "췸,는?", "댓글ㄱㄱㄱ"), nickname, "어쩌라고");
//            Comment c = new Comment(7L, new Article(6L, "당신의 소울푸드는", "댓글ㄱㄱㄱㄱ"), nickname, "어쩌라고");
//            List <Comment> expected = Arrays.asList(a,b,c);
//
//            // 검증
//            assertEquals(expected.toString(), comments.toString(), "park의 모든댓글 출력");
//        }
//    }
}
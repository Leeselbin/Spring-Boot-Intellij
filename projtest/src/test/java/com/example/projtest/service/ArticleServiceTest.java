package com.example.projtest.service;

import com.example.projtest.dto.ArticleForm;
import com.example.projtest.entity.Article;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest  // 해당 클래스는 스프링부트와 연동되어 테스팅된다.
class ArticleServiceTest {
//
//    @Autowired ArticleService articleService;
//
//    @Test
//    void index() {
//        // 예상
//        Article a = new Article(1L,"가가가", "1111");
//        Article b = new Article(2L,"나나나", "2222");
//        Article c = new Article(3L,"다다다", "3333");
//        List<Article>expected = new ArrayList<Article>(Arrays.asList(a,b, c));
//
//        // 실제
//        List<Article> articles =  articleService.index();
//
//        // 비교
//        assertEquals(expected.toString(), articles.toString());
//    }
//
//    @Test
//    void show_성공___존재하는_id_입력() {
//        // 예상
//        Long id = 1L;
//        Article expected = new Article(id, "가가가", "1111");
//        // 실제
//        Article article = articleService.show(id);
//
//        //비교
//        assertEquals(expected.toString(), article.toString());
//    }
//
//    @Test
//    void show_실패___존재하지않는아이디_입력() {
//        // 예상
//        Long id = -1L;
//        Article expected = null;
//        // 실제
//        Article article = articleService.show(id);
//
//        //비교
//        assertEquals(expected, article);
//
//    }
//
//    @Test
//    @Transactional
//    void create_성공___title과__content만있는___dto() {
//        // 예상
//        String title = "라라라라";
//        String content = "4444";
//        ArticleForm dto = new ArticleForm(null, title, content);
//        Article expected = new Article(4L, title, content);
//        // 실제
//        Article article = articleService.create(dto);
//
//        //비교
//        assertEquals(expected.toString(), article.toString());
//    }
//
//    @Test
//    @Transactional
//    void create_실패____id가포함된_dto_입력() {
//        // 예상
//        String title = "라라라라";
//        String content = "4444";
//        ArticleForm dto = new ArticleForm(3L, title, content);
//        Article expected = null;
//
//        // 실제
//        Article article = articleService.create(dto);
//
//        //비교
//        assertEquals(expected, article);
//
//    }
//
//    @Test
//    @Transactional
//    void update성공___존재하는_id와_title_content가__있는_dto_입력() {
//        // 예상
//        String title = "라라라라";
//        String content = "4444";
//        Long id = 3L;
//        ArticleForm dto = new ArticleForm(id, title, content);
//        Article expected = new Article(id, title, content);
//
//        // 실제
//        Article article = articleService.update(id, dto);
//
//        //비교
//        assertEquals(expected.toString(), article.toString());
//    }
//
//    @Test
//    @Transactional
//    void update실패____id만_있는_dto_입력() {
//        // 예상
//        String title = null;
//        String content = null;
//        Long id = 3L;
//        ArticleForm dto = new ArticleForm(id, title, content);
//        Article expected = new Article(id, title, content);
//
//        // 실제
//        Article article = articleService.update(id, dto);
//
//        //비교
//        assertEquals(expected, article);
//    }
}
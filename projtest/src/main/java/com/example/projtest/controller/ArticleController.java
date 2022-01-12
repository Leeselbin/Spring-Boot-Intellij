package com.example.projtest.controller;

import com.example.projtest.dto.ArticleForm;
import com.example.projtest.dto.CommentDto;
import com.example.projtest.entity.Article;
import com.example.projtest.repository.ArticleRepository;
import com.example.projtest.service.CommentService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.swing.text.html.Option;
import java.util.List;

@Slf4j
@Controller
public class ArticleController {

    @Autowired //스프링 부트가 미리 생성해놓은 객체를 가져다가 자동 연결!
    private ArticleRepository articleRepository;

    @Autowired
    private CommentService commentService;

    @GetMapping("/articles/new")
    public String newArticleFrom() {
        return "articles/new";
    }

    // 생성
    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){
        log.info(form.toString());

        // 1. Dto를 변환 ! Entity!
        Article article = form.toEntity();
        log.info(article.toString());

        // 2. Repository에게 Entity를 DB안에 저장하게 함!
        Article saved = articleRepository.save(article);
        log.info(saved.toString());
        return "redirect:/articles/" + saved.getId();
    }

    //id조회
    @GetMapping("/articles/{id}")
    public String show(@PathVariable Long id, Model model){
        log.info("id = " + id);

        // 1: ID로 데이터를 가져옴
        Article articleEntity = articleRepository.findById(id).orElse(null); // 해당아이디값이 없다면 null 반환
        List<CommentDto> commentDtos = commentService.comments(id); //댓글 목록 dto가져온다

        // 2: 가져온 데이터를 모델에 등록!
        model.addAttribute("article", articleEntity);
        model.addAttribute("commentDtos",commentDtos);

        // 3: 보여줄 페이지를 설정
        return "articles/show";
    }

    //리스트 전체보기 index.mustache
    @GetMapping("/articles")
    public String index(Model model){
        // 1: 모든 Article을 가져온다.
        List<Article> articleEntityList = articleRepository.findAll();

        // 2: 가져온 Article 묶음을 뷰로 전달
        model.addAttribute("articleList",articleEntityList);

        // 3: 뷰페이지 설정
        return "articles/index";  //articles/index.mustache
    }

    // 수정하기
    @GetMapping("/articles/{id}/edit")
    public String edit(@PathVariable Long id, Model model) {
        // 수정할 데이터를 가져오기!
        Article articleEntity = articleRepository.findById(id).orElse(null);

        // 모델에 데이터 등록
        model.addAttribute("article", articleEntity);

        // 뷰 페이지 설정
        return "articles/edit";
    }

    @PostMapping("/articles/update")
    public String update(ArticleForm form) {
        log.info(form.toString());

        // 1: DTO를 엔티티로 변환한다!
        Article articleEntity = form.toEntity();
        log.info(articleEntity.toString());

        // 2: 엔티티를 DB로 저장한다!
        // 2-1: DB에서 기존 데이터를 가져온다!
        Article target = articleRepository.findById(articleEntity.getId()).orElse(null);

        // 2-2: 기존 데이터에 값을 갱신한다.
        if(target != null){
            articleRepository.save(articleEntity);  //엔티티가 db로 갱신!
        }
        // 3: 수정 결과 페이지로 리다이렉트 한다!
        return "redirect:/articles/" + articleEntity.getId();
    }

    @GetMapping("/articles/{id}/delete")
    public String delete(@PathVariable Long id, RedirectAttributes rttr) {
        log.info("삭제 요청이 들어왔다.");

        // 1: 삭제 대상을 가져온다
        Article target = articleRepository.findById(id).orElse(null);
        log.info(target.toString());

        // 2: 그대상을 삭제 한다!
        if(target != null){
            articleRepository.delete(target);
            rttr.addFlashAttribute("msg", "삭제가 완료 되었습니다.");
        }


        // 3: 결과 페이지로 리다이렉트 한다.
        return "redirect:/articles";
    }
}

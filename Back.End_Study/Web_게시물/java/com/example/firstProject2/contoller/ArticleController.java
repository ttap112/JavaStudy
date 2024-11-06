package com.example.firstProject2.contoller;

import com.example.firstProject2.dto.ArticleForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    @GetMapping("/article/new")
    public String newArticle() {
        return "article/new";
    }

    @PostMapping("/article/create")
    public String createArticle(ArticleForm form) {
        System.out.println(form.toString());
        return "article/create";
    }
}

package com.gigsoft.restservice.controller;

import com.gigsoft.restservice.model.Article;
import com.gigsoft.restservice.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/board")
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/list")
    String list(Model model) {
        List<Article> articleList = articleRepository.findAll();
        model.addAttribute("articleList", articleList);
        return "board/list";
    }
}

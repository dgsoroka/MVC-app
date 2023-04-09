package com.web.webapp.controllers;

import com.web.webapp.models.Article;
import com.web.webapp.repo.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ArticlesController {

    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/articles")
    public String articlesMain(Model model){
        Iterable<Article> articles = articleRepository.findAll();
        model.addAttribute("articles", articles);
        return "articles-main";
    }

    @GetMapping("/articles/add")
    public String articlesAdd(Model model){
        return "articles-add";
    }

    @PostMapping("/articles/add")
    public String articlesPostAdd(@RequestParam String title,
                                  @RequestParam String anons,
                                  @RequestParam String fullText,
                                  Model model){
        Article article = new Article(title, anons, fullText);
        articleRepository.save(article);
        return "redirect:/articles";
    }
}

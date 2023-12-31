package org.saveursdo.server.controller;

import org.saveursdo.server.model.Article;
import org.saveursdo.server.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {

    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/articles")
    public Iterable<Article> getArticles() {
        return articleService.getArticles();
    }

}

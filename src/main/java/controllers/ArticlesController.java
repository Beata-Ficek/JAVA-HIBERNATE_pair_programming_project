package controllers;

import db.DBHelper;
import models.Article;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;

public class ArticlesController {
    public ArticlesController(){
        this.setupEndPoints();
        }

        private void setupEndPoints(){

        get("/articles", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            List<Article> articles = DBHelper.getAll(Article.class);
            model.put("articles", articles);
            model.put("template", "templates/articles/index.vtl");
            return new ModelAndView(model, "templates/layout.vtl");
        }, new VelocityTemplateEngine());
        }
    }



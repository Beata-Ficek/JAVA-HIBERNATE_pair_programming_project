package controllers;

import db.DBArticle;
import db.DBHelper;
import models.Article;
import models.Journalist;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.modelAndView;
import static spark.Spark.post;

public class JournalistController{
    public JournalistController(){
        this.setupEndPoints();
    }

    private void setupEndPoints() {

        get("/journalists", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            List<Journalist> journalists = DBHelper.getAll(Journalist.class);

            model.put("journalists", journalists);
            model.put("template", "templates/journalists/index.vtl");
            return new ModelAndView(model, "templates/layout.vtl");

        }, new VelocityTemplateEngine());

    }
    }
package controllers;

import db.DBArticle;
import db.DBHelper;
import models.Article;
import models.Journalist;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.time.LocalDate;
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

        // INDEX = List all Journalists
        get("/journalists", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            List<Journalist> journalists = DBHelper.getAll(Journalist.class);

            model.put("journalists", journalists);
            model.put("template", "templates/journalists/index.vtl");
            return new ModelAndView(model, "templates/layout.vtl");

        }, new VelocityTemplateEngine());

        // NEW = GET A FORM TO ENTER A NEW
        get("/journalists/new", (req, res) -> {
           Map<String, Object> model = new HashMap<>();
           model.put("template", "templates/journalists/new.vtl");
           return new ModelAndView(model, "templates/layout.vtl");
        }, new VelocityTemplateEngine());


        // CREATE = Save new details to DB
        post ("/journalists", (req, res)->{
            String name = req.queryParams("name");
            String startDateString = req.queryParams("startDate");
            int yearsOfService = Integer.parseInt(req.queryParams("yearsOfService"));
            Journalist journalist = new Journalist(name, LocalDate.parse(startDateString), yearsOfService);
            DBHelper.save(journalist);
            res.redirect("/journalists");
            return null;
        }, new VelocityTemplateEngine());

    }

}
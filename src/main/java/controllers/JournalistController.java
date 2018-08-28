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


        // SHOW = Show a specific journalist
        get("/journalists/:id", (req, res) -> {
            String strId = req.params(":id");
            int intId = Integer.parseInt(strId);
            Journalist journalist = DBHelper.find(Journalist.class, intId);
            Map<String, Object> model = new HashMap<>();
            model.put("journalist", journalist);
            model.put("template", "templates/journalists/show.vtl");

            return new ModelAndView(model, "templates/layout.vtl");
        }, new VelocityTemplateEngine());

        // DELETE = Remove a specific journalist

        post("/journalists/:id/delete", (req, res)->{
            int id = Integer.parseInt(req.params(":id"));
            Journalist journalist = DBHelper.find(Journalist.class, id);
            DBHelper.delete(journalist);
            res.redirect("/journalists");
            return new ModelAndView(new HashMap<String, Object>(), "templates/layout.vtl");
        }, new VelocityTemplateEngine());


        // EDIT = Update a pre-existing journalist
        get("/journalists/:id/edit", (req, res) -> {
            Integer id = Integer.parseInt(req.params(":id"));
            Journalist journalist = DBHelper.find(Journalist.class, id);

            Map<String, Object> model = new HashMap<>();

            model.put("journalist", journalist);
            model.put("template", "templates/journalists/edit.vtl");

            return new ModelAndView(model, "templates/layout.vtl");
        }, new VelocityTemplateEngine());

        // UPDATE = Save the updated journalist to db
        post("/journalists/:id", (req, res) -> {
            Integer Id = Integer.parseInt(req.params(":id"));
            Journalist journalist = DBHelper.find(Journalist.class, Id);

            String name = req.queryParams("name");
            String startDateString = req.queryParams("startDate");
            LocalDate startDate = LocalDate.parse(startDateString);
            int yearsOfService = Integer.parseInt(req.queryParams("yearsOfService"));


            journalist.setName(name);
            journalist.setStartDate(startDate);
            journalist.setYearsOfService(yearsOfService);
            DBHelper.update(journalist);

            res.redirect("/journalists/"+Id);
            return new ModelAndView(new HashMap<String, Object>(), "templates/layout.vtl");
        }, new VelocityTemplateEngine());

    }

}
package db;

import models.*;

import java.util.Date;

public class Seeds {
    public static void seedData() {

        DBHelper.deleteAll(Article.class);
        DBHelper.deleteAll(Journalist.class);
        DBHelper.deleteAll(Editor.class);



        Editor mark = new Editor ("Mark Ditzel", new Date(2017, 07, 25), 1);
        DBHelper.save(mark);
        Editor beata = new Editor ("Beata Ficek", new Date(2017, 02, 11), 2);
        DBHelper.save(beata);

        Journalist vicky = new Journalist ("Victoria Jackson", new Date(2010, 07, 12), 8);
        DBHelper.save(vicky);
        Journalist diggory = new Journalist ("Diggory Phillbrow", new Date (2014, 11,02), 4);
        DBHelper.save(diggory);

        Category techNews = new Category("Tech News");
        DBHelper.save(techNews);
        Category interviews = new Category("Interviews");
        DBHelper.save(interviews);

        Date dateOfAppArticle1 = new Date(2018, 06,11);
        Date dateOfSubArticle1 = new Date(2018, 06, 9);

        Article technews1 = new Article(ArticleFormat.FEATURE, "CodeBase's VR revolution",
                "Chopping-fruit-game has met its' match",
                mark, diggory, techNews, "Hello");
        DBHelper.save(technews1);

        Article technews2 = new Article(ArticleFormat.COLUMN, "Codeclan",
                "Welcome to Codeclan",
                mark, diggory, techNews, "Hello");
        DBHelper.save(technews2);


    }

}

package db;

import models.Article;
import models.Category;
import models.Journalist;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBArticle {
    private static Transaction transaction;
    private static Session session;


    public static List<Article> searchArticlesByTitle(String matchString) {
        session = HibernateUtil.getSessionFactory().openSession();
        Criteria query = session.createCriteria(Article.class);
        List<Article> results = null;
        try {
            Criteria cr = session.createCriteria(Article.class);
            cr.add(Restrictions.like("headline", matchString + "%", MatchMode.ANYWHERE));
            results = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

    public static List<Article> orderByDate() {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Article> articles = null;
        try {
            Criteria cr = session.createCriteria(Article.class);
            cr.addOrder(Order.desc("dateOfSubmission"));
            articles = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return articles;
    }

    public static List<Article> findArticleByCategory(Category category) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Article> results = null;
        try {
            Criteria cr = session.createCriteria(Article.class);
            cr.add(Restrictions.eq("category", category));
            results = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;

    }

    public static List<Article> findArticleByJournalist(Journalist journalist) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Article> results = null;
        try {
            Criteria cr = session.createCriteria(Article.class);
            cr.add(Restrictions.eq("journalist", journalist));
            results = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;

    }


}

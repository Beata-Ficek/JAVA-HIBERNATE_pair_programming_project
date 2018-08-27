package db;

import models.Article;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBArticle
     {
        private static Transaction transaction;
        private static Session session;





        public static List<Article> searchArticlesByTitle(String matchString) {
        session = HibernateUtil.getSessionFactory().openSession();
        Criteria query = session.createCriteria(Article.class);
        List<Article> results = null;
        try{
            Criteria cr = session.createCriteria(Article.class);
            cr.add(Restrictions.like("headline", matchString, MatchMode.ANYWHERE));
            results = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }
}
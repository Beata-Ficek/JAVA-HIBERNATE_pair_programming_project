import models.*;
import org.junit.Before;
import org.junit.Test;


import java.util.Date;

import static org.junit.Assert.assertEquals;

public class CategoryTest {


    Category category1;
    Category category2;
    Article article1;
    Date dateOfApproval;
    Date getDateOfSubmission;
    Editor keith;
    Journalist mark;
    Date date1;


    @Before()
        public void before() {
        category1 = new Category("SciTech");
        category2 = new Category("Interviews");
        dateOfApproval = new Date(2017, 01, 11);
        getDateOfSubmission = new Date (2017, 01, 13);
        date1 = new Date(2017, 06, 11);
        mark = new Journalist("Mark", date1, 1);
        keith = new Editor("Keith", date1, 1);
        article1 = new Article(ArticleFormat.FEATURE,
                "The future is Codeclan",
                "Promising Codeclan graduates to conquer the Tech World",
                keith, mark, category2, "blabla");


    }

    @Test
    public void hasName(){
        assertEquals("SciTech", category1.getName());
    }

    @Test
    public void hasArticles(){
        category2.addArticle(article1);
        assertEquals(1, category2.getArticles().size());
    }



}

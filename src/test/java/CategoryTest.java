import models.*;
import org.junit.Before;
import org.junit.Test;


import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class CategoryTest {


    Category category1;
    Category category2;
    Article article1;
    LocalDate dateOfApproval;
    LocalDate getDateOfSubmission;
    Editor keith;
    Journalist mark;
    LocalDate date1;


    @Before()
        public void before() {
        category1 = new Category("SciTech");
        category2 = new Category("Interviews");
        dateOfApproval = LocalDate.of(2017, 01, 11);
        getDateOfSubmission =  LocalDate.of(2017, 01, 13);
        date1 =  LocalDate.of(2017, 06, 11);
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

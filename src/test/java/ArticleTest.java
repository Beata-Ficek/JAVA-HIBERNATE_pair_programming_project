//import models.*;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.time.LocalDate;
//import java.util.Date;
//
//import static junit.framework.TestCase.assertEquals;
//
//public class ArticleTest {
//
//    LocalDate date1;
//    LocalDate dateOfApproval;
//    LocalDate getDateOfSubmission;
//    Article codeclanArticle;
//    Editor keith;
//    Editor judy;
//    Journalist mark;
//    Journalist riccardo;
//    Category edTech;
//    Category medTech;
//
//    @Before
//    public void before(){
//
//        date1 =  LocalDate.of(2017, 06, 11);
//        dateOfApproval =  LocalDate.of(2017, 01, 11);
//        getDateOfSubmission =  LocalDate.of (2017, 01, 13);
//        mark = new Journalist("Mark", date1, 1);
//        riccardo = new Journalist("Riccardo", date1, 1);
//        keith = new Editor("Keith", date1, 1);
//        judy = new Editor("Judy", date1, 1);
//
//        edTech = new Category("Tech Education");
//        medTech = new Category("Medical Tech");
//
//        codeclanArticle = new Article(ArticleFormat.FEATURE,
//                "The future is Codeclan",
//                "Promising Codeclan graduate to conquer the Tech World",
//                keith, mark, edTech, "Blablabla");
//
//    }
//
//    @Test
//    public void hasNotBeenApproved(){
//        assertEquals(false, codeclanArticle.getApproved());
//    }
//
//    @Test
//    public void canBeApproved(){
//        codeclanArticle.setApproved(true);
//        assertEquals(true, codeclanArticle.getApproved());
//
//    }
//
//    @Test
//    public void hasHeadline(){
//        assertEquals("The future is Codeclan", codeclanArticle.getHeadline());
//    }
//
//    @Test
//    public void canSetHeadline(){
//        codeclanArticle.setHeadline("Tralala");
//        assertEquals("Tralala", codeclanArticle.getHeadline());
//    }
//
//    @Test
//    public void getStrapline(){
//        assertEquals("Promising Codeclan graduate to conquer the Tech World",
//                codeclanArticle.getStrapline());
//    }
//
//    @Test
//    public void setStrapline(){
//        codeclanArticle.setStrapline("LAallala");
//       assertEquals("LAallala", codeclanArticle.getStrapline());
//    }
//
//    @Test
//    public void hasEditor(){
//        assertEquals(keith, codeclanArticle.getEditor());
//    }
//
//    @Test
//    public void hasEditorsname(){
//        assertEquals("Keith", codeclanArticle.getEditor().getName());
//    }
//
//    @Test
//    public void canChangeEditor(){
//        codeclanArticle.setEditor(judy);
//        assertEquals(judy, codeclanArticle.getEditor());
//    }
//
//    @Test
//    public void hasJournalist(){
//        assertEquals(mark, codeclanArticle.getJournalist());
//    }
//
//    @Test
//    public void canChangeJournalist(){
//        codeclanArticle.setJournalist(riccardo);
//        assertEquals(riccardo, codeclanArticle.getJournalist());
//    }
//
//    @Test
//    public void hasCategory(){
//        assertEquals(edTech, codeclanArticle.getCategory());
//    }
//
//    @Test
//    public void canChangeCategory(){
//        codeclanArticle.setCategory(medTech);
//        assertEquals(medTech, codeclanArticle.getCategory());
//
//    }
//
//    @Test
//    public void hasArticleType(){
//        assertEquals(ArticleFormat.FEATURE, codeclanArticle.getArticleFormat());
//    }
//
//    @Test
//    public void canChangeArticleType(){
//        codeclanArticle.setArticleFormat(ArticleFormat.OPED);
//        assertEquals(ArticleFormat.OPED, codeclanArticle.getArticleFormat());
//    }
//
//}

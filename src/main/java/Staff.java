import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Staff {

    private int id;
    private String name;
    private Date startDate;
    private int yearsOfService;
    private List<Article> articles;

    public Staff(){

    }

    public Staff(String name, Date date, int yearsOfService){
        this.name = name;
        this.startDate = startDate;
        this.yearsOfService = yearsOfService;
        this.articles = new ArrayList<Article>();
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }



}

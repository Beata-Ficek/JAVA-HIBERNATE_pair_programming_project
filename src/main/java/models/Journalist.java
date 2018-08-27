package models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name= "journalists")
public class Journalist extends Staff {

    private List<Article> articles;
    public Journalist(){

    }

    public Journalist(String name, Date date, int yearsOfService) {
        super(name, date, yearsOfService);
        this.articles = new ArrayList<>();
    }


    @OneToMany(mappedBy="journalist", fetch = FetchType.EAGER)
    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

}

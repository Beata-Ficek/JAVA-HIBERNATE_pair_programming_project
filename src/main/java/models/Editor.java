package models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name= "editors")
public class Editor extends Staff {

    private List<Article> articles;


    public Editor(){

    }

    public Editor(String name, Date date, int yearsOfService) {
        super(name, date, yearsOfService);
        this.articles = new ArrayList<Article>();
    }


    @OneToMany(mappedBy="editor", fetch = FetchType.LAZY)
    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }



}

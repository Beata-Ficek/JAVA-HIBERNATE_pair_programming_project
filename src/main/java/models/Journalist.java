package models;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name= "journalists")
public class Journalist extends Staff {

    private List<Article> articles;
    public Journalist(){

    }

    public Journalist(String name, LocalDate date, int yearsOfService) {
        super(name, date, yearsOfService);
        this.articles = new ArrayList<>();
    }

    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @OneToMany( mappedBy="journalist", fetch = FetchType.EAGER)
    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}

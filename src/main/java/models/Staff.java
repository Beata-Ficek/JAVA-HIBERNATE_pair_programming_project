package models;

import models.Article;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="staff")
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class Staff {

    private int id;
    private String name;
    private Date startDate;
    private int yearsOfService;
//    private List<Article> articles;

    public Staff(){

    }

    public Staff(String name, Date date, int yearsOfService){
        this.name = name;
        this.startDate = date;
        this.yearsOfService = yearsOfService;
//        this.articles = new ArrayList<Article>();
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "start_date")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Column(name = "years_of_service")
    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

//    @OneToMany(mappedBy="staff", fetch = FetchType.LAZY)
//    public List<Article> getArticles() {
//        return articles;
//    }
//
//    public void setArticles(List<Article> articles) {
//        this.articles = articles;
//    }



}

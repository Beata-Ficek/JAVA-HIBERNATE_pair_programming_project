package models;

import javax.persistence.*;

@Entity
@Table(name = "articles")
public class Article {

    private int id;
    private ArticleFormat articleFormat;
    private String headline;
    private String strapline;
    private Editor editor;
    private Journalist journalist;
    private Category category;
    private boolean approved;
    private String body;

    public Article(){

    }

    public Article(ArticleFormat articleFormat,
                   String headline,
                   String strapline,
                   Editor editor,
                   Journalist journalist,
                   Category category,
                   String body){
        this.articleFormat = articleFormat;
        this.headline = headline;
        this.strapline = strapline;
        this.editor = editor;
        this.journalist = journalist;
        this.category = category;
        this.approved = false;
        this.body = body;

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

    @Column(name = "headline")
    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    @Column(name = "strapline")
    public String getStrapline() {
        return strapline;
    }

    public void setStrapline(String strapline) {
        this.strapline = strapline;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "editor_id", nullable = false)
    public Editor getEditor() {
        return editor;
    }

    public void setEditor(Editor editor) {
        this.editor = editor;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "journalist_id", nullable = false)
    public Journalist getJournalist() {
        return journalist;
    }

    public void setJournalist(Journalist journalist) {
        this.journalist = journalist;
    }

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", nullable = false)
    public Category getCategory() {
        return category;
    }


    public void setCategory(Category category) {
        this.category = category;
    }

    @Column(name = "approved")
    public boolean getApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    @Enumerated(value = EnumType.STRING)
    public ArticleFormat getArticleFormat() {
        return articleFormat;
    }

    public void setArticleFormat(ArticleFormat articleFormat) {
        this.articleFormat = articleFormat;
    }

    @Column(name = "body", length = 1000000)
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}

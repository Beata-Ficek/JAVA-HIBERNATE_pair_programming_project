import java.util.Date;
import java.util.List;
import java.util.Set;

public class Article {

    private int id;
    private ArticleFormat articleFormat;
    private String headline;
    private String strapline;
    private Editor editor;
    private Journalist journalist;
    private Category category;
    private Date dateofApproval;
    private Date dateofSubmission;
    private boolean approved;

    public Article(){

    }

    public Article(ArticleFormat articleFormat,
                   String headline,
                   String strapline,
                   Editor editor,
                   Journalist journalist,
                   Category category,
                   Date dateofApproval,
                   Date dateofSubmission,
                   boolean approved){
        this.articleFormat = articleFormat;
        this.headline = headline;
        this.strapline = strapline;
        this.editor = editor;
        this.journalist = journalist;
        this.category = category;
        this.dateofApproval = dateofApproval;
        this.dateofSubmission = dateofSubmission;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getStrapline() {
        return strapline;
    }

    public void setStrapline(String strapline) {
        this.strapline = strapline;
    }

    public Editor getEditor() {
        return editor;
    }

    public void setEditor(Editor editor) {
        this.editor = editor;
    }

    public Journalist getJournalist() {
        return journalist;
    }

    public void setJournalist(Journalist journalist) {
        this.journalist = journalist;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getDateofApproval() {
        return dateofApproval;
    }

    public void setDateofApproval(Date dateofApproval) {
        this.dateofApproval = dateofApproval;
    }

    public Date getDateofSubmission() {
        return dateofSubmission;
    }

    public void setDateofSubmission(Date dateofSubmission) {
        this.dateofSubmission = dateofSubmission;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public ArticleFormat getArticleFormat() {
        return articleFormat;
    }

    public void setArticleFormat(ArticleFormat articleFormat) {
        this.articleFormat = articleFormat;
    }
}

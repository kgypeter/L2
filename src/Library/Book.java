package Library;

public class Book {
    private String title;
    private String author;
    private String apparitionDate;
    private String language;
    private int pageCount;

    public Book(String title, String author, int pageCount, String apparitionDate, String language){
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.apparitionDate = apparitionDate;
        this.language = language;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount){
        this.pageCount = pageCount;
    }

    public String getApparitionDate() {
        return apparitionDate;
    }

    public void setApparitionDate(String apparition){
        this.apparitionDate = apparition;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language){
        this.language = language;
    }

    public void bookToString() {
        System.out.format("%s written by %s appeared in %s and has %d pages.", this.title, this.author,
                this.apparitionDate, this.pageCount);
    }
}

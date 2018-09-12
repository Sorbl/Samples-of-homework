public class Book {
    private String author;
    private int yearOfProduction;
    private String title;
    private int pageAmount;

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return this.author;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
    public int getYearOfProduction() {
        return this.yearOfProduction;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return this.title;
    }

    public void setPageAmount(int pageAmount) {
        this.pageAmount = pageAmount;    }
    public int getPageAmount() {
        return this.pageAmount;
    }
}

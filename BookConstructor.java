public class BookConstructor  {

    private String author;
    private int yearOfProduction;
    private String title;
    private int pageAmount;

    public BookConstructor (String author, int yearOfProduction, String title, int pageAmount) {
        this.author=author;
        this.yearOfProduction=yearOfProduction;
        this.title=title;
        this.pageAmount=pageAmount;

    }

        public String getAuthor() {
        return this.author;
    }

        public int getYearOfProduction() {
        return this.yearOfProduction;
    }


    public String getTitle() {
        return this.title;
    }


    public int getPageAmount() {
        return this.pageAmount;
    }
}

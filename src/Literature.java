public class Literature extends Books {
    private String authorOfBook;
    private int pages;

    public Literature(String nameOfBook) {
        super(nameOfBook);
    }

    public String getAuthorOfBook() {
        return authorOfBook;
    }

    public void setAuthorOfBook(String authorOfBook) {
        this.authorOfBook = authorOfBook;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void writing(){
        System.out.println("Writing a book...");
    }
    public void collect(){
        System.out.println("Collecting a book...");
    }

    @Override
    public String toString() {
        return "Literature{" +
                "authorOfBook='" + authorOfBook + '\'' +
                ", pages=" + pages +
                ", nameOfBook='" + nameOfBook + '\'' +
                '}';
    }
}

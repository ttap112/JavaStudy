package ArrayList;

public class book {

    private String bookName;


    private String author;



    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getAuthor() {
        return author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    public void showBookInfo() {
        System.out.println(this.bookName+" : "+this.author);
    }

}

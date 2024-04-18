package construct.EX01;

public class Book {
    String title;
    String author;
    int page;

    Book() {
        this("","",0);
    }

    Book(String title, String author) {
        this(title,author,0);
    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public void DisplayInfo() {
        System.out.println("제목 : "+title+" 작가 : "+author+" 페이지 수 : "+page);
    }
}

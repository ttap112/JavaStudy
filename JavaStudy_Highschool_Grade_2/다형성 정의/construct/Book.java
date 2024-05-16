package construct;

public class Book {
    String title;
    String author;
    int page;

    Book(){
        this("", "", 0);
    }

    Book(String title, String author){
        this(title, author, 0);
    }

    Book(String title, String author, int page){
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayinfo(){
        System.out.println("제목:" + title + ", 저자:" + author + ", 페이지:" + page);
    }

    // 패키지 주의사항
    //1. 항상 코드 첫 줄에 패키지 이름을 적어줘야 한다.
}

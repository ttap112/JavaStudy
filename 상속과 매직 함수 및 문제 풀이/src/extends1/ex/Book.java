package extends1.ex;

public class Book extends Item{
    private String Author;
    private String isbn;

    public Book(String name, int price,String Author, String isbn) {
        super(name,price);
        this.Author = Author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("-저자 : "+Author+" isbn : "+isbn);
        System.out.println();
    }
}

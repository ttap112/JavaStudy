package ArrayList;

import java.awt.print.Book;
import java.util.ArrayList;

public class Ex04 {
    public static void main(String[] args) {
        Book b1 = new Book("태백산맥","조정래");

        ArrayList<Book> libary = new ArrayList<>();
        libary.add(new Book("태백산맥", "조정래"));
        libary.add(new Book("데미안","헤르만 헤세"));
        libary.add(new Book("토지","박경리"));
        libary.add(new Book("어린왕자","생택쥐페리"));

        System.out.println(libary.get(2));

        for (int i=0; i<libary.size(); i++) {
            Book book = libary.get(i);

        }
    }
}

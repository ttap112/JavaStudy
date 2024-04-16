package oop.exam;

public class Rectangle {
    public int width;
    public int height;

    void calculateArea() {
        int total = width*height;
        System.out.println("넓이 : "+total);
    }

    void calculatePerimeter() {
        int total = (width*2)+(height*2);
        System.out.println("둘레 길이 : "+total);
    }

    void isSquare() {
        boolean type = false;
        if (width == height) {
            type = true;
            System.out.println("정사각형 여부 : "+type);
        } else {
            System.out.println("정사각형 여부 : "+type);
        }
    }
}

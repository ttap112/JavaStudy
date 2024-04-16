package oop.exam;

import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Rectangle Rec = new Rectangle();

        Rec.width = scan.nextInt();
        Rec.height = scan.nextInt();

        Rec.calculateArea();
        Rec.calculatePerimeter();
        Rec.isSquare();
    }
}

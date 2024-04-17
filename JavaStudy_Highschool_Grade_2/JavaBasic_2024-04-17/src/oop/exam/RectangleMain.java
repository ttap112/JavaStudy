package oop.exam;

import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Rectangle Rec = new Rectangle();

        Rec.width = scan.nextInt();
        Rec.height = scan.nextInt();

        int area = Rec.calculateArea();
        System.out.println("넓이 : "+area);

        int perimeter = Rec.calculatePerimeter();
        System.out.println("둘레 : "+perimeter);

        boolean type = Rec.isSquare();
        System.out.println("정사각형 여부 : "+type);
    }
}

// 은행 계좌를 객체로 설계
// 1 Account 클래스 생성
    // 1 int balance : 잔액
    //  - 입급시 잔액이 증가
    // 2 withdraw(int amount) : 출금 메서드
    //  - 출금식 잔액 감소
    //  - 만약 잔액이 부족하면 잔액 부족을 출력
// 2. AccountMain 클래스 생성 - main 메서드 생성
    // 1 계좌에 10000원 입급
    // 2 계좌에 9000원 출금
    // 3 계좌에서 2000원을 출금 > 잔액 부족 출력
    // 4 잔고를 출력
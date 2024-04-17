package Student_Package;

public class ClassPart5 {
    public static void main(String[] args) {
        // 리팩토링
        // 1. 선언 단일화(배열로 접근)
        // 2. 출력문구를 반복문을 통해 심플하게 변경

        Student[] students = new Student[2];

        students[0] = new Student(); // 배열에 객체 생성
        students[1] = new Student();

        students[0].StName = "홍길동";
        students[0].StAge = 15;
        students[0].StGrade = 90;

        students[1].StName = "장발장";
        students[1].StAge = 16;
        students[1].StGrade = 80;

        for (int i = 0; i< students.length; i++) {
            System.out.println("이름 : "+students[i].StName+" 나이 : "+students[i].StAge+"세"+" 점수 : "+students[i].StGrade+"점");
        }
    }
}

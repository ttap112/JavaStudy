package Student_Package;

public class ClassPart1 {
    public static void main(String[] args) {
        // 학생의 정보를 출력하는데, 각 학생은 이름, 나이, 성적을 가지고 있다
        // 1. 홍길도 15, 90
        // 2. 장발장 60, 80
        // 출력 이름 [이름] 나이 [나이]세 점수 [점수]점
        // 변수를 사용하여 학생 정보를 저정하고, 변수를 사용해서 학생 정보를 출력

        String StudentName1 = "홍길동";
        int StudentAge1 = 15;
        int StudentGrade1 = 90;

        String StudentName2 = "장발장";
        int StudentAge2 = 16;
        int StudentGrade2 = 80;

        System.out.printf("이름 : "+StudentName1+" 나이 : "+StudentAge1+"세"+" 점수 : "+StudentGrade1+"점");
        System.out.printf("이름 : "+StudentName2+" 나이 : "+StudentAge2+"세"+" 점수 : "+StudentGrade2+"점");

        // 위 방식은
        // 학생이 늘어날 때 마다 변수와 출력하는 코드를 추가해야 하는 문제점이 생김
    }
}

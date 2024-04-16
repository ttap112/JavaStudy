package Student_Package;

public class ClassPart3 {
    public static void main(String[] args) {
        Student stu1 = new Student(); // 메모에 학생클래스 생성하여 stu1에 담아줌
        stu1.StName = "홍길동";
        stu1.StAge = 15;
        stu1.StGrade = 90;

        Student stu2 = new Student();
        stu2.StName = "장발장";
        stu2.StAge = 16;
        stu2.StGrade = 80;

        /*
         클래스와 사용자 등의 타입
         타입은 데이터의 종류나 형태를 나타냄
         int는 정수 타입, String은 문자열 타입
         학생(Student)라는 타입을 만들면 좋지 않을까?
         사용자가 직접 정의하는 사용자 정의 타입을 만들려면 설계도가 필요하고, 이 설계도가 클래스
         설계도의 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스터스라 함
         클래스를 통해서 사용자가 원하는 종류의 데이터 타입을 마음껏 정의할 수 있다.
        */

        /*
        참조값을 변수에 보관하는 이유
        객체를 생성하는 new Student() 코드 자체에는 이름이 없음
        이 코드는 단순히 Student 클래스를 기반으로 메모리에
        실제 객체를 만드는 기능만 함
        따라서 생성한 객체에 접근할 방법이 필요함
        객체를 생성할 때 반환되는 참조값(주소)를 알면
        객체에 접근할 수 있음
        따라서 반환되는 참조값(주소)를 저장할 변수가 필요하며
        앞서 Student stu1로 선언한 변수(stu1)에 참조값을
        저장하여 필요할 때 객체에 접근할 수 있음.
         */

        /*
        Student stu1 = new Student();  는 Student 객체를 생성
        Student stu1 = 0x0099ff;       new Student() 결과로 참조값(주소) 반환
        stu1 = 0x0099ff;               stu1 변수에 주소값이 담김
         */



    }
}

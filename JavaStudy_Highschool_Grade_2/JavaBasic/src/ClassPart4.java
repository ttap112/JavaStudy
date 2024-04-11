public class ClassPart4 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.StName = "홍길동";
        stu1.StAge = 15;
        stu1.StGrade = 90;

        Student stu2 = new Student();
        stu2.StName = "장발장";
        stu2.StAge = 16;
        stu2.StGrade = 80;

        Student[] students = new Student[2];
        students[0] = stu1;
        students[1] = stu2;

        //System.out.println("이름 : "+ stu1.StName+" 나이 : "+stu1.StName+"세 "+" 점수 : "+stu1.StGrade+"점");
        // System.out.println("이름 : "+ stu2.StName+" 나이 : "+stu2.StName+"세 "+" 점수 : "+stu2.StGrade+"점");

        System.out.println(students[0].StName);
    }
}
/*
System.out.println(students[0].StName); 배열에 접근을 시작
System.out.println(005[0].StName); [0]를 사용해서 005 배열의 0번 요소에 접근
System.out.println(001.StName); .(dot)을 사용해서 참조값을 객체에 접근
System.out.println("홍길동");

 */
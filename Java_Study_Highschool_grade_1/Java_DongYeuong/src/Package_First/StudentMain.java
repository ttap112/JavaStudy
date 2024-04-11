package Package_First;

import java.util.ArrayList;

public class StudentMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(3,"김회장","여","010-1234-1234"));
        students.add(new Student(3,"이총무","남","010-1234-5678"));
        students.add(new Student(2,"유부장","남","010-5678-5678"));
        students.add(new Student(1,"최신입","여"));

        System.out.println("2023학년도 학생현황");
        for (int i=0; i<students.size(); i++) {
            students.get(i).studentInfo();
        }

        for (int i=0; i<students.size(); i++) {
            students.get(i).upGrade();
        }

        for (int i=0; i<students.size(); i++) {
            if (students.get(i).getGrade()==4) {
                students.remove(i);
                i--;
            }

        }

        System.out.println("");

        System.out.println("2024학년도 학생현황");
        for (int i=0; i<students.size(); i++) {
            students.get(i).studentInfo();
        }





    }

    private static void upGrade() {

    }

    private static void studentInfo() {

    }


}

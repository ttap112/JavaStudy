package Package_First;

import java.lang.reflect.Method;

public class Student {
    private int grade;
    private String name;
    private String gender;
    private String phone;

    public Student(int grade, String name, String gender, String phone) {
        this.grade = grade;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
    }

    public Student(int grade, String name, String gender) {
        this.grade = grade;
        this.name = name;
        this.gender = gender;
    }

    public void setGrade(int grade) {
        this.grade = grade;
        if (grade >=3 || grade < 1 ) {
            System.out.println("현재 입력하신 학년은 없는 학년입니다. \n다시 입력하시오.");
        }
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public void studentInfo() {
        if (phone == null) {
            phone = "없음";
        }
        System.out.println(name+"학생은 "+grade+"학년이며, 성별은 "+gender+", 전화번호는 "+phone+"입니다.");
    }

    public void upGrade() {
        this.grade++;
        }
    }


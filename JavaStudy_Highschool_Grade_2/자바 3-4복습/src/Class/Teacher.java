package Class;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private String subject;
    private int experience;
    private List<Student> students;

    public Teacher(String name, String subject, int experience) {
        this.experience= experience;
        this.name= name;
        this.subject=subject;
        this.students= new ArrayList<>(); // 리스트 초기화 작업
    }
    public void addStudent(Student student) {
        students.add(student);
        student.setTeacher(this); // 학생에게 교사를 할당
    }
    public void showStudents() {
        System.out.print(name + " teacher the following students : ");
        for (Student student : students) {
            System.out.print(student.getName()+" ");
        }
    }
    public void teach() {
        System.out.println(name+" is teaching "+subject);
    }
    public void showInfo() {
        System.out.println("name : "+name+"\nsubject : "+subject+"\nexperience : "+experience);
    }

    // Getter & Setter 추가
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}

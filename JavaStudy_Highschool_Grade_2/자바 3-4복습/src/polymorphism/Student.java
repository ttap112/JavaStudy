package polymorphism;

public class Student implements Person{
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void showInfo() {
        System.out.println(
                "Student Name : " +name
                +"\ngrade : "+grade
                +"\nStudent ID : "+ studentId
                +" Teacher : "+teacher);
    }

    private String name;
    private int grade;
    private String studentId;
    private Teacher teacher;

    public Student(String name, int grade,String studentId) {
        this.name = name;
        this.grade = grade;
        this.studentId = studentId;
    }

    // 교사 생성 getter & setter
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    // studentId가 변경되면 안되기에 Getter만 생성
    public String getStudentId() {
        return studentId;
    }

    // 나머지 필드는 getter & setter 모두 생성
    public int getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void study() {
        System.out.println(name+"is studying.");
    }

}

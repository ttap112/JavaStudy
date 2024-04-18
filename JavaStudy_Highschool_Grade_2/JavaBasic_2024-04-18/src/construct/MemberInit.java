package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    /*
        기본 생성자 - 개발자가 생성자를 만들지 않을 경우에
        자바가 직점 만들어 줌
     */
    public MemberInit() {}

    void InitMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

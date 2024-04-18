package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자를 직접 하나라도 만든 경우에는 더 이상 자바가 기본 생성자를 자동으로 만들어주지 않는다
    // 따라서 기본 생성자가 필요한 경우 직접 작성해야 함

    MemberConstruct() {}

    MemberConstruct(String name, int age) {
        this(name,age,50);
    }

    // 생성자 // 해등 클래스의 접근 제어자를 따라감
    MemberConstruct(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

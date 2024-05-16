package construct;

public class MemberConstruct {

    String name;
    int age;
    int grade;

    // 생성자를 직접 하나라도 만든 경우에는 더 이상 자바가 기본 생상자를 자동으로 만들어주지 않는다
    // 따라서 기본 생성자가 피요한 경우 직접 작성해야한다

    MemberConstruct(){}

    MemberConstruct(String n, int a, int g){
        name = n;
        age = a;
        grade = g;

    }
    MemberConstruct(String n, int a){
        this(n,a,50);

    }
}

package construct;

public class MemberInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        InitMember(member1, "user1", 15, 90);

        MemberInit member2 = new MemberInit();
        InitMember(member2, "user2", 16, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름 : "+ s.name+" 나이 : "+s.age+" 성적 : "+s.grade);
        }

    }
    static void InitMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}

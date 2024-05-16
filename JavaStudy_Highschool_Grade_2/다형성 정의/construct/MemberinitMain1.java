package construct;

public class MemberinitMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        // 메서드 이용한 초기화1

        MemberConstruct member2 = new MemberConstruct("User2", 16, 39);
        // 메서드 이용한 초기화2

        MemberConstruct[] Members = { member1, member2};

        for(MemberConstruct s : Members) {

            System.out.println("name: " + s.name + " age: " + s.age + " grade: " + s.grade);
        }

    }

}


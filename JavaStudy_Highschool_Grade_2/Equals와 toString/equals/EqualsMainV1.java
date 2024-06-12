package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 userV1 = new UserV1("id-100");
        UserV1 userV2 = new UserV1("id-100");

        System.out.println("identity =" + (userV1==userV2));
        System.out.println("identity =" + userV1.equals(userV2));


    }
}

/*
userV1 == userV2
x001 == x002
false

Object.equals() 메서드
public boolean equals(Object obj) {
    return (this == obj);
}

동등성 비교
user.equals(user2)
return (userV1 == userV2)
return (x001 == x002)

즉, Object가 기본적으로 제공하는 equals()는 ==으로 동일성 비교를 제공한다.
 */
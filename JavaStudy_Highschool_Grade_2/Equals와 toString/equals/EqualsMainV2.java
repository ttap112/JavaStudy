package lang.object.equals;

public class EqualsMainV2 {
    public static void main(String[] args) {
        UserV2 userV1 = new UserV2("id-100");
        UserV2 userV2 = new UserV2("id-100");

        System.out.println("identity =" + (userV1==userV2));
        System.out.println("identity =" + userV1.equals(userV2));


    }
}


package immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");
        ImmutableAddress b = address;

        System.out.println("a = "+address);
        System.out.println("b = "+b);

        // b.setValue("부산"); final로 인하여 사용 못함
        b = new ImmutableAddress("부산");
        System.out.println("부산 -> b");
        System.out.println("a = "+address);
        System.out.println("b = "+b);

    }
}


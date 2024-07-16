package enumeration.ref3;

public class EnumRefMain3_1 {
    public static void main(String[] args) {
        int price = 10000;

        System.out.println("basic 등급의 할인 금액 : "+ Grade.BASIC.discount(price));
        System.out.println("gold 등급의 할인 금액 : "+ Grade.GOLD.discount(price));
        System.out.println("diamond 등급의 할인 금액 : "+ Grade.DIAMOND.discount(price));
    }
}

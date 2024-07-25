package generics.coffee;

import generics.User.User;

public class CoffeeMain {
    public static void main(String[] args) {
        CoffeeByNumber c1 = new CoffeeByNumber(10);

        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("최민식");
        c2.ready();

        System.out.println("----------------------");

        CoffeeByName c3 = new CoffeeByName(11);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("방명수");
        c4.ready();

        System.out.println("----------------------");

        int c3Name = (int) c3.name;
        System.out.println("주문 고객 번호 : "+c3Name);

        String c4Name = (String) c4.name;
        System.out.println("주문 고객 이름 : "+c4Name);

        // c4Name = (String) c3.name; 런타임 에러 발생

        System.out.println("----------------------");

        // Generics 사용
        Coffee<Integer> c5 = new Coffee<>(12);
        c5.ready();
        int c5Name = c5.name;
        System.out.println("주문 고객 번호 : "+c5Name);

        Coffee<String> c6 = new Coffee<>("츄");
        c6.ready();
        String c6name = c6.name;
        System.out.println("주문 고객 이름 : " + c6name);

        System.out.println("----------------------");

        // CoffeeByUser<User> c7 = new CoffeeByUser<User>("2");

        System.out.println("----------------------");

        orderCoffee("홍길동");
        orderCoffee("장발장","콜드라떼");
    }
    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : "+name);
    }
    public static <T,V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee+" 준비 완료 : "+name);
    }
}

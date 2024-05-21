package ex6;

public class Chicken extends walkAnimal implements flyAnimal {

    @Override
    public void sound() {
        System.out.println("꼭기오");
    }

    @Override
    public void fly() {
        System.out.println("치킨 이동");
    }
}

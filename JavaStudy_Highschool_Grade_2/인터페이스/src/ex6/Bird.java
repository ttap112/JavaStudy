package ex6;

public class Bird extends walkAnimal implements flyAnimal{

    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새 이동");
    }
}

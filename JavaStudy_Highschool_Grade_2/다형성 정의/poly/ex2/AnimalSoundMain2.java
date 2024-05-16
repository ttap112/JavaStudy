package poly.ex2;

public class AnimalSoundMain2 {

    public static void main(String[] args) {
        Caw caw = new Caw();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Animal[] animals = {dog, cat, caw};

        for (Animal animal : animals){
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
            System.out.println();
        }
    }

}


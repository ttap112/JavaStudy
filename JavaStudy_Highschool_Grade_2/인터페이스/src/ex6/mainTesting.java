package ex6;

public class mainTesting {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        dog.move();
        animalSound(dog);

        animalFlying(bird);
        animalSound(bird);

        animalFlying(chicken);
        animalSound(chicken);
    }
    public static void animalSound(walkAnimal animal) {
        animal.sound();
    }
    public static void animalFlying(flyAnimal flyAnimal) {
        flyAnimal.fly();
    }
}

package lang.object.toString;

public class Dog {

    private String dogName;

    public Dog(String dogName, int age) {
        this.dogName = dogName;
        this.age = age;
    }

    private int age;
    public String dogInfo() {
        return "Dog {" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public String toString() {
        return "Dog {" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                '}';
    }
}

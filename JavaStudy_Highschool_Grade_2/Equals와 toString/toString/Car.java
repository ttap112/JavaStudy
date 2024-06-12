package lang.object.toString;

public class Car {

    public Car(String car) {
        this.car = car;
    }

    private String car;

    public String carInfo() {
        return "Car{" +
                "car='" + car + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "Car{" +
                "car='" + car + '\'' +
                '}';
    }
}

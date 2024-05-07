package extends1.ex1;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.mvoe();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.mave();
        gasCar.fillUp();
    }
}

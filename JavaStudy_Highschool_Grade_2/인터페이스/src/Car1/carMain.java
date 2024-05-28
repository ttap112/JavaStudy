package Car1;

public class carMain {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Car K3car = new K3car();
        driver.setCar(K3car);
        driver.drive();
        Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();
    }
}

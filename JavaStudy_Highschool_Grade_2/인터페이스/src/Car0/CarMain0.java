package Car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3car k3car = new K3car();
        driver.setK3car(k3car);
        driver.Drive();

        Model3Car model3Car = new Model3Car();
        driver.setK3car(null);
        driver.setModel3Car(model3Car);
        driver.Drive();
    }

}

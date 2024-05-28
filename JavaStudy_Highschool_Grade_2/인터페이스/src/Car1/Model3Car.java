package Car1;

public class Model3Car implements Car{
    @Override
    public void startEngine() {
        System.out.println("model3Car.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("model3Car.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("model3Car.pressAccelerator");
    }
}

package Car1;

public class K3car implements Car{
    @Override
    public void pressAccelerator() {
        System.out.println("K3car.pressAccelerator");
    }

    @Override
    public void offEngine() {
        System.out.println("K3car.offEngine");
    }

    @Override
    public void startEngine() {
        System.out.println("K3car.StartEngine");
    }
}

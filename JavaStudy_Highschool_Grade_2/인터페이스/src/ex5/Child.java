package ex5;

public class Child implements InterfaceA, InterfaceB{
    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }
}

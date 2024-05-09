package poly.basix;

public class PolyMain {
    public static void main(String[] args) {

        // 부모 변수가 부모 인스턴스 참조
        System.out.println("parent -> parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("child -> child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 부모 변수가 자식 인스턴스를 참조(다형적 참조) -> 부모는 자식을 줄 수 있다.
        System.out.println("parent -> child");
        Parent poly = new Child();
        poly.parentMethod();
        // poly.childMethod(); 자식의 기능은 호출할 수 없다.

        // Child child1 = new Parent()  자식은 부보를 담을 수 없다.
    }
}

package lang.object.toString;

public class BadObjectPrinter {
    public static void print(Car car) {
        String string = "객체 정보 출력 : " + car.carInfo();
        System.out.println(string);
    }

    public static void print(Dog dog) {
        String string = "객체 정보 출력 : " + dog.dogInfo();
        System.out.println(string);
    }
}
/*
구체적인 것에 의존
- BadObjectPrinter는 구체적인 타입인 Car, Dog를 사용한다.
  따라서 이후엔 출력해야 할 구체적인 클래스가 10개로 늘어나면 클래스에 맞추어 메서드도 10개로 늘어나야 한다.
- 이렇게 BedObjectPrinter 클래스가 구체적인 특정 클래스만 Car, Dog를 사용하는 것을 BadObjectPrinter는 Car,Dog에 의존한다고 표한한다.
- 이 문제를 해결하기 위해 자바에서는 객체의 정보를 사용할 때 다형적 참조문제를 해결해줄 Object 클래스와 메서드 오버라이딩 문제를 해결해 줄 Object.toString() 메서드가 있다.

추상적인 것에 의존
- 앞서 마든 ObjectPrinter를 보면Car,Dog 와 같은 구체적인 클래스에 의존하는 것이 아니라 추상저인 Object 클래스를 사용했다.
- 이렇게 ObjectPrinter 클래스가 Object 클래스에 사용하는 것을 Objectprinter 클래스가 Object 클래스에 의존하게 된다.

OCP 원칙
- OPEN : 새로운 클래스를 추가하고, toString()을 오버라이딩해서 기능을 확장할 수 있다.
- CLOSED : 새로운 클래스를 추가해도 Object와 toString()을 사용하는 클라이언트 코드인 ObjectPrinter는 변경되지 않아도 된다.
 */
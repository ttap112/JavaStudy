package blackBox;

public class _08_Constructor {
    public static void main(String[] args) {
        // 생성자
        // 객체가 만들어질 때 자동으로 호출되는 메소드

        BlackBox b1 = new BlackBox(); // BLackBox() : 생성자[ 대문자로 시작, 클래스 이름과 동일 ]
        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "Black";
        System.out.println(b1.modelName);
        System.out.println(b1.serialNumber);

        BlackBox b2 = new BlackBox("햐양이","UHD",400000,"white");

        System.out.println(b2);
        System.out.println(b2.modelName);
        System.out.println(b2.serialNumber);

        BlackBox b3 = new BlackBox("까망이2","UHD",350000);
        System.out.println(b3.color);


    }
}

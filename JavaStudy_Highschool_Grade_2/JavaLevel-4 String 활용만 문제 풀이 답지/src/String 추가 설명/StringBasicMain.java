package String;

public class StringBasicMain {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");

        System.out.println("str1 = "+str1);
        System.out.println("str2 = "+str2);
    }
}
// 쌍 따움표를 사용 방법, 객체 사용 방법이 있다.
// String는 클래스이다. int,boolean과 같은 기본형이 아니라 참조형이다.
// 따라서 str1 변수에는 String 인스턴스의 참조값만 들어갈 수 있다.
// 그러면 String str = "hello" ; 문장은 뭔가 어색하다.
// String str1 = "hello";
// String str1 = new String("hello");

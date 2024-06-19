package String;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";
        str.concat(" java");

        System.out.println("Str = "+str);
    }
}
// Sttring은 불변 개체이다.
// 따라서 새성 이후에 절대로 내부의 문자여 값을 변경할 수 없다.

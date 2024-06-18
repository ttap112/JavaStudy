package String;

public class StringInfoMain {
    public static void main(String[] args) {
        String str = "hello, java!";

        System.out.println("문자열 길이 : "+str.length());
        System.out.println("문자열 길이 : "+str.isEmpty());
        //System.out.println("문자열 길이 : "+str.isBlank());
        // System.out.println("문자열 길이 : "+" ".isBlank());

        char c = str.charAt(7);

        System.out.println("7번 인덱스의 문자 : "+c);
    }
}

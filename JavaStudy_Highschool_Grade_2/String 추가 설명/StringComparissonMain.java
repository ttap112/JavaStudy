package String;

public class StringComparissonMain {
    public static void main(String[] args) {
        String str1 = "hello, Java!";
        String str2 = "hello, java!";
        String str3 = "hello World";

        System.out.println("str1 equals str2 : "+str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str2 : "+str1.equalsIgnoreCase(str2)); // 대소문자 구분없이
        System.out.println("'b' compareTo 'a' : "+"b".compareTo("a"));
        System.out.println("str1 starts with 'hello'"+str1.startsWith("Hello"));

    }
}

package lang.object.toString;

public class toStringMain1 {

    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        // toString() 반환값 출력
        System.out.println(string);

        // object 직접 입력
        System.out.println(object);
    }

}



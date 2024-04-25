package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public
        data.publicField = 1;
        data.publicMethod();

        // default
        data.defaultField = 2;
        data.defaultMethod();

//        private - 다릌 를래스에서 호출 불가
//        data.privateField = 3;
//        data.privateMethod();

        data.innerAccess();
    }
}

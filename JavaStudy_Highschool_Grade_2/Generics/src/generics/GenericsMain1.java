package generics;

public class GenericsMain1 {
    public static void main(String[] args) {
        Integer[] iArray = {1,2,3,4,5};
        Double[] dArray = {1.0,2.0,3.0,4.0,5.0};
        String[] sArray = {"A","B","C","D","E"};

        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
    }

    // Generics Method Create
    // T : Type
    // E : Element
    // K : Key
    // V : Value

    private static <T> void printAnyArray(T[] Array) {
        for (T t : Array) {
            System.out.println(t);
        }
    }
}

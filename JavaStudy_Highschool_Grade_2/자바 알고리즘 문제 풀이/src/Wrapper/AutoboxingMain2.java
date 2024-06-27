package Wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value;

        int unboxedValue = boxedValue;
        System.out.println("boxedValue = "+boxedValue);
        System.out.println("unboxedvalue = "+unboxedValue);
    }
}

package Wrapper;

public class MyInteger {

    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public int compareTo(int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        // 정수 > 문자열
        return String.valueOf(value);
    }
}

package WrapperQuestion;

public class WrapperTest2 {
    public static void main(String[] args) {
        String[] array = {"1.5","2.5","3.5"};

        double sum = 0;
        for (String s : array) {
            double i = Double.parseDouble(s);
            sum += i;
        }
        System.out.println(sum);
    }
}
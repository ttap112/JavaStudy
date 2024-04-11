package Exam;

public class Ex01 {
    public static void main(String[] args) {
        GreatestDifferenceFinder finder = GreatestDifferenceFinder();

        int[] testArray = {-2,7,3};
        System.out.println(finder.greatestDifference(testArray));
    }
}

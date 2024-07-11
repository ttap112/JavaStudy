package math.test;

import java.util.Random;

public class LottoGenerator {

    public int[] generate() {
        Random random = new Random();
        int[] arr = new int[6];
        arr[0] = random.nextInt(46);
        for (int i = 1; i<arr.length; i++) {
            arr[i]= random.nextInt(46);
            if (arr[i]==arr[i-1]) {
                arr[i] = 0;
                i--;
            }
        }
        return arr;
    }
}

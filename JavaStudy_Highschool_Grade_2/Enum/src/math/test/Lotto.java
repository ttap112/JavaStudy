package math.test;

import java.util.Random;

public class Lotto {
    private final Random random = new Random();
    private int[] lottoNumbers;
    private int cnt;

    public int[] generate1() {
        lottoNumbers = new int[6];
        cnt = 0;
        while (cnt < 6) {
            int number = random.nextInt(46);
            if (isUnique(number)) {
                lottoNumbers[cnt] = number;
                cnt++;
            }
        }
        return lottoNumbers;
    }
    private boolean isUnique(int num) {
        for (int i = 0; i<cnt; i++) {
            if (lottoNumbers[i] == num) {
                return false;
            }
        }
        return true;
    }
}

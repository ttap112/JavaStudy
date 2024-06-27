package ex;

import java.util.Scanner;

public class RandomBaseball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int[][] numList = new int[range][3];
        for (int i = 0; i<range; i++) {
            numList[i][0]=sc.nextInt();
            numList[i][1]=sc.nextInt();
            numList[i][2]=sc.nextInt();
        }
        int ans = 0;
        for (int i = 1; i<=9; i++) {
            for (int j = 1; j<=9; j++) {
                for (int k = 1; k<=9; k++) {
                    if (i == j || j == k || i == k) continue;
                    boolean chk = true;
                    for (int n = 0; n<range; n++) {
                        int qx = numList[n][0] / 100;
                        int qy = (numList[n][0]/10) % 10;
                        int qz = numList[n][0] % 10;

                        int strike = 0;
                        int ball = 0;

                        if (i == qx) strike++;
                        else if ( i == qy || i == qz) ball++;
                        if (j == qy) strike++;
                        else if ( j == qz || j == qx) ball++;
                        if (k == qz) strike++;
                        else if ( k == qy || k == qx) ball++;

                        // 입력받은 스트라이크와 볼의 결과와 다른 경우 답이 될 수없음
                        if(strike != numList[n][1] || ball != numList[n][2]) {
                            chk = false;
                            break;
                        }
                    }
                    if (chk) ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

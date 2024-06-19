package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class saltBoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time1 = sc.next();
        String[] timer1 = time1.split(":");
        int[] arr1 = {Integer.parseInt(timer1[0]),Integer.parseInt(timer1[1]),Integer.parseInt(timer1[2])};

        String time2 = sc.next();
        String[] timer2 = time2.split(":");
        int[] arr2 = {Integer.parseInt(timer2[0]),Integer.parseInt(timer2[1]),Integer.parseInt(timer2[2])};

        int[] total = new int[3];
        while (arr1[2] != arr2[2]) {
            arr1[2]++;
            total[2]++;
            if (arr1[2] == 60) {
                arr1[2] = 0;
                arr1[2]++;
            }
        }
        while (arr1[1] != arr2[1]) {
            arr1[1]++;
            total[1]++;
            if (arr1[1] == 60) {
                arr1[1] = 0;
                arr1[0]++;
            }
        }
        while (arr1[0] != arr2[0]) {
            arr1[0]++;
            total[0]++;
            if (arr1[0] == 24) {
                arr1[0] = 0;
            }
        }
        String[] totalString = new String[3];
        for (int i = 0; i<total.length; i++) {
            if (total[i] < 10) {
                totalString[i] = "0"+ total[i];
            }
        }
        System.out.println(Arrays.toString(totalString));
        System.out.printf("%s:%s:%s",totalString[0],totalString[1],totalString[2]);

    }
}


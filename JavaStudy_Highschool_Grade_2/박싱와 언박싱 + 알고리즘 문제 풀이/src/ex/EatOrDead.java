package ex;

import java.util.ArrayList;
import java.util.Scanner;

public class EatOrDead {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> Count = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i<n; i++) {
            int[] arr1 = new int[sc.nextInt()];
            int[] arr2 = new int[sc.nextInt()];
            for (int j = 0; j<arr1.length; j++) {
                arr1[j] = sc.nextInt();
            }
            for (int j = 0; j<arr2.length; j++) {
                arr2[j] = sc.nextInt();
            }
            int c = 0;
            for (int j = 0; j<arr1.length; j++) {
                for (int k = 0; k<arr2.length; k++) {
                    if (arr1[j] > arr2[k]) {
                        c++;
                    }
                }
            }
            Count.add(c);
        }
        for (int i : Count) {
            System.out.println(i);
        }
    }
}

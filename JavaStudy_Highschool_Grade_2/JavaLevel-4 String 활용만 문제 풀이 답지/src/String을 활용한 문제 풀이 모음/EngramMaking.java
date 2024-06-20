package baekjoon;

import java.util.Scanner;

public class EngramMaking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Fn = sc.next();
        String Sn = sc.next();

        int[] arr1 = getAlphabetCount(Fn);
        int[] arr2 = getAlphabetCount(Sn);

        int count = 0;
        for (int i = 0; i<26; i++) {
            count += Math.abs(arr1[i] - arr2[i]);
        }
        System.out.println(count);
    }
    public static int[] getAlphabetCount(String str ) {
        int[] arr = new int[26];
        for (int i = 0; i<str.length(); i++) {
            arr[str.charAt(i)-'a']++;
        }
        return arr;
    }
}

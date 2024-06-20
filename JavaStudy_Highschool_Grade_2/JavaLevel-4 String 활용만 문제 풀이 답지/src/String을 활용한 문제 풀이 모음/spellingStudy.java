package baekjoon;

import java.util.Scanner;

public class spellingStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next().toUpperCase();
        int[] count  = new int[26];

        for (int i = 0; i<s.length(); i++) {
            count[s.charAt(i)-'A']++;
        }
        int maxC = 0;
        char maxA = ' ';
        for (int i = 0; i<26; i++) {
            if (count[i] > maxC) {
                maxC = count[i];
                maxA = (char)('A'+i);
            } else if (count[i] == maxC) {
                maxA = '?';
            }
        }
        System.out.println(maxA);
    }
}

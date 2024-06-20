package baekjoon;

import java.util.Scanner;

public class reChangeLowerUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] c = s.toCharArray();
        for (int i = 0; i<c.length; i++) {
            if ('a' <= c[i] && c[i] <= 'z') {
                c[i] = (char)('A' + c[i] - 'a');
            } else {
                c[i] = (char)('a' + c[i] - 'A');
            }
        }
        System.out.println(c);
    }
}
// https://cloud9june.notion.site/03264a3b6ac644b99929354f7ebe649f
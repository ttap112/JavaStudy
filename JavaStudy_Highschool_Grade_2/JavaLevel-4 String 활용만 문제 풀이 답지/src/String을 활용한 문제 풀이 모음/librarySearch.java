package baekjoon;

import java.util.Scanner;

public class librarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String doc = sc.nextLine();
        String word = sc.nextLine();
        int startIndex = 0;
        int cnt = 0;

        while (true) {
            int findIndex = doc.indexOf(word,startIndex);
            if (findIndex<0) {
                break;
            }
            startIndex = findIndex+word.length();
            cnt++;
        }
        System.out.println(cnt);
    }
}

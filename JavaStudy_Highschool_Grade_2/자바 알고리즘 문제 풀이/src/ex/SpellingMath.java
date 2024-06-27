package ex;

import java.util.Arrays;
import java.util.Scanner;

public class SpellingMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] alphabet = new int[26];

        while (n-- > 0) {
            //단어를 문자 배열로 변환
            char[] txt = sc.next().toCharArray();
            // 자릿수를 나태내는 변수를 선언하고 초기화값으로 1로 할당
            int playValue = 1;
            // 단어를 끝에서부터 시작하여 각 문자의 가치를 계산
            for (int i = txt.length-1; i>=0; i--) {
                alphabet[txt[i]-'A'] = alphabet[txt[i]-'A'] + playValue;
                playValue *= 10;
            }
            // 알파벳 값을 오름차순으로 정렬
            Arrays.sort(alphabet);

            int ans = 0;
            for (int i = 0; i<10; i++) {
                ans = ans + alphabet[25-i] * (9-i);
            }
            System.out.println(ans);
        }
    }
}
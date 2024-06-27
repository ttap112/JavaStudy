package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class EatOrDead {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> Count = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr1 = new int[Integer.parseInt(st.nextToken())];
            int[] arr2 = new int[Integer.parseInt(st.nextToken())];

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j<arr1.length; j++) {
                arr1[j] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j<arr2.length; j++) {
                arr2[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            int c = 0;
            int k = 0;
            for (int j = 0; j<arr1.length; j++) {
                while (k < arr2.length && arr2[k] < arr1[j]) {
                    k++;
                }
                c += k;
            }
            Count.add(c);
        }
        br.close();
        for (int i : Count) {
            System.out.println(i);
        }
    }
}
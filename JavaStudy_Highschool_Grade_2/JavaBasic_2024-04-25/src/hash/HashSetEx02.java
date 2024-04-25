package hash;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        int Target = sc.nextInt();
        int[] arr = new int[Num];

        for (int i = 0; i<Num; i++) {
            arr[i]=sc.nextInt();
        }
        sc.close();

        System.out.println(solution(arr,Target));
    }

    // solution 메서도 생성하고 구현
    public static boolean solution(int[] arr, int Target) {
        HashSet<Integer> hash = new HashSet<>();
        for (int i : arr) {
            if (hash.contains(Target-i) && Target-i != i) {
                System.out.println(Target+" "+i);
                System.out.println(hash);
                return true;

            }
            System.out.println(Target+" "+i);
            System.out.println(hash);
            hash.add(i);
        }
        System.out.println(hash);
        return false;
    }
}
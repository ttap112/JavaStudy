package hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        int[] arr = new int[Num];
        for (int i = 0; i<Num; i++) {
            arr[i]=sc.nextInt();
        }
        sc.close();
        solution(arr);
    }
    public static void solution(int[] arr) {
        HashSet<Integer> hash = new HashSet<>();
        for (int i = 0; i< arr.length; i++) {
            for (int j = 0; j<i; j++) {
                hash.add(arr[j]+arr[i]);
                }
            }
        Iterator iter = hash.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next()+" ");
        }
        System.out.println();

        int[] newNum = hash.stream().sorted().mapToInt(Integer::intValue).toArray();

        for (int n : newNum) {
            System.out.print(n +" ");
        }
    }
}

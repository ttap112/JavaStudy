package poly.sort;

import java.util.Scanner;

public class SortTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 객체
        QuickSort quickSort = new QuickSort();
        BubbleSort bubbleSort = new BubbleSort();
        HeapSort heapSort = new HeapSort();

        int[] Nums = new int[5];

        System.out.println("정렬 방식을 선택하세요.");
        System.out.println("[1] : BubbleSort");
        System.out.println("[2] : HeapSort");
        System.out.println("[3] : QuickSort");

        int choice = sc.nextInt();

        // 호출하는 부분 작성
        if (choice == 1) {
            selectedSort(bubbleSort,Nums);
        } else if (choice == 2) {
            selectedSort(heapSort,Nums);
        } else if (choice == 3) {
            selectedSort(quickSort,Nums);
        }
    }
    private static void selectedSort(Sort sort ,int[] Nums) {

        // 메서드 본문 작성.
        sort.ascending(Nums);
        sort.descending(Nums);
        sort.description();
    }
}

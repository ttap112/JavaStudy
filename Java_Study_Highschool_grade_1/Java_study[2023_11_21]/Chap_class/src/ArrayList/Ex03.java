package ArrayList;

import java.util.ArrayList;

public class Ex03 {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(10);
        numList.add(3);
        numList.add(7);
        numList.add(20);

        for (int num : numList) {
            System.out.println(num*num);
        }
    }
}

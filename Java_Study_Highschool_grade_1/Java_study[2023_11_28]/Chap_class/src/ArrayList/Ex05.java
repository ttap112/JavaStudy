package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {

    public static int getSurvivingIndex(int n, int k) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i=0; i<=n; i++) {
            result.add(i);
        }

        while (true) {
            

        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.print("총 인원을 입력하시오 ; ");
        int n = Scan.nextInt();
        System.out.println();

        System.out.print("매 턴마다 몇뻔재 사람이 죽을 것인지 입력하시오 : ");
        int k = Scan.nextInt();
        System.out.println();

        System.out.println("인원을 추가합니다.");

        getSurvivingIndex(n,k);



    }
}

/*
    전쟁에서 처참하게 패배를 겪고 돌아온 김장군, 책임을 지기 위해 돌아온 이들에게 자결을 제안
    n명의 군사들이 동그라게 서있고, 한 명씩 세어 나가며 매 k번째 사람이 죽기로 했다.
    예를 들어서 8명의 군사들이 있고 매 3명마다 죽기로 하면 아래 순서로 군사들이 죽게된다
    3 > 6 > 1 > 5 > 2 > 8 > 4 > 7
    하지만 김장군은 자신이 마지막으로 남아서 도망가려고 함
    파라미터로 정수 n과 정수 k를 받고, 김장군이 살기 위해서 서 있어야 할 자리(Int) 를 리턴해주는
    단, ArrayList를 사용할 것.
 */

package ex;

import java.util.Scanner;

public class RandomBaseball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 0 : 난수 3개
        // 1 : strike 수
        // 2 : ball 수
        int[][] numList = new int[sc.nextInt()][3];
        for (int i = 0; i<numList.length; i++) {
            numList[i][0]=sc.nextInt();
            numList[i][1]=sc.nextInt();
            numList[i][2]=sc.nextInt();
        }

    }
}

/*
영수는 난수 3개 생각
민혁은 난수 3개를 영수한테 질문
민혁이 말한 위치에 있으면 스트라이크 다른위치에 같은 수면 볼을 말함
영수는 몇 볼 몇 스트라이크인지 말함
민혁이가 3스트라이크되면 겜 종료 그게 아니면 계속 진행
우리는 이를 통해 영수가 어떤 대답을 했는지를 입력으로 주이지며, 이 입력으로 영수가 생각을 할 가능성이 있는 수를 찾아야 함.
 */
package ex.pay1;

import java.util.Scanner;

public class PayMain2 {
    public static void main(String[] args) {
        PayService payService = new PayService();
        Scanner textScan = new Scanner(System.in);
        while (true) {
            System.out.print("결제 수단을 입력하시오 : ");
            String Option = textScan.next();
            if (Option.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break; // return 으로 작성해도 똑같이 작동
            } else {
                System.out.print("결제 금액을 입력하시오 : ");
                int amount = textScan.nextInt();
                payService.processPay(Option,amount);
            }
        }
    }
}

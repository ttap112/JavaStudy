package ex.pay1;

public class PayMain1 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        // 카카오 결제
        String payOption1 = "Kakao";
        int amount1 = 5000;
        payService.processPay(payOption1,amount1);

        // 네이버 결제
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2,amount2);

        // 잘못된 결제 수단
        String payOption3 = "apple";
        int amount3 = 15000;
        payService.processPay(payOption3,amount3);
    }
}

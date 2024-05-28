package ex.pay1;

public class PayService {
    private Pay pay;

    public void setPay(Pay pay) {
        this.pay = pay;
    }
    public void processPay(String option, int amount) {
        boolean result = false;
        System.out.println("결제를 시작합니다. option : "+option+" amount"+amount);
        if (option.equals("kakao")) {
            KakaoPay kakaoPay = new KakaoPay();
            result = kakaoPay.pay(amount);
        } else if (option.equals("naver")) {
            NaverPay naverPay = new NaverPay();
            result = naverPay.pay(amount);
        } else {
            System.out.println("결재 수단이 없습니다.");
        }
        if (result) {
            System.out.println("결제에 성공했습니다.");
        } else  {
            System.out.println("결제에 실패했습니다.");
        }

    }
}

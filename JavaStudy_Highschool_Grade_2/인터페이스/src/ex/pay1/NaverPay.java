package ex.pay1;

public class NaverPay implements  Pay{
    private int amount;

    public void setAmount(int amount) {
        this.amount = amount;
    }
    @Override
    public void pay() {
        System.out.println("네이버 시스템에 연결합니다.");
        System.out.println(amount+"원 결제를 시도합니다.");
    }
}

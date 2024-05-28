package ex.pay1;

public class KakaoPay implements  Pay{
    private int amount;

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void pay() {
        System.out.println("카카오 시스템에 연결합니다.");
        System.out.println(amount+"원 결제를 시도합니다.");
    }
}

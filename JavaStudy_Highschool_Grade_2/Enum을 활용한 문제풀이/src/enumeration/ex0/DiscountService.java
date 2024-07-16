package enumeration.ex0;

public class DiscountService {

    public int DiscountService(String Grade, int Price) {
        int DiscountPercent = 0;

        if (Grade.equals("gold")) {
            DiscountPercent = 20;
        } else if (Grade.equals("basic")) {
            DiscountPercent = 10;
        } else if (Grade.equals("diamond")) {
            DiscountPercent = 30;
        } else {
            System.out.println(Grade+": 할인 X");
        }
        return DiscountPercent;
    }

}

/*
고객은 3등급으로 나누고, 상품 구매사 등급별로 할인을 적용한다. 할인사 소수점 이하는 버린다.
1. basic : 10%
2. gold : 20%
3. diamond : 30%

회원 등급과 가격을 입력하면 할인 금액을 계산해주는 클래스를 마늘어보자.
예를 들어 gold, 1000을 입력하면 할인 대상 금액은 20%이 된다.
 */
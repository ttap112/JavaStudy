package enumeration.ex1;

public class DiscountService {
        public int DiscountService(String Grade, int Price) {
            int DiscountPercent = 0;

            if (Grade.equals(StringGrade.BASIC)) {
                DiscountPercent = 10;
            } else if (Grade.equals(StringGrade.GOLD)) {
                DiscountPercent = 20;
            } else if (Grade.equals(StringGrade.DIAMOND)) {
                DiscountPercent = 30;
            } else {
                System.out.println(Grade+": 할인 X");
            }
            return DiscountPercent;
    }
}

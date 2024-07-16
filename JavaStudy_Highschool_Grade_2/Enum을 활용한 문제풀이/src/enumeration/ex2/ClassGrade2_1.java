package enumeration.ex2;

public class ClassGrade2_1 {
    public static void main(String[] args) {

        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.Discount(ClassGrade.BASIC,10000);
        int gold = discountService.Discount(ClassGrade.GOLD,10000);
        int diamond = discountService.Discount(ClassGrade.DIAMOND,10000);
    }
}

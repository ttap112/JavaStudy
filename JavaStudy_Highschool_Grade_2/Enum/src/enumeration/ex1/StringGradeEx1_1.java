package enumeration.ex1;

public class StringGradeEx1_1 {
    public static void main(String[] args) {
        int price =10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.DiscountService(StringGrade.BASIC,price);
        int gold = discountService.DiscountService(StringGrade.GOLD,price);
        int diamond = discountService.DiscountService(StringGrade.DIAMOND,price);
    }
}

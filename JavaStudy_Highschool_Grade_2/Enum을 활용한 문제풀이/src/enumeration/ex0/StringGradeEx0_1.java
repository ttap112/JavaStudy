package enumeration.ex0;

public class StringGradeEx0_1 {
    public static void main(String[] args) {
        int price = 1000;
        DiscountService discountService = new DiscountService();

        int basic = discountService.DiscountService("basic",price);
        int gold = discountService.DiscountService("gold",price);
        int diamond = discountService.DiscountService("diamond",price);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }
}

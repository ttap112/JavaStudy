package enumeration.ex2;

public class DiscountService {
    public int Discount(ClassGrade classGrade, int Price) {
        int DiscountPercent = 0;

        if (classGrade == classGrade.BASIC) {
            DiscountPercent = 10;
        } else if (classGrade == classGrade.GOLD) {
            DiscountPercent = 20;
        } else if (classGrade == classGrade.DIAMOND) {
            DiscountPercent = 30;
        } else {
            System.out.println("할인 X");
        }
        return DiscountPercent;
    }
}

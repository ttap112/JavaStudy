package enumeration.ref3;

public enum Grade {
    BASIC(10),GOLD(20),DIAMOND(30);

    private final int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
    // 캡슐화 |  불필요한 클래스 제거
    public int discount(int price) {
        return price * discountPercent / 100;
    }
}

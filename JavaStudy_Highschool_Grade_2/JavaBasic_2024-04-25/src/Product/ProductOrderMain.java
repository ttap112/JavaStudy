package Product;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] Profile = new ProductOrder[3];

        Profile[0] = new ProductOrder();
        Profile[1] = new ProductOrder();
        Profile[2] = new ProductOrder();

        Profile[0].ProductName = "두부";
        Profile[0].Price = 2000;
        Profile[0].Quantity = 2;

        Profile[1].ProductName = "김치";
        Profile[1].Price = 5000;
        Profile[1].Quantity = 1;

        Profile[2].ProductName = "콜라";
        Profile[2].Price = 1500;
        Profile[2].Quantity = 2;

        for (int i = 0; i<Profile.length; i++) {
                System.out.println("상품명 : "+Profile[i].ProductName+", 가격 : "+Profile[i].Price+", 수량 : "+Profile[i].Quantity);
        }
    }
}

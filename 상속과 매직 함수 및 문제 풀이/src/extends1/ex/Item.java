package extends1.ex;

public class Item {
    private String name;
    private int price;

    public Item(String name, int Price) {
        this.name = name;
        this.price = Price;
    }

    public int getPrice() {
        return this.price;
    }

    public void print() {
        System.out.println("이름 : "+this.name+" 가격 : "+this.price);
    }
}

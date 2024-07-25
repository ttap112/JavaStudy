package generics.ex3;

public class CoffeeOrder <T>{
    private final T customer;
    private final String coffeeName;

    public CoffeeOrder(T customer, String coffeeName) {
        this.customer = customer;
        this.coffeeName = coffeeName;
    }

    public T getCustomer() {
        return customer;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void displayOrder() {
        System.out.println("Customer : "+getCustomer());
        System.out.println("Coffee : "+getCoffeeName());
    }

}

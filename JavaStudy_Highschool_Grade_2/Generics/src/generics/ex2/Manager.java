package generics.ex2;

public class Manager <U,P>{
    private U user;
    private P product;

    public Manager(U user, P product) {
        this.user = user;
        this.product = product;
    }

    public U getUser() {
        return user;
    }

    public P getProduct() {
        return product;
    }

    public void displayInfo() {
        System.out.println("User : "+getUser());
        System.out.println("Product : "+getProduct()+", Price"+getProduct());
    }
}

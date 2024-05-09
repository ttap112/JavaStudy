package extends1.ex;

public class Movie extends Item{

    private String Director;
    private String Actor;

    public Movie(String name, int price, String Director, String Actor) {
        super(name,price);
        this.Director = Director;
        this.Actor = Actor;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("-감독 : "+Director+" 배우 : "+Actor);
        System.out.println();
    }
}

package extends1.ex;

public class Album extends Item{
    private String Artist;

    public Album(String name, int price, String Artist) {
        super(name,price);
        this.Artist = Artist;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("아티스트 : "+Artist);
        System.out.println();
    }
}

package magicNumber.before;

public class Robot {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public void order(int command) {
        if (command == 0) {
            System.out.println(name+ " Walk");
        } else if  (command == 1) {
            System.out.println(name + " STOP");
        } else if (command == 2) {
            System.out.println(name + " Jump");
        } else {
            System.out.println(name + " Error");
        }
    }
}

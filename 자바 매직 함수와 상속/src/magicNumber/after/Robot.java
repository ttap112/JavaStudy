package magicNumber.after;

public class Robot {
    private String name;

    public static final int COMMAND_WALK = 0;
    public static final int COMMAND_STOP = 1;
    public static final int COMMAND_JUMP = 2;

    public Robot(String name) {
        this.name = name;
    }


    public void order(int command) {
        if (command == COMMAND_WALK) {
            System.out.println(name+ " Walk");
        } else if  (command == COMMAND_STOP) {
            System.out.println(name + " STOP");
        } else if (command == COMMAND_JUMP) {
            System.out.println(name + " Jump");
        } else {
            System.out.println(name + " Error");
        }
    }
}
package magic_number.after;

public class Robot {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public static final int COMMAND_WALK = 0;
    public static final int COMMAND_STOP = 1;
    public static final int COMMAND_JUMP = 2;

    public void order(int command) {
        if (command == COMMAND_WALK) {
            System.out.println(name+" walk");
        } else if (command == COMMAND_STOP) {
            System.out.println(name+" stop");
        } else if (command == COMMAND_JUMP) {
            System.out.println(name+" jump");
        } else {
            System.out.println(name+" error");
        }
    }
}
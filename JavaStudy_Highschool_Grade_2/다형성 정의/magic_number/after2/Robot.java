package magic_number.after2;

public class Robot {
    public Robot(String name) {
        this.name = name;
    }

    private String name;

    public enum Command{
        WALK,
        STOP,
        JUMP,
    };

    // 상수로 하면 값이 중복되도 괜찮다

    public void order(Robot.Command command) {
        if (command == Command.WALK) {
            System.out.println(name+" walk");
        } else if (command == Command.STOP) {
            System.out.println(name+" stop");
        } else if (command == Command.JUMP) {
            System.out.println(name+" jump");
        } else {
            System.out.println(name+" error");
        }
    }
}
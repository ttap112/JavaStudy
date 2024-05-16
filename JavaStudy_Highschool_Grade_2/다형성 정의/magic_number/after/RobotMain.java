package magic_number.after;

public class RobotMain {
    public static void main(String[] args) {
        Robot robot = new Robot("smith");

        robot.order(Robot.COMMAND_STOP);
        robot.order(Robot.COMMAND_JUMP);
        robot.order(Robot.COMMAND_WALK);
        robot.order(100);
    }
}

package magicNumber.after2;

public class RobotMain {
    public static void main(String[] args) {
        magicNumber.after2.Robot robot = new Robot("Skalet");

        robot.order(Robot.Command.WALK);
        robot.order(Robot.Command.STOP);
        robot.order(Robot.Command.JUMP);


    }
}

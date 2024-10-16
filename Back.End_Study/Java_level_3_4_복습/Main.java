package multiTVControl2;

public class Main {
    public static void main(String[] args) {
        TV samsungTV = new SamsungTV();
        TV lgTV = new LGTV();
        UniversalRemote remote = new UniversalRemote();

        remote.pairWith(samsungTV);
        remote.setPower(true);
        remote.setChannel(5);
        remote.watchStreaming();
        remote.adjustVolume(40);
        remote.setPower(false);

        System.out.println("==========");

        remote.pairWith(lgTV);
        remote.setPower(true);
        remote.setChannel(5);
        remote.watchStreaming();
        remote.setPower(false);
    }
}

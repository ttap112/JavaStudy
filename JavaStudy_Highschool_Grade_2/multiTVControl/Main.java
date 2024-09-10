package multiTVControl;

public class Main {
    public static void main(String[] args) {
        UniversalRemote universalRemote = new UniversalRemote();
        universalRemote.selectPairing("SamsungTV");
        universalRemote.On();
        universalRemote.ChannelMove();
        universalRemote.Off();
    }
}

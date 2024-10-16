package multiTVControl2;

public interface RemoteControl {
    void setPower(boolean power);
    void setChannel(int channel);
    void nextChannel();
    void previousChannel();
    void adjustVolume(int level);
}

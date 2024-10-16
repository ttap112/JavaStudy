package multiTVControl2;

public class SamsungTV implements TV {

    private int currentChannel = 1;
    private boolean powerOn = false;
    private boolean paired = false;

    @Override
    public void setPower(boolean power) {
        if (paired) {
            powerOn = power;
            if (power) {
                System.out.println("Samsung TV is now ON");
            } else {
                System.out.println("Samsung TV is now OFF.");
            }
        } else {
            System.out.println("Samsung TV is not paired");
        }
    }

    @Override
    public void changeChannel(int channel) {
       if (paired&&powerOn) {
           this.currentChannel = channel;
           System.out.println("Samsung TV : Channel is channel " + channel);
       } else if (!paired) {
           System.out.println("SamsungTV is not paired");
       } else {
           System.out.println("SamsungTV is OFF. Cannot change channel");
       }
    }

    @Override
    public int getCurrentChannel() {
        return currentChannel;
    }

    @Override
    public boolean isPowerOn() {
        return powerOn;
    }

    @Override
    public boolean isPaired() {
        return paired;
    }

    @Override
    public void setPair(boolean pair) {
        paired = pair;
        if (pair) {
            System.out.println("SamsungTV paired with remote");
        } else {
            System.out.println("SamsungTV unpaired from remote");
        }
    }

    @Override
    public String getTVName() {
        return "SamsungTV";
    }

    public void watchNetflix() {
        if (powerOn) {
            System.out.println("SamsungTV : Now streaming Netflix.");
        } else {
            System.out.println("SamsungTV is OFF. Cannot stream Netflix.");
        }
    }
    private int TVSetVolume = 0;
    @Override
    public void adjustVolume(int level) {
        if (powerOn) {
            TVSetVolume = level;
        } else {
            System.out.println("Samsung TV is OFF. Cannot adjust volume.");
        }
    }
}

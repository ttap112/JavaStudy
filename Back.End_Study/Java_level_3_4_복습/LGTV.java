package multiTVControl2;

public class LGTV implements TV {

    private int currentChannel = 1;
    private boolean powerOn = false;
    private boolean paired = false;
    private int TVSetVolume = 0;


    @Override
    public void setPower(boolean power) {
        if (paired) {
            powerOn = power;
            if (power) {
                System.out.println("LG TV is now ON");
            } else {
                System.out.println("LG TV is now OFF.");
            }
        } else {
            System.out.println("LG TV is not paired");
        }
    }

    @Override
    public void changeChannel(int channel) {
        if (paired&&powerOn) {
            this.currentChannel = channel;
            System.out.println("LG TV : Channel is channel " + channel);
        } else if (!paired) {
            System.out.println("LG TVis not paired");
        } else {
            System.out.println("LG TV is OFF. Cannot change channel");
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
            System.out.println("LG TV paired with remote");
        } else {
            System.out.println("LG TV unpaired from remote");
        }
    }

    @Override
    public String getTVName() {
        return "LG TV";
    }

    @Override
    public void adjustVolume(int level) {
        if (powerOn) {
            TVSetVolume = level;
        } else {
            System.out.println("LG TV is OFF. Cannot adjust volume.");
        }
    }

    public void watchYoutube() {
        if (powerOn) {
            System.out.println("LG TV : Now streaming Youtube.");
        } else {
            System.out.println("LG TV is OFF. Cannot stream Youtube.");
        }
    }
}

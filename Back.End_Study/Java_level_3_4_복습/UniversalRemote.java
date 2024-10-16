package multiTVControl2;

class UniversalRemote implements RemoteControl{

    private TV pairedTV;

    public void pairWith(TV tv ) {
        if (pairedTV != null && pairedTV != tv ) {
            System.out.println(pairedTV.getTVName() + "'s pairing has been disconnected.");
            pairedTV.setPair(false);
        }

        pairedTV = tv;
        tv.setPair(true);
    }

    @Override
    public void setPower(boolean power) {
        if (pairedTV != null && pairedTV.isPaired() ) {
            pairedTV.setPower(power);
        } else {
            System.out.println("No TV is paired");
        }
    }

    @Override
    public void setChannel(int channel) {
        if (pairedTV != null && pairedTV.isPaired() && pairedTV.isPowerOn()) {
            pairedTV.changeChannel(channel);
        } else if (pairedTV == null || pairedTV.isPaired()) {
            System.out.println("No TV is paired");
        } else {
            System.out.println("The TV is OFF.");
        }
    }

    @Override
    public void nextChannel() {
        if (pairedTV != null && pairedTV.isPaired() && pairedTV.isPowerOn()) {
            int currentChannel = pairedTV.getCurrentChannel();
            if (currentChannel == 0) {
                pairedTV.changeChannel(999);
            } else {
                pairedTV.changeChannel(currentChannel-1);
            }
        } else if (pairedTV == null || pairedTV.isPaired()) {
            System.out.println("No TV is paired");
        } else {
            System.out.println("The TV is OFF. Cannot channel.");
        }
    }

    @Override
    public void previousChannel() {
        if (pairedTV != null && pairedTV.isPaired() && pairedTV.isPowerOn()) {
            int currentChannel = pairedTV.getCurrentChannel();
            if (currentChannel == 0) {
                pairedTV.changeChannel(999);
            } else {
                pairedTV.changeChannel(currentChannel-1);
            }
        } else if (pairedTV == null || pairedTV.isPaired()) {
            System.out.println("No TV is paired");
        } else {
            System.out.println("The TV is OFF. Cannot channel.");
        }
    }

    public void watchStreaming() {
        if (pairedTV instanceof SamsungTV) {
            ((SamsungTV) pairedTV).watchNetflix();
        } else if (pairedTV instanceof LGTV) {
            ((LGTV) pairedTV).watchYoutube();
        } else if (pairedTV instanceof  AppleTV) {
            ((AppleTV) pairedTV).watchWeave();
        } else {
            System.out.println("No streaming available for this TV");
        }
    }

    @Override
    public void adjustVolume(int level) {
        if (pairedTV != null && pairedTV.isPaired() && pairedTV.isPowerOn()) {
            pairedTV.adjustVolume(level);
        } else if (pairedTV == null || pairedTV.isPaired()) {
            System.out.println("No TV is paired");
        } else {
            System.out.println("The TV is OFF. Cannot volume.");
        }
    }
}

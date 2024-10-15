package multiTVControl2;

class UniversalRemote implements RemoteControl{

    private TV pairedTV;
    private int channel = 0;

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
        if (channel == 999) {
            System.out.println("이 이상으로 체널을 추가할 수 없습니다.");
        } else {
            channel++;
        }
    }

    @Override
    public void previousChannel() {

    }
}

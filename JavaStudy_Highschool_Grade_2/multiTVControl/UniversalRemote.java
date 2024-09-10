package multiTVControl;

import java.util.Objects;

public class UniversalRemote {

    SamsungTV samsungTV = new SamsungTV();
    LGTV LG_TV = new LGTV();

    private String PairingOnTV = "None";

    public void ChannelSetting() {

    };
    public void ChannelMove() {
        if (Objects.equals(PairingOnTV,samsungTV.getName())) {
            samsungTV.ChannelChange();
        } else if (Objects.equals(PairingOnTV, LG_TV.getName())) {
            LG_TV.ChannelChange();
        }
    };
    public void Off() {
        if (samsungTV.isPairing()) {
            samsungTV.Off();
        } else {
            LG_TV.Off();
        }
    };
    public void On() {
        if (Objects.equals(PairingOnTV, samsungTV.getName())) {
            samsungTV.On();
            System.out.println("Samsung TV와 연동되었습니다.");
        } else if (Objects.equals(PairingOnTV, LG_TV.getName())){
            LG_TV.On();
        }
    };
    public void selectPairing(String selectTV) {
        PairingOnTV = selectTV;
    }
}

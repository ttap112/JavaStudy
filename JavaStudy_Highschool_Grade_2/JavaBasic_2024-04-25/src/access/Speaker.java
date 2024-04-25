package access;

public class Speaker {
    private int volume;

    public Speaker(int volume) {
        this.volume = volume;
    }
    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량 증가할 수 없습니다. \n최대 음량입니다.");
        } else {
            volume+=10;
            System.out.println("음량은 10 증가합니다.");
        }
    }
    void volumeDown() {
        if (volume <=0) {
            System.out.println("음량 감소할 수 없습니다. \n 최저 음량입니다.");
        } else {
            volume-=10;
            System.out.println("음량은 10 감소합니다.");
        }
    }
    void showVolume() {
        System.out.println("현재 음략 : "+volume);


    }
}

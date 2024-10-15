package multiTVControl2;

public interface TV {
    void setPower(boolean power); // power가 True 면 켜짐 False면 꺼짐
    void changeChannel(int channel); // 인자로 전달 ㅏㄷ은 채너로 변경
    int getCurrentChannel(); // 현재 채널 확인
    boolean isPowerOn(); // TV 전원 확인
    boolean isPaired(); // TV가 리모컨과 페어링 여부 학인
    void setPair(boolean pair); // TV와 리모컨의 페어링 상태를 설정
    String getTVName(); // TV 이름
}

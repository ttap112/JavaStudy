package oop;

public class MusicPlayer {

    boolean isOn;
    int volume;
    void on() {
        isOn = true;
        System.out.println("음악 플레이어가 시작합니다.");
        System.out.println("-----------------------");
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이어가 종료합니다.");
        System.out.println("-----------------------");
    }

    void volumeUP() {
        volume++;
        System.out.println("볼륨이 증가 했습니다.");
        System.out.println("현재 볼륨 : "+volume);
        System.out.println("-----------------------");
    }

    void volumeDown() {
        volume--;
        System.out.println("볼륨이 감소 했습니다.");
        System.out.println("현재 볼륨 : "+volume);
        System.out.println("-----------------------");
    }

    void showStatus() {
        if (isOn == true) {
            System.out.println("음악 플레이어는 현재 활성하 상태 입니다.");
            System.out.println("현재 볼륨 : "+volume);
            System.out.println("-----------------------");
        } else {
            System.out.println("음악 플레이어는 현재 비활성화 상태 입니다.");
            System.out.println("현재 볼륨 : Off");
            System.out.println("-----------------------");
        }
    }
}

/*
캡슐화
MusicPlayer를 보면 음악 플레이어를 구성하기 우한 속성과 기능이 마치 하나의 캡슐에 쌓여있는 것 같다.
이렇게 속성(필드, 멤버변수)과 기능(메서드)을 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공하는 것을 캡슐화라고 한다.
 */


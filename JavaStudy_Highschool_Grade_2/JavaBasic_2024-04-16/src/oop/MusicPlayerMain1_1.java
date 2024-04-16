package oop;

public class MusicPlayerMain1_1 {
    public static void main(String[] args) {
        MusicPlayerDate date = new MusicPlayerDate();

        // 음악 플레이어 활성화
        on(date);
        // 볼륨 증가
        volumeUP(date);
        // 볼름 증가
        volumeUP(date);
        // 볼륨 감소
        volumeDown(date);
        // 현재 음악 플레이어 상태
        showStatus(date);
        // 음악 플레이어 비활성화
        off(date);
        // 현재 음악 플레이어 상태
        showStatus(date);

    }

    static void on(MusicPlayerDate date) {
        date.isOn = true;
        System.out.println("음악 플레이어가 시작합니다.");
        System.out.println("-----------------------");
    }

    static void off(MusicPlayerDate date) {
        date.isOn = false;
        System.out.println("음악 플레이어가 종료합니다.");
        System.out.println("-----------------------");
    }

    static void volumeUP(MusicPlayerDate date) {
        date.volume++;
        System.out.println("볼륨이 증가 했습니다.");
        System.out.println("현재 볼륨 : "+date.volume);
        System.out.println("-----------------------");
    }

    static void volumeDown(MusicPlayerDate date) {
        date.volume--;
        System.out.println("볼륨이 감소 했습니다.");
        System.out.println("현재 볼륨 : "+date.volume);
        System.out.println("-----------------------");
    }

    static void showStatus(MusicPlayerDate date) {
        if (date.isOn == true) {
            System.out.println("음악 플레이어는 현재 활성하 상태 입니다.");
            System.out.println("현재 볼륨 : "+date.volume);
            System.out.println("-----------------------");
        } else {
            System.out.println("음악 플레이어는 현재 비활성화 상태 입니다.");
            System.out.println("현재 볼륨 : Off");
            System.out.println("-----------------------");
        }
    }
}

// 각각의 기능을 메서드로 만든 덕분에 가각의 기능이 모듈화가 되었다. 따라서 다음과 같은 장점이 생긴다
// 1. 중복 제거 : 로직 중복이 제가되었다. 같은 로직이 필요하면 해당 메서드를 여러번 호출하면 되낟.
// 2. 변경 영향 범위 : 가능을 수정할 때 해당 메서드 내부만 변경하면 된다.
// 3. 메서드 이름 추가 : 메서드 이름을 토앻 코드를 좀 더 쉽게 이해할 수 있다.
// 모듈화 - 레고블럭이랑 비슷함
// 레고에서 필요한 블럭을 가져다 꼽아서 사용할 수 있듯이
// 여기서는 음악 플레이어의 기능이 필요하면 해다 기능을 메서드 호출만으로 손쉽게 사용할 수 있다.
// 이제 음악 플레이어와 관련된 메서드를 조립해서 프로그램을 작성할 수 있다.

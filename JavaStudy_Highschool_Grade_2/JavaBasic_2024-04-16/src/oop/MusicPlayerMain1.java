package oop;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        MusicPlayerDate MPD = new MusicPlayerDate();

        // 음악 플레이어 키기
        MPD.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        // 볼륨 증가
        MPD.volume++;
        System.out.println("현재 볼륨 : "+MPD.volume);

        // 볼륨 증가
        MPD.volume++;
        System.out.println("현재 볼륨 : "+MPD.volume);

        // 볼륨 증가
        MPD.volume++;
        System.out.println("현재 볼륨 : "+MPD.volume);

        // 볼륨 감소
        MPD.volume--;
        System.out.println("현재 볼륨 : "+MPD.volume);

        // 볼륨 감소
        MPD.volume--;
        System.out.println("현재 볼륨 : "+MPD.volume);

        // 볼륨 감소
        MPD.volume--;
        System.out.println("현재 볼륨 : "+MPD.volume);

        // 음악 플레이어 상태
        if (MPD.isOn) {
            System.out.println("음악 플레이어 On, 볼륨 : "+MPD.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        // 음악 플레이어 끄기
        MPD.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}

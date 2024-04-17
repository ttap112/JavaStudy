package oop;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        // 음악 플레이어 활성화
        player.on();
        // 볼륨 증가
        player.volumeUP();
        // 볼름 증가
        player.volumeUP();
        // 볼륨 감소
        player.volumeDown();
        // 현재 음악 플레이어 상태
        player.showStatus();
        // 음악 플레이어 비활성화
        player.off();
        // 현재 음악 플레이어 상태
        player.showStatus();

    }
}


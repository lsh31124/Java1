package oop1;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    void on () {
        isOn = true;
        System.out.println("음악 플레이어가 시작합니다");

    }

    void off () {
        isOn = false;
        System.out.println("음악 플레이어가 종료되었습니다.");

    }

    void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨"+ volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("음악 갑소"+ volume);
    }

    void showStatus() {
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨" + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}

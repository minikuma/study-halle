package me.minikuma.week8;

/**
 * Created by wminikuma@gmail.com on 2021/01/05
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class Audio implements RemoteControl {

    private int volume; // 클래스 필드

    // 인터페이스에서 정의한 실체 메소드
    @Override
    public void turnOn() {
        System.out.println("오디를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("오디오를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 오디오 볼륨: " + volume);
    }
}

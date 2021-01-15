package me.minikuma.week8;

/**
 * Created by wminikuma@gmail.com on 2021/01/05
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class SmartTelevision implements RemoteControl, Searchable {

    private int volume; // 클래스 필드

    // RemoteControl 인터페이스에서 정의한 실체 메소드
    @Override
    public void turnOn() {
        System.out.println("Smart TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart TV를 끕니다.");
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
        System.out.println("현재 Smart TV 볼륨: " + volume);
    }

    // Searchable 인터페이스에서 정의한 실체 메소드
    @Override
    public void search(String url) {
        System.out.println(url + " 을 검색합니다.");
    }
}

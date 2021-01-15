package me.minikuma.week8;

/**
 * Created by wminikuma@gmail.com on 2021/01/04
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public interface RemoteControl {
    // 상수 필드
    int MAX_VOLUME = 30;
    int MIN_VOLUME = 0;

    // 추상 메소드
    void turnOn();
    void turnOff();
    void setVolume(int volume);
}

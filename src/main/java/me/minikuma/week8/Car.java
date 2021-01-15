package me.minikuma.week8;

/**
 * Created by wminikuma@gmail.com on 2021/01/06
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class Car {
    // 인터페이스 타입을 매개변수로 하는 메소드 선언
    public void setTire(Tire tire) {
        tire.roll();
    }
}

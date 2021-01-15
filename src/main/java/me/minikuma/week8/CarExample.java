package me.minikuma.week8;

/**
 * Created by wminikuma@gmail.com on 2021/01/06
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();
        KumhoTire kumhoTire = new KumhoTire();
        car.setTire(kumhoTire);
    }
}

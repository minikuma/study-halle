package me.minikuma.week6;

/**
 * Created by wminikuma@gmail.com on 2020/12/23
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class ChildOverriding extends ParentOverriding {
    public ChildOverriding() {
        System.out.println("ChildOverriding 생성자");
    }
    // 메소드 오버라이딩
    public void printName() {
        System.out.println("ChildOverriding printName()"); // 자식 클래스에서 재 정의
    }
}

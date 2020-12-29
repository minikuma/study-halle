package me.minikuma.weak6;

/**
 * Created by wminikuma@gmail.com on 2020/12/22
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=======================");
        Parent p = new Parent();
        p.printName();
        System.out.println("=======================");
        Child c = new Child();
        c.printName();
        System.out.println("=======================");
        // 다운 캐스팅
        Parent p1 = new Child();
        p1.printName();
        System.out.println("=======================");
    }
}

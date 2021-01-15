package me.minikuma.week8;

/**
 * Created by wminikuma@gmail.com on 2021/01/04
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class MyController {
    public static void main(String[] args) {
        ImplementationC i = new ImplementationC();

        InterfaceA a = i;
        a.methodA();
        System.out.println("-----------------------------");

        InterfaceB b = i;
        b.methodB();
        System.out.println("-----------------------------");

        InterfaceC c = i;
        c.methodA();
        c.methodB();
        c.methodC();
    }
}

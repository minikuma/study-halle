package me.minikuma.week10;

import java.util.concurrent.locks.Lock;

/**
 * Created by wminikuma@gmail.com on 2021/01/22
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class MyClass extends Thread {
    private String name;
    private MyObject myObj;

    public MyClass(MyObject obj, String n) {
        this.name = n;
        this.myObj = obj;
    }

    @Override
    public void run() {
        myObj.foo(name);
    }
}
class MyObject {
    public void foo(String name) {
        synchronized (this) {
            try {
                System.out.println("Thread " + name + ".foo(): starting");
                Thread.sleep(3000);
                System.out.println("Thread " + name + ".foo(): ending");
            } catch (InterruptedException exc) {
                System.out.println("Thread " + name + ": interrupted.");
            }
        }
    }
}
class Test {
    public static void main(String[] args) {
//        MyObject obj1 = new MyObject();
//        MyObject obj2 = new MyObject();
//        new MyClass(obj1, "1").start();
//        new MyClass(obj2, "2").start();
        MyObject obj = new MyObject();
        new MyClass(obj, "1").start();
        new MyClass(obj, "2").start();
    }
}

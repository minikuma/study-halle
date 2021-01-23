package me.minikuma.week10;

/**
 * Created by wminikuma@gmail.com on 2021/01/21
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class MainThread {

    static long startTime = 0;

    public static void main(String[] args) {
        // 메인 스레드 생성됨
        Thread1 t1 = new Thread1(); // Thread1 스레드 생성
        Thread2 t2 = new Thread2(); // Thread2 스레드 생성
        startTime = System.currentTimeMillis();
        t1.start();
        t2.start();
    }
}

class Thread1 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print(new String("-"));
        }
        System.out.println();
        System.out.println("A 소요 시간: " + (System.currentTimeMillis() - MainThread.startTime));
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print(new String("*"));
        }
        System.out.println();
        System.out.println("B 소요 시간: " + (System.currentTimeMillis() - MainThread.startTime));
    }
}

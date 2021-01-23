package me.minikuma.week10;

/**
 * Created by wminikuma@gmail.com on 2021/01/21
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class ThreadExample extends Thread {

    int count = 0;

    public void run() {
        System.out.println("Thread start....");
        try {
            while (count < 5) {
                Thread.sleep(500);
                System.out.println("In Thread, count is " + count);
                count++;
            }
        } catch (InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("Thread terminating.");
    }

    public static void main(String[] args) {
        ThreadExample instance = new ThreadExample();
        instance.start();

        while (instance.count != 5) {
            try {
                Thread.sleep(250);
            } catch (InterruptedException exc) {
                exc.printStackTrace();;
            }
        }
    }
}

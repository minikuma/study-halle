package me.minikuma.week10;

/**
 * Created by wminikuma@gmail.com on 2021/01/21
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class RunnableThreadExample implements Runnable {

    public int count = 0;

    @Override
    public void run() {
        System.out.println("Runnable Thread start....");
        try {
            while (count < 5) {
                Thread.sleep(500);
                System.out.println("In Thread, count is " + count);
                count++;
            }
        } catch (InterruptedException exc) {
            System.out.println("Runnable Thread interrupted.");
        }
        System.out.println("Runnable Thread terminating.");
    }

    public static void main(String[] args) {
        RunnableThreadExample instance = new RunnableThreadExample();
        Thread thread = new Thread(instance);
        thread.start();

        while (instance.count != 5) {
            try {
                Thread.sleep(250);
            } catch (InterruptedException exc) {
                exc.printStackTrace();
            }
        }
    }
}

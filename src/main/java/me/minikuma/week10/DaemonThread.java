package me.minikuma.week10;

/**
 * Created by wminikuma@gmail.com on 2021/01/21
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class DaemonThread implements Runnable {

    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread t = new Thread(new DaemonThread());
        t.setDaemon(true); // 데몬 스레드
        t.start();

        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            System.out.println(i);
            if (i == 5) autoSave = true;
        }
        System.out.println("프로그램을 종료합니다.");
    }


    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {

            }
            if (autoSave) autoSave();
        }
    }

    private void autoSave() {
        System.out.println("자동 저장 되었습니다.");
    }
}

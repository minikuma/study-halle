package me.minikuma.week10;

import javax.swing.*;

/**
 * Created by wminikuma@gmail.com on 2021/01/21
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class Blocking {
    public static void main(String[] args) {
        BlockingThread bt = new BlockingThread();
        bt.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력 하신 값은 " + input + " 입니다.");
    }
}

class BlockingThread extends Thread {
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

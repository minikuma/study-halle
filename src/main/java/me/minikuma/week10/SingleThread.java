package me.minikuma.week10;

/**
 * Created by wminikuma@gmail.com on 2021/01/21
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class SingleThread {

    static long startTime = 0;

    public static void main(String[] args) {

        startTime = System.currentTimeMillis();

        // A
        for (int i = 0; i < 100; i++) {
            System.out.print(new String("-"));
        }

        // B
        for (int j = 0; j < 100; j++) {
            System.out.print(new String("*"));
        }

        System.out.println();

        System.out.println("총 소요시간(A+B): " + (System.currentTimeMillis() - startTime));
    }
}

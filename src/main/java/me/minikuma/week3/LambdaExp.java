package me.minikuma.week3;

public class LambdaExp {
    public static void main(String[] args) {
        System.out.println("Runnable Test");

        // 익명 클래스
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("익명 클래스 구현 완료");
            }
        };

        // 람다 표현식
        Runnable r2 = () -> System.out.println("람다 표현식으로 구현 완료");

        // Run
        r1.run();
        r2.run();
    }
}

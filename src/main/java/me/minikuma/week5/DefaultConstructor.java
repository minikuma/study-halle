package me.minikuma.week5;

/**
 * Created by wminikuma@gmail.com on 2020/12/21
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class DefaultConstructor {
    int x;
    int y;
    int z = 0;

    {
        System.out.println("init block");
        if (x > 1) {
            y = 3;
        }
    }

    public DefaultConstructor(int x) {
        System.out.println("constructor");
        this.x = x;
    }

    public static void main(String[] args) {
        DefaultConstructor df = new DefaultConstructor(3);
        System.out.println("x: " + df.x); // 3
        System.out.println("y: " + df.y); // 0
        System.out.println("z: " + df.z); // 0
    }
}

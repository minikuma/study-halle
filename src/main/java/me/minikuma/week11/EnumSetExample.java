package me.minikuma.week11;

import java.util.EnumSet;

/**
 * Created by wminikuma@gmail.com on 2021/01/28
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */

enum Color {
    RED, YELLOW, GREEN, BLUE, BLACK, WHITE
}
public class EnumSetExample {
    public static void main(String[] args) {
        System.out.println(EnumSet.allOf(Color.class));
        System.out.println(EnumSet.noneOf(Color.class));
        System.out.println(EnumSet.range(Color.YELLOW, Color.BLUE));
        System.out.println(EnumSet.complementOf(EnumSet.of(Color.BLACK, Color.WHITE)));
        System.out.println(EnumSet.copyOf(EnumSet.of(Color.BLACK, Color.WHITE)));

    }
}

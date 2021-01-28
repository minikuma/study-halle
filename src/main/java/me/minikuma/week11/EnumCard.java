package me.minikuma.week11;

/**
 * Created by wminikuma@gmail.com on 2021/01/27
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class EnumCard {
    enum Kind { CLOVER, HEART, DIAMOND, SPADE }
    enum Value { TWO, THREE, FOUR }

    public static void main(String[] args) {
        System.out.println(Kind.CLOVER == Kind.DIAMOND);
    }
}

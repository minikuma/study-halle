package me.minikuma.week11;

/**
 * Created by wminikuma@gmail.com on 2021/01/27
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class Card {
    public static final int CLOVER = 0;
    public static final int HEART = 1;
    public static final int DIAMOND = 2;
    public static final int SPADE = 3;

    public static final int TWO = 0;
    public static final int THREE = 1;
    public static final int FOUR = 2;

    public static void main(String[] args) {
        System.out.println(Card.CLOVER == Card.TWO);
    }
}

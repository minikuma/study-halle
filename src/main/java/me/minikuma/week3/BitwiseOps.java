package me.minikuma.week3;

/**
 * 비트 연산자
 */
public class BitwiseOps {
    public static void main(String[] args) {
        // & 연산
        int value1 = 6;
        int value2 = 5;
        int result = value1 & value2;
        System.out.println("result = " + result);
        // ~ 연산
        int j = ~1; // int 는 8 바이트 = 32 bit => 0001 -> 1110
        byte b = ~1; // byte 는 8 bit = 0000 0001 -> 1111 1110
        System.out.println("j = " + j + " | " + "b = " + b);
    }
}

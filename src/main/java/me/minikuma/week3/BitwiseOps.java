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
        int i = 1;  // int 는 8바이트 = 32 bit (1의 보수) 0001 -> 1110 (1의 보수) + 1 = 1111
        int j = ~1; // -2
        int a = 1;  // 8 bit (1의 보수)
        byte b = ~1; // -2
        System.out.println("j = " + j + " | " + "b = " + b);

    }
}

package me.minikuma.week3;

public class AssignmentOps {
    public static void main(String[] args) {
        int a = 10;
        int b = -1;
        // 대입 연산
        System.out.println("대입 연산");
        System.out.println("a: " + a + " : " + "b: " + b);

        // 산술 연산 + 대입 연산
        System.out.println("산술 연산 + 대입 연산");
        System.out.println("(a += 2) " + (a += 2));
        System.out.println("(a -= 3) " + (a += 3));
        System.out.println("(a *= 2) " + (a *= 2));
        System.out.println("(a /= 2) " + (a /= 2));
        System.out.println("(a %= 3) " + (a /= 3));

        // 비트 연산 + 대입 연산
        System.out.println("비트 연산 + 대입 연산");
        System.out.println("(a &= 1) " + (a &= 1));
        System.out.println("(a |= 0) " + (a &= 0));
        System.out.println("(a ^= 1) " + (a &= 0));

        // 시프트 연산 + 대입 연산
        System.out.println("시트트 연산 + 대입 연산");
        System.out.println("(b <<= 3) " + (b <<= 1));
        System.out.println("(b >>= 4) " + (b >>= 1));
        System.out.println("(b >>>= 2) " + (b >>>= 1));
    }
}

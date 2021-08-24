package me.minikuma.week3;

public class AssignmentOps {
    public static void main(String[] args) {
        int a = 10;

        // 대입 연산
        System.out.println("a: " + a);

        // 산술 연산 + 대입 연산
        System.out.println("산술 연산 + 대입 연산");
        System.out.println("(a += 2) " + (a += 2));
        System.out.println("(a -= 3) " + (a += 3));
        System.out.println("(a *= 2) " + (a *= 2));
        System.out.println("(a /= 2) " + (a /= 2));
        System.out.println("(a %= 3) " + (a /= 3));

        // 비트 연산 + 대입 연산
        System.out.println("비트 연산 + 대입 연산");
        System.out.println("(a &= 2) " + (a &= 2));
        System.out.println("(a |= 3) " + (a &= 3));
        System.out.println("(a ^= 4) " + (a &= 4));

        // 시프트 연산 + 대입 연산
        System.out.println("시트트 연산 + 대입 연산");
        System.out.println("(a <<= 3) " + (a <<= 3));
        System.out.println("(a >>= 4) " + (a >>= 4));
        System.out.println("(a >>>= 2) " + (a >>>= 2));

    }
}

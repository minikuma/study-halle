package me.minikuma.week3;

import java.util.Random;

/**
 *  산술 연산자
 */

public class MathOps {
    public static void main(String[] args) {
        Random rand = new Random(47);
        System.out.println("==========Integer Test============");

        // integer test
        int i, j, k;
        j = rand.nextInt(100) + 1;
        System.out.println("j = " + j);
        k = rand.nextInt(100) + 1;
        System.out.println("k = " + k);
        i = j + k;
        System.out.println("j + k = " + i);
        i = j - k;
        System.out.println("j - k = " + i);
        i = j * k;
        System.out.println("j * k = " + i);
        i = j / k;
        System.out.println("j / k = " + i);
        i = j % k;
        System.out.println("j % k = " + i);
        System.out.println("==========Float Test=============");

        // float test
        float u, v, w;
        v = rand.nextFloat();
        System.out.println("v = " + v);
        w = rand.nextFloat();
        System.out.println("w = " + w);
        u = v + w;
        System.out.println("v + w = " + u);
        u = v - w;
        System.out.println("v - w = " + u);
        u = v * w;
        System.out.println("v * w = " + u);
        u = v / w;
        System.out.println("v / w = " + u);
        u = v % w;
        System.out.println("v % w = " + u);
        System.out.println("=================================");
    }
}

package me.minikuma.week3;

public class ShiftOps {
    public static void main(String[] args) {
        // a << b: 2 << 3 -> 16
        System.out.println("a << b (2 << 3)= " + (2 << 3));

        // a >> b: 16 >> 3 -> 2
        System.out.println("a >> b (16 >> 3)= " + (16 >> 3));

        // a >> b: -16 >> 3 -> -2
        System.out.println("a >> b (-16 >> 3)= " + (-16 >> 3));

        // a >>> b: -16 >>> 3 -> 536870910
        System.out.println("a >>> b (-16 >>> 3)= " + (-16 >>> 3));
    }
}

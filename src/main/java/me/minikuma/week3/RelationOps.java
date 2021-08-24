package me.minikuma.week3;

public class RelationOps {
    public static void main(String[] args) {
        int a1 = 1, b1 = 1;
        int a2 = 1, b2 = -1;

        String s1 = "good";
        String s2 = "boy";

        String s3 = "good";
        String s4 = "good";

        System.out.println("===Primitive Type===");
        System.out.println("========Equal=======");
        System.out.println("a1 == b1: "  + (a1==b1));
        System.out.println("a2 == b2: "  + (a2==b2));

        System.out.println("=====Not Equal======");
        System.out.println("a1 != b1: "  + (a1!=b1));
        System.out.println("a2 != b2: "  + (a2!=b2));

        System.out.println("======Relation======");
        System.out.println("a1 > b1 (왼쪽 값 큼): "  + (a1 > b1));
        System.out.println("a2 >= b2 (왼쪽 값 같거나 큼): "  + (a2 >= b2));

        System.out.println("a1 < b1 (오른쪽 값 큼): "  + (a1 < b1));
        System.out.println("a2 <= b2 (오른쪽 값 같거나 큼): "  + (a2 <= b2));

        System.out.println("===Reference Type===");
        System.out.println("========Equal=======");
        System.out.println("s1 == s2 (주소 비교): "  + (s1==s2));
        System.out.println("s1.equals(s2) (값 비교): "  + (s1.equals(s2)));
        System.out.println("s3 == s4 (주소 비교): "  + (s3==s4));
        System.out.println("s3.equals(s4) (값 비교): "  + (s4.equals(s4)));
    }
}

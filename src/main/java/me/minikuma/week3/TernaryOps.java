package me.minikuma.week3;

public class TernaryOps {
    public static void main(String[] args) {
        int num = 8;
        String msg1 = "";
        String msg2 = "";

        if (num > 10) {
            msg1 = "Number is greater than 10";
        } else {
            msg1 = "Number is less than or equal to 10";
        }
        // 삼항 연산자
        msg2 = num > 10 ? "Number is greater than 10" : "Number is less than or equal to 10";

        System.out.println("Default msg: " + msg1);
        System.out.println("Ternary msg: " + msg2);
    }
}

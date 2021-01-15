package me.minikuma.week9;

import java.util.Arrays;

/**
 * Created by wminikuma@gmail.com on 2021/01/14
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(10000);
        System.out.println("예금액: " + account.getBalance());

        try {
            account.withDraw(30000);
        } catch (Exception e) {
            String message = e.getMessage();
            System.out.println(message);
            e.printStackTrace();
        }
    }
}

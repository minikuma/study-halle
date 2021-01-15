package me.minikuma.week9;

import java.io.PrintStream;

/**
 * Created by wminikuma@gmail.com on 2021/01/14
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class BalanceInsufficientException extends Exception {
    public BalanceInsufficientException() { }
    public BalanceInsufficientException(String message) {
        super(message);
    }
//
//    @Override
//    public void printStackTrace(PrintStream s) {
//        super.printStackTrace(s);
//    }
}

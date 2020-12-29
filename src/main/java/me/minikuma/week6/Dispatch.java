package me.minikuma.week6;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wminikuma@gmail.com on 2020/12/23
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class Dispatch {
    static abstract class SNS {
        abstract void send();
    }

    static class Instagram extends SNS {
        @Override
        void send() {
            System.out.println("Upload Instagram");
        }
    }

    static class Facebook extends SNS {
        @Override
        void send() {
            System.out.println("Upload Facebook");
        }
    }

    public static void main(String[] args) {
        SNS sns = new Facebook();
        sns.send();
    }
}

package me.minikuma.week7;

import static java.lang.Math.PI;

/**
 * Created by wminikuma@gmail.com on 2020/12/31
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class PackageExample {
    public static void main(String[] args) {
        Double pi = Math.PI;
        Double importedPi = PI;

        System.out.println("PI: " + pi);
        System.out.println("static import PI: " + importedPi);
        System.out.println("external class: " + me.minikuma.week7.ExternalPI.EXTERNAL_PI);
    }
}

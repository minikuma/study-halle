package me.minikuma.week11;

import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.EnumSet;
import java.util.Set;
import java.util.TreeSet;


/**
 * Created by wminikuma@gmail.com on 2021/01/28
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */

enum Explore { HERE, THERE }

public class Reflection {

    public static Set<String> analyze(Class<?> enumClass) {
        System.out.println("-----Analyzing " + enumClass + "------");
        System.out.println("Interface: ");
        for (Type t : enumClass.getGenericInterfaces()) {
            System.out.print(t);
        }
        System.out.println("Base: "  + enumClass.getSuperclass());
        System.out.print("Methods: ");
        Set<String> methods = new TreeSet<>();
        for (Method m : enumClass.getMethods()) {
            methods.add(m.getName());
        }
        System.out.println(methods);
        return methods;
    }

    public static void main(String[] args) throws IOException {
        Set<String> exploreMethods = analyze(Explore.class);
        Set<String> enumMethods = analyze(Enum.class);
    }
}

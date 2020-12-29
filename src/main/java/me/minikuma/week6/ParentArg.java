package me.minikuma.week6;

/**
 * Created by wminikuma@gmail.com on 2020/12/22
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class ParentArg {
    public ParentArg(String name) {
        System.out.println("Parent Arg("+name+") 생성자");
    }
    public void printName() {
        System.out.println("printName() - ParentArg");
    }
}

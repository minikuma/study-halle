package me.minikuma.week6;

/**
 * Created by wminikuma@gmail.com on 2020/12/22
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class ChildArg extends ParentArg {
    public ChildArg() {
        super("ChildArg");
        System.out.println("매개변수가 있는 자식 생성자");
    }
}

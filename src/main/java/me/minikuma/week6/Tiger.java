package me.minikuma.week6;

/**
 * Created by wminikuma@gmail.com on 2020/12/24
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class Tiger extends Animal {
    @Override
    public void feed() {
        System.out.println("호랑이가 먹이를 먹는다.");
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.feed();
        tiger.breath();
//        Animal animal = new Animal();
    }
}

package me.minikuma.week9;

/**
 * Created by wminikuma@gmail.com on 2021/01/13
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class Print {
    public String strongStringPrint(String name) {

        String str;

        try {
            StringBuilder sb = new StringBuilder();
            sb.append("*");
            sb.append(name);
            sb.append("*");
            str = "try pass";
            System.out.println(str);
            throw new Exception();
        } catch (Exception e) {
            str = "catch pass";
            System.out.println(str);
            return str;
        } finally {
            str = "finally pass";
            System.out.println(str);
            return "finally";
        }
    }
    public static void main(String[] args) {
        Print p = new Print();
        System.out.println("정상 결과: " + p.strongStringPrint("study"));
    }
}
package me.minikuma.weak5;

/**
 * Created by wminikuma@gmail.com on 2020/12/14
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class ThisKeyword {
    private int id;
    private String name;

    public ThisKeyword(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ThisKeyword returnInstance() {
        return this;
    }

    public static void main(String[] args) {
        ThisKeyword t = new ThisKeyword(5, "Good");
        System.out.println("t = " + t);
        System.out.println("this = " + t.returnInstance());
        t.setId(5);
        System.out.println("t.getId() = " + t.getId()); // 5
        t.returnInstance().setId(7);
        System.out.println("t.returnInstance().getId() = " + t.returnInstance().getId()); // 7
    }
}

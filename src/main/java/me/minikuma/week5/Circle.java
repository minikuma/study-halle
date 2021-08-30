package me.minikuma.week5;

public class Circle {
    // 인스턴스 필드
    public double r;

    // 생성자
    public Circle(double r) {
        this.r = r;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(100);
        circle.r = 100;
        System.out.println("객체 생성 후 인스턴스 필드에 값 적용 = " + circle.r);
    }
}

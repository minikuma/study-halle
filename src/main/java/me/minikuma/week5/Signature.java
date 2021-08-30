package me.minikuma.week5;

public class Signature {
    static class Circle {
        // 클래스 필드
        public static final double PI = 3.14159;

        // 클래스 메서드
        public static double radiusToDegrees(double radians) {
            return 180 * radians / PI;
        }

        // 인스턴스 필드
        public double r;

        // 생성자 추가
        public Circle(double r) {
            this.r= r;
        }

        // 인스턴스 메서드 (1)
        public double area() {
            return PI * r * r;
        }
        // 인스턴스 메서드 (2)
        public double circumference() {
            return 2 * PI * r;
        }
    }

    public static void main(String[] args) {
        // 클래스 필드 or 메서드는 인스턴스 생성 없이 사용 가능
        System.out.println("클래스 필드 or 메서드 인스턴스 생성 없이 사용");
        double pi = Circle.PI;
        double radiusToDegrees = Circle.radiusToDegrees(5.00);
        System.out.println("pi = " + pi);
        System.out.println("radiusToDegrees = " + radiusToDegrees);

        // 인스턴스 필드 or 메서드는 인스턴스 생성이 필요
        System.out.println("인스턴스 필드 or 메서드 인스턴스 생성이 필요");
        Circle circle = new Circle(10);
        System.out.println("r = " + circle.r);
        double area = circle.area();
        System.out.println("area = " + area);
        double circumference = circle.circumference();
        System.out.println("circumference = " + circumference);
    }
}

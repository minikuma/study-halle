package me.minikuma.weak5;

/**
 * 클래스 접근 제한자 예제
 *   1) abstract
 *   2) final
 *   3) strictfp
 */

public class ModifyClass {

    static abstract class Figure {
        abstract void area(int a, int b);
    }

    static class Rectangle extends Figure {
        @Override
        void area(int a, int b) {
            // a: 가로, b: 세로
            System.out.println("사각형의 넓이는 = " + (a * b));
        }
    }

    static class Triangle extends Figure {
        @Override
        void area(int a, int b) {
            // a: 밑변, b: 높이
            System.out.println("삼각형의 넓이는 = " + ((a * b) / 2));
        }
    }
    /////////////////////////////////////////////////////////////
    static strictfp class StrictFP {
        public double add(double number1, double number2) {
            return number1 + number2;
        }
    }

    static final class FinalClassExample {
        int CAPACITY = 10;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.area(2, 3);
        Triangle triangle = new Triangle();
        triangle.area(2, 3);
        ////////////////////////////////////////
        StrictFP sfp = new StrictFP();
        System.out.println("결과는 = " + sfp.add(10e+10, 6e+08)); //1.006E11
    }
}

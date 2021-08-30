package me.minikuma.week5;

public class Structure {
    // 클래스 변수
    static String classVariable;

    // 인스턴스 변수
    String instanceVariable;
    String constructorVariable;

    // 클래스 초기화 블록
    static {
        classVariable = "instanceVariable";
    }

    // 인스턴스 초기화 블록
    {
        this.instanceVariable = "instanceVariable";
    }

    // 생성자
    public Structure() {
        this.constructorVariable = "constructorVariable";
    }

    // 클래스 메서드
    static void classMethod() {
        System.out.println("클래스 메서드 = " + classVariable);
    }

    // 인스턴스 메서드
    void instanceMethod() {
        System.out.println("인스턴스 메서드 = " + instanceVariable);
    }


    public static void main(String[] args) {
        System.out.println("클래스 변수 = " + classVariable);
        classMethod();
        Structure s = new Structure();
        System.out.println("생성자 = " + s.constructorVariable);
        System.out.println("인스턴스 변수 = " + s.instanceVariable);
        s.instanceMethod();
    }
}
